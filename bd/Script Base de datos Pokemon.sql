create database if not exists pokemonoroyplata;

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
    num_pokedex INT PRIMARY key,
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

    id_objeto INT PRIMARY key auto_increment,
    nom_objeto VARCHAR(255) NOT NULL,
    precio INT,
    descripcion VARCHAR(255) NOT NULL,
    categoria_objeto enum('OBJETO', 'BOTIQUIN', 'POKEBALL')
    
);

CREATE TABLE IF NOT exists entrenador (
    id_entrenador INT PRIMARY key auto_increment,
    nom_entrenador VARCHAR(50) NOT NULL,
    /*datos personales*/
    edad INT not null,
    genero CHAR(1) NOT NULL CHECK (genero IN ('H', 'M', 'N')),
    /*datos de juego*/
    pokecuartos INT not null,
    contrasenia varchar(255)
);

/* Tabla bolsa */
CREATE TABLE IF NOT exists bolsa (
    id_entrenador INT,
    id_objeto INT default 15,
    cantidad_objetos INT not null default 5,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto),
    primary key (id_entrenador, id_objeto)
);

create table IF NOT exists estado(

	id_estado int primary key auto_increment,
	nombre varchar(50),
	tipo_estado enum ('PERSISTENTE', 'TEMPORAL', 'OTRO_ESTADO')
	
);

CREATE TABLE IF NOT exists movimiento (

    id_movimiento INT PRIMARY key auto_increment,
    nombre VARCHAR(50) NOT NULL,
    id_tipo_movimiento int NOT NULL,
    descripcion text,
    foreign key (id_tipo_movimiento) references tipo(id_tipo)
);


CREATE TABLE IF NOT exists pokemon(

    id_pokemon INT primary key auto_increment,
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
    sexo ENUM('H','M','N'),
    experiencia int default 0,
    /* conexiones*/
	id_objeto INT default 1,
    id_estado int default 11,
    foreign key (num_pokedex) references pokedex(num_pokedex),
    foreign key (id_objeto) references objeto(id_objeto),
    foreign key (id_estado) references estado(id_estado)
);

create table if not exists pokemon_movimiento(

    id_pokemon int,
	id_movimiento Int not null default 96,
    foreign key (id_movimiento) references movimiento(id_movimiento),
    foreign key (id_pokemon) references pokemon(id_pokemon),
    primary key (id_pokemon, id_movimiento)
    
);

CREATE TABLE IF NOT EXISTS equipo_pokemon (

    id_entrenador INT,
    id_pokemon INT,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon),
    PRIMARY KEY (id_entrenador, id_pokemon)
    
);

create table if not exists pc_pokemon (
	
    id_entrenador INT,
    id_pokemon INT,
    activo boolean not null default false,
    foreign key (id_pokemon) references pokemon(id_pokemon),
    foreign key (id_entrenador) references entrenador(id_entrenador),
    primary key (id_entrenador, id_pokemon)
);

create table if not exists tienda (
  
  id_objeto INT not null,
  cantidad_objetos INT not null default 1000,
  foreign key (id_objeto) references objeto(id_objeto)
);

create table if not exists movimientos_ataques(

	id_ataque int primary key auto_increment,
	id_movimiento int,
	potencia int,
	tipo_ataque enum ('FISICO', 'ESPECIAL'),
	foreign key (id_movimiento) references movimiento(id_movimiento)
	
);	

create table if not exists movimientos_estados(

	id_estados int primary key auto_increment,
	id_movimiento int,
	id_estado_aplicar int,
	num_turnos int,
	foreign key (id_movimiento) references movimiento(id_movimiento),
	foreign key (id_estado_aplicar) references estado(id_estado)
);

create table IF NOT exists movimientos_mejoras(

	id_mejoras int primary key auto_increment,
	id_movimiento int, 
	estadistica_mejorada enum('VITALIDAD', 'ATAQUE', 'DEFENSA', 'ATAQUE_ESPECIAL', 'DEFENSA_ESPECIAL', 'VELOCIDAD'),
    cantidad_mejora int,
    num_turnos INT,
    foreign key (id_movimiento) references movimiento(id_movimiento)
);