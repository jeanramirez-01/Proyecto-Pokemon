/* BASE DE DATOS DE POKEMON */
/* TABLA POKEMON */


/*TABLA DE TIPOS */
CREATE TABLE IF NOT exists tipo (
    id_tipo INT PRIMARY key auto_increment,
    nombre VARCHAR(50) not NULL,
    indice INT not null
);
/*TABLA POKEDEX*/
CREATE table IF NOT EXISTS pokedex (
    num_pokedex INT PRIMARY KEY,
    nom_pokemon VARCHAR(50) not null,
    /*conexion*/
    tipo_primario INT not null,
    tipo_secundario INT,
    descripcion varchar(255),
    vitalidad_base INT,
    ataque_base INT,
    defensa_base INT,
    ataque_especial_base INT,
    defensa_especial_base INT,
    velocidad_base INT,
    nivel_evolutivo INT,
    id_evolucion_pokemon Int,
    ruta_sprite varchar(255),
    ruta_cry varchar(255),
    FOREIGN KEY (tipo_primario) REFERENCES Tipo(id_tipo),
    FOREIGN KEY (tipo_secundario) REFERENCES Tipo(id_tipo),
   	foreign key (id_evolucion_pokemon) references pokedex(num_pokedex)
);


/* Tabla objeto */
CREATE TABLE IF NOT exists objeto (
    id_objeto INT PRIMARY KEY,
    nom_objeto VARCHAR(255) NOT NULL,
    precio INT NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    /*conexion*/
    categoria_objeto enum('OBJETO', 'BOTIQUIN', 'POKEBALL') not null,
    /*stats que mejora o no*/
    vitalidad INT,
    ataque INT,
    defensa INT,
    ataque_especial INT,
    defensa_especial INT,
    estamina INT,
    velocidad INT
);

CREATE TABLE IF NOT exists entrenador (
    id_entrenador INT PRIMARY KEY,
    nom_entrenador VARCHAR(50) NOT NULL,
    /*datos personales*/
    edad INT not null,
    genero VARCHAR(1) NOT NULL CHECK (genero IN ('H', 'M', 'N')),
    /*datos de juego*/
    pokecuartos INT not null
);

/* Tabla lider_gimnasio */
create table IF NOT exists lider_gimnasio (
    id_lider INT primary key,
    nombre_lider VARCHAR(50) not null,
    tipo_lider INT not null,
    nivel_lider INT not null,
    foreign key (tipo_lider) references tipo(id_tipo),
    foreign key (id_lider) references entrenador(id_entrenador)
    
);

/* Tabla bolsa */
CREATE TABLE IF NOT exists bolsa (
    id_bolsa INT PRIMARY KEY,
    id_entrenador INT NOT NULL,
    id_objeto INT NOT NULL,
    cantidad_objetos INT NOT NULL,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto)
);

create table IF NOT exists estado(

	id_estado int primary key,
	nombre int,
	tipo_estado enum ('PERSISTENTE', 'TEMPORAL', 'OTRO_ESTADO')
	
);

CREATE TABLE IF NOT exists movimiento (

    id_movimiento INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    id_tipo_movimiento int NOT NULL,
    descripcion text not null,
    foreign key (id_tipo_movimiento) references tipo(id_tipo)
);

CREATE TABLE IF NOT exists pokemon_movimiento(

    id_pokemon_movimiento int PRIMARY KEY,
    /* conexion*/
    id_movimiento Int NOT null,
    foreign key (id_movimiento) references movimiento(id_movimiento)
    
);

CREATE TABLE IF NOT exists pokemon(

    id_pokemon INT PRIMARY KEY,
    num_pokedex int not null,
    mote VARCHAR(100),
    /* estadisticas */
    vitalidad INT,
    ataque INT,
    defensa INT,
    ataque_especial INT,
    defensa_especial INT,
    velocidad INT,
    estamina INT default 100,
    nivel INT default 1,
    fertilidad INT default 5,
    sexo ENUM('H', 'M', 'N'),
    experiencia int,
    /* conexiones*/
    id_objeto INT,
    id_pokemon_movimiento INT,
    id_estado int,
    FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto),
    FOREIGN KEY (id_pokemon_movimiento) REFERENCES pokemon_movimiento(id_pokemon_movimiento),
    foreign key (id_estado) references estado(id_estado)
);

CREATE TABLE IF NOT exists equipo (
    id_equipo INT PRIMARY KEY,
    id_entrenador INT NOT NULL,
    id_pokemon INT NOT NULL,
    num_slot INT NOT NULL,
    activo BOOLEAN NOT NULL,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon)
);


CREATE TABLE IF NOT exists pc_pokemon (
    id_pc_pokemon INT NOT NULL,
    id_entrenador INT NOT NULL,
    id_pokemon INT,
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon),
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador)
);

CREATE TABLE IF NOT exists tienda (
  
  id_objeto INT NOT NULL,
  cantidad_objetos INT NOT NULL,
  FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto)
);

create table IF NOT exists movimientos_ataques(

	id_ataque int primary key,
	id_movimiento int,
	potencia int,
	foreign key (id_movimiento) references movimiento(id_movimiento)
	
);	

create table IF NOT exists movimientos_estados(

	id_estados int primary key,
	id_movimiento int,
	id_estado_aplicar int,
	num_turnos int,
	foreign key (id_movimiento) references movimiento(id_movimiento),
	foreign key (id_estado_aplicar) references estado(id_estado)
);

create table IF NOT exists movimientos_mejoras(

	id_mejoras int primary key,
	id_movimiento int, 
	estadistica_mejorada enum('VITALIDAD', 'ATAQUE', 'DEFENSA', 'ATAQUE_ESPECIAL', 'DEFENSA_ESPECIAL', 'VELOCIDAD'),
    cantidad_mejora double,
    num_turnos INT,
    foreign key (id_movimiento) references movimiento(id_movimiento)
);