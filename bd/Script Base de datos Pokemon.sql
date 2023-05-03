/* BASE DE DATOS DE POKEMON */
/* TABLA POKEMON */


/*TABLA DE TIPOS */
CREATE TABLE Tipo (
    id_tipo INT PRIMARY KEY,
    nombre VARCHAR(50) not NULL,
    indice INT not null
);
/*TABLA POKEDEX*/
CREATE TABLE Pokedex (
    num_pokedex INT PRIMARY KEY,
    nom_pokemon VARCHAR(50) not null,
    /*conexion*/
    tipo_primario INT not null,
    tipo_secundario INT,
    nivel_evolutivo INT,
    id_evolucion_pokemon Int,
    FOREIGN KEY (tipo_primario) REFERENCES Tipo(id_tipo),
    FOREIGN KEY (tipo_secundario) REFERENCES Tipo(id_tipo),
   	foreign key (id_evolucion_pokemon) references pokedex(num_pokedex)
);


/* Tabla objeto */
CREATE TABLE objeto (
    id_objeto INT PRIMARY KEY,
    nom_objeto VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    precio INT NOT NULL,
    /*conexion*/
    categoria_objeto enum('Objeto', 'Botiquin', 'Pokeball') not null,
    /*stats que mejora o no*/
    vitalidad INT,
    ataque INT,
    defensa INT,
    ataque_especial INT,
    defensa_especial INT,
    estamina INT,
    velocidad INT
);

CREATE TABLE entrenador (
    id_entrenador INT PRIMARY KEY,
    nom_entrenador VARCHAR(50) NOT NULL,
    /*datos personales*/
    edad INT not null,
    genero VARCHAR(1) NOT NULL CHECK (genero IN ('H', 'M', 'N')),
    /*datos de juego*/
    pokecuartos INT not null
);

/* Tabla lider_gimnasio */
create table lider_gimnasio (
    id_lider INT primary key,
    nombre_lider VARCHAR(50) not null,
    tipo_lider INT not null,
    nivel_lider INT not null,
    foreign key (tipo_lider) references Tipo(id)
);

/* Tabla bolsa */
CREATE TABLE bolsa (
    id_bolsa INT PRIMARY KEY,
    id_entrenador INT NOT NULL,
    id_objeto INT NOT NULL,
    cantidad_objetos INT NOT NULL,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto)
);


CREATE TABLE pokemon(

    id_pokemon INT PRIMARY KEY,
    id_pokedex int not null,
    mote VARCHAR(100),
    /* estadisticas */
    vitalidad INT NOT NULL,
    ataque INT NOT NULL,
    defensa INT NOT NULL,
    ataque_especial INT NOT NULL,
    defensa_especial INT NOT NULL,
    velocidad INT NOT NULL,
    estamina INT NOT NULL,
    nivel INT default 1 NOT NULL,
    fertilidad INT default 5 not null,
    sexo ENUM('H', 'M', 'N') NOT NULL,
    experiencia int,
    /* conexiones*/
    id_objeto INT NOT NULL,
    id_pokemon_movimiento INT NOT NULL,
    FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto),
    FOREIGN KEY (id_pokemon_movimiento) REFERENCES pokemon_movimiento(id_pokemon_movimiento)
   
);

CREATE TABLE equipo (
    id_equipo INT PRIMARY KEY,
    id_entrenador INT NOT NULL,
    id_pokemon INT NOT NULL,
    num_slot INT NOT NULL,
    activo BOOLEAN NOT NULL,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon)
);



CREATE TABLE movimiento (

    id_movimiento INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    id_tipo_movimiento int NOT NULL,
    descripcion varchar(255) not null,
    foreign key (id_tipo_movimiento) references tipo(id_tipo)
);


CREATE TABLE pokemon_movimiento(

    id_pokemon_movimiento int PRIMARY KEY,
    /* conexion*/
    id_movimiento Int NOT null,
    foreign key (id_movimiento) references movimiento(id_movimiento)
    
);

CREATE TABLE caja_pokemon (
    id_caja INT PRIMARY KEY,
    id_entrenador INT NOT NULL,
    nom_caja VARCHAR(50) NOT NULL,
    capacidad INT NOT NULL,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador)
);

CREATE TABLE pc_pokemon (
    id_pc_pokemon INT NOT NULL,
    id_pokemon INT NOT NULL,
    num_slot INT NOT NULL,
    FOREIGN KEY (id_pc_pokemon) REFERENCES caja_pokemon(id_caja),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon)
);

CREATE TABLE tienda (
  
  id_objeto INT NOT NULL,
  cantidad_objetos INT NOT NULL,
  FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto)
);

create table estado(

	id_estado int primary key,
	nombre int,
	tipo_estado enum ('Persistente', 'Temporal', 'Otro_Estado')
	
);

create table movimientos_ataques(

	id_ataque int primary key,
	id_movimiento int,
	potencia int,
	foreign key (id_movimiento) references movimiento(id_movimiento)
	
);	

create table movimientos_estados(

	id_estados int primary key,
	id_movimiento int,
	id_estado_aplicar int,
	num_turnos int,
	foreign key (id_movimiento) references movimiento(id_movimiento),
	foreign key (id_estado_aplicar) references estado(id_estado)
);

create table movimientos_mejoras(

	id_mejoras int primary key,
	id_movimiento int, 
	estadistica_mejorada enum('Vitalidad', 'Ataque', 'Defensa', 'Ataque_Especial', 'Defensa_Especial', 'Velocidad'),
    cantidad_mejora double,
    num_turnos INT,
    foreign key (id_movimiento) references movimiento(id_movimiento)
);