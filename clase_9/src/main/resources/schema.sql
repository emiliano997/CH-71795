CREATE TABLE cliente (
    id int autoincrement PRIMARY KEY,
    nombre varchar(150) not null,
    apellido varchar(150) not null,
    dni int not null
);

CREATE TABLE domicilio (
    id int autoincrement PRIMARY KEY,
    calle varchar(150) not null,
    numero int not null,
    piso int,
    departamento varchar(50),
    cp varchar(150) not null,
    localidad varchar(150) not null,
    provincia varchar(150) not null,
    client_id int FOREIGN KEY(id)
);