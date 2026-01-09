INSERT INTO usuario (id, nombre, num_tarjeta, pin, saldo) VALUES (1, 'Juan Pérez', 12345678, 1234, 50.75);
INSERT INTO usuario (id, nombre, num_tarjeta, pin, saldo) VALUES (2, 'María López', 87654321, 4321, 120.00);
INSERT INTO usuario (id, nombre, num_tarjeta, pin, saldo) VALUES (3, 'Carlos Ruiz', 11223344, 9876, 0.00);

INSERT INTO estacion (id, nombre, coordenadas, capacidad) VALUES (1, 'Estación Centro', '37.3891,-5.9845', 20);
INSERT INTO estacion (id, nombre, coordenadas, capacidad) VALUES (2, 'Estación Triana', '37.3826,-6.0039', 15);
INSERT INTO estacion (id, nombre, coordenadas, capacidad) VALUES (3, 'Estación Nervión', '37.3833,-5.9732', 25);

INSERT INTO bicicleta (id, marca, modelo, estado, estacion_id) VALUES (1, 'Orbea', 'MX50', 'DISPONIBLE', 1);
INSERT INTO bicicleta (id, marca, modelo, estado, estacion_id) VALUES (2, 'Specialized', 'Sirrus', 'EN_REPARACION', 2);
INSERT INTO bicicleta (id, marca, modelo, estado, estacion_id) VALUES (3, 'Giant', 'Escape 3', 'OCUPADA', 1);

INSERT INTO uso (id, fecha_inicio, fecha_fin, coste, estacion_id, bicicleta_id, usuario_id) VALUES (1, '2024-01-10', '2024-01-10', 1.50, 1, 3, 2);
INSERT INTO uso (id, fecha_inicio, fecha_fin, coste, estacion_id, bicicleta_id, usuario_id) VALUES (2, '2024-01-11', NULL, 0.00, 2, 1, 3);
INSERT INTO uso (id, fecha_inicio, fecha_fin, coste, estacion_id, bicicleta_id, usuario_id) VALUES (3, '2024-01-12', '2024-01-12', 2.20, 1, 2, 1);
