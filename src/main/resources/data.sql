INSERT INTO clientes (nombre, apellido1, apellido2, fechaNacimiento, categoria) VALUES
('Juan', 'Pérez', 'Gómez', '1980-01-15', 'VIP'),
('María', 'López', NULL, '1990-05-23', 'REGULAR'),
('Carlos', 'Sánchez', 'Martínez', '1985-07-30', 'INVITADO');

INSERT INTO locales (nombre, aforo, metrosCuadrados) VALUES
('Local A', 100, 150.5),
('Local B', 200, 300.0),
('Local C', 50, 75.0);

INSERT INTO empleados (apellido1, apellido2, fechaNacimiento, telefono, cargo, local_id) VALUES
('García', 'Fernández', '1990-02-20', 123456789, 'CAMARERO', 1),
('Martínez', 'Rodríguez', '1985-06-15', 987654321, 'SEGURIDAD', 2),
('López', 'González', '1992-11-30', 555555555, 'ENCARGADO', 3);

INSERT INTO registros (cliente_id, local_id) VALUES
(1, 1),
(1, 2),
(2, 2),
(3, 3);