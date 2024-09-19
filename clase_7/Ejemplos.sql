-- SHOW DATABASES -- Mostrar las bases de datos

-- CREATE DATABASE coderhouse; -- Crear base de datos

-- USE db1074714; -- Usar la base de datos

-- Crear tabla
-- CREATE TABLE alumnos (
--  nombre VARCHAR(150) not NULL,
--  apellido VARCHAR(150) NOT NULL,
--  dni INT NOT NULL UNIQUE,
--  legajo INT NOT NULL UNIQUE
-- );

-- Detalles de la tabla
-- DESCRIBE alumnos;

-- Insertar datos 
-- INSERT INTO alumnos (nombre, apellido, dni, legajo) 
-- VALUES ("Juan", "Perez", 12345678, 123), ("Pepe", "Perez", 14354365, 124);

-- INSERT INTO alumnos (nombre, apellido, dni, legajo) 
-- VALUES ("Arturo", "Lopez", 54234312, 119), ("Pepe", "Argento", 68594032, 120);

-- Obtener datos 
-- SELECT * FROM alumnos;
-- SELECT nombre, dni FROM alumnos;

-- Filtrar datos
-- SELECT * FROM alumnos WHERE legajo = 124;
-- SELECT * FROM alumnos WHERE apellido = 'Perez';

-- Selecciona todos los campos de la tabla alumnos donde el nombre sea igual a Juan
-- SELECT * FROM alumnos WHERE nombre = 'Juan';

-- Selecciona todos los campos de la tabla alumnos donde el legajo sea mayor a 120
-- SELECT * FROM alumnos WHERE legajo > 119;

-- Actualizar Tabla 
-- ALTER TABLE alumnos ADD COLUMN fecha_nacimiento VARCHAR(10);

-- Actualizar registros 
-- UPDATE alumnos SET fecha_nacimiento = '01-08-1990' WHERE dni = 12345678;
-- UPDATE alumnos SET fecha_nacimiento = '13-06-1997' WHERE dni = 14354365;
-- UPDATE alumnos SET fecha_nacimiento = '20-03-1991' WHERE dni = 54234312;
-- UPDATE alumnos SET fecha_nacimiento = '19-01-1997' WHERE dni = 68594032;

-- UPDATE alumnos SET nombre = 'Emiliano' WHERE apellido = 'Perez' AND nombre = 'Pepe';

-- Eliminar Registro
-- DELETE FROM alumnos WHERE apellido = 'Argento';

-- Relaciones entre tablas
-- CREATE TABLE nota_alumnos (
--  dni INT NOT NULL,
--  nota INT NOT NULL
-- );

-- INSERT INTO nota_alumnos
-- VALUES (12345678, 8), (14354365, 4), (54234312, 10);

-- SELECT * FROM nota_alumnos;

-- Union entre tablas
-- SELECT * FROM alumnos al INNER JOIN nota_alumnos nota ON al.dni = nota.dni;
-- SELECT al.nombre, al.apellido, al.dni, nota.nota FROM alumnos al INNER JOIN nota_alumnos nota ON al.dni = nota.dni;

-- CREATE TABLE cursos (
--   legajo INT NOT NULL,
--   curso VARCHAR(150) NOT NULL
--  );

-- INSERT INTO cursos 
-- VALUES (123, "Java"), (123, "SQL"), (123, "React"), (124, "Angular"), (124, "Go");

SELECT * FROM alumnos a INNER JOIN cursos c ON a.legajo = c.legajo WHERE a.dni = 12345678;