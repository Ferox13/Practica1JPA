package com.fer.practia1jpa.model.mapper;

import java.lang.reflect.Field;

import org.springframework.stereotype.Component;
@Component
public class GenericMapper {

    // Convertir de DTO a Entity
    public static <D, E> E mapToEntity(D dto, Class<E> entityClass) {
        try {
            E entity = entityClass.getDeclaredConstructor().newInstance();
            mapFields(dto, entity);
            return entity;
        } catch (Exception e) {
            throw new RuntimeException("Error al mapear DTO a Entity", e);
        }
    }

    // Convertir de Entity a DTO
    public static <E, D> D mapToDto(E entity, Class<D> dtoClass) {
        try {
            D dto = dtoClass.getDeclaredConstructor().newInstance();
            mapFields(entity, dto);
            return dto;
        } catch (Exception e) {
            throw new RuntimeException("Error al mapear Entity a DTO", e);
        }
    }

    // Mapeo genérico de campos con el mismo nombre
    private static <S, T> void mapFields(S source, T target) {
        Field[] sourceFields = source.getClass().getDeclaredFields();
        Field[] targetFields = target.getClass().getDeclaredFields();

        for (Field sourceField : sourceFields) {
            sourceField.setAccessible(true);
            for (Field targetField : targetFields) {
                if (sourceField.getName().equals(targetField.getName()) &&
                        sourceField.getType().equals(targetField.getType())) {
                    targetField.setAccessible(true);
                    try {
                        targetField.set(target, sourceField.get(source));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error al copiar campo: " + sourceField.getName(), e);
                    }
                }
            }
        }
    }
}
