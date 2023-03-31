/* BASE DE DATOS DE POKEMON */
/* TABLA POKEMON */
CREATE TABLE pokemon(

	id_pokemon NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    mote VARCHAR2,
    /* estadisticas */
    vitalidad NUMBER NOT NULL,
    ataque NUMBER NOT NULL,
    defensa NUMBER NOT NULL,
    ataque_especial NUMBER NOT NULL,
    defensa_especial NUMBER NOT NULL,
    velocidad NUMBER NOT NULL,
    estamina NUMBER NOT NULL,
    nivel NUMBER NOT NULL,
    fertilidad NUMBER NOT NULL,
    sexo CHAR NOT NULL CHECK (sexo IN ('H','M')),
    /* conexiones*/
    tipo NUMBER NOT NULL,
    objeto NUMBER NOT NULL,
    pokemon_movimiento NUMBER NOT NULL,
    caja NUMBER NOT NULL
    
);

/*TABLA TIPO_POKEMON*/
CREATE TABLE tipo(

    id_tipo NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    debilidades NUMBER NOT NULL
    
);

CREATE TABLE pokemon_movimiento(

    id_pokemon_movimiento NUMBER PRIMARY KEY,
    /* conexion*/
    movimiento NUMBER NOT NULL
    
);

/*TABLAS MOVIMIENTO*/
CREATE TABLE movimiento(
    
    id_movimiento NUMBER PRIMARY KEY,
    /*conexiones*/
    ataque NUMBER NOT NULL,
    estado NUMBER NOT NULL,
    mejora NUMBER NOT NULL

);

/*HERENCIA MOVIMIENTO*/
CREATE TABLE estado(
    
    id_estado NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    turnos NUMBER NOT NULL

);
CREATE TABLE ataque(
    
    id_ataque NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    potencia NUMBER NOT NULL

);
CREATE TABLE mejora(
    
    id_mejora NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    turnos NUMBER NOT NULL

);



/*TABLA ENTRENADOR*/
CREATE TABLE entrenador(

	id_entrenador NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    pokedolares NUMBER NOT NULL,
    /* conexiones*/
    bolsa NUMBER NOT NULL,
    caja NUMBER NOT NULL,
    pokedex NUMBER NOT NULL,
    tienda NUMBER NOT NULL
    
);

/*TABlA LIDER_GIMNASIO*/
CREATE TABLE lider_gimnasio (
    id_lider_gimnasio NUMBER PRIMARY KEY,
    medallas_ganadas NUMBER,
    FOREIGN KEY (id_lider_gimnasio) REFERENCES entrenador(id_entrenador)
    
);

/*TABLA POKEDEX*/
CREATE TABLE pokedex(

	id_pokedex NUMBER PRIMARY KEY,
    pokemon NUMBER NOT NULL
    
);
/*TABLA BOLSA*/
CREATE TABLE bolsa(

    id_bolsa NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
	pokedolares NUMBER NOT NULL,
    espacio NUMBER NOT NULL,
    /* conexiones*/
    objetos NUMBER NOT NULL
    
);
/*TABLA OBJETO*/
CREATE TABLE objeto(
    
	id_objetos NUMBER PRIMARY KEY,
    nombre NUMBER NOT NULL,
    pokedolares NUMBER NOT NULL
    
);
/*TABLA EQUIPO*/
CREATE TABLE equipo(

    id_equipo NUMBER PRIMARY KEY,
    pokemon NUMBER NOT NULL
);

/*TABLA TIENDA(COVA)*/
CREATE TABLE tienda(

    id_tienda NUMBER PRIMARY KEY,
    nombre VARCHAR2 NOT NULL,
    /* conexiones*/
    objetos NUMBER NOT NULL
    
);

/*TABLA CAJA(LUIS PECERA)*/
CREATE TABLE caja(

    id_caja NUMBER PRIMARY KEY,
    nombre NUMBER NOT NULL,
    pokedolares NUMBER NOT NULL,
    /* conexiones*/
    pokemon_entrenamiento NUMBER NOT NULL,
    pokemon_crianza NUMBER NOT NULL
    
);



/*TABLA POKEMON*/
ALTER TABLE pokemon ADD CONSTRAINT fk_tipo FOREIGN KEY (tipo) REFERENCES tipo(id_tipo);
ALTER TABLE pokemon ADD CONSTRAINT fk_objeto FOREIGN KEY (objeto) REFERENCES objeto(id_objetos);
ALTER TABLE pokemon ADD CONSTRAINT fk_pokemon_movimiento FOREIGN KEY (pokemon_movimiento) REFERENCES pokemon_movimiento(id_pokemon_movimiento);
ALTER TABLE pokemon ADD CONSTRAINT fk_caja FOREIGN KEY (caja) REFERENCES caja(id_caja);

/*TABLA TIPO_POKEMON*/
ALTER TABLE tipo ADD CONSTRAINT fk_debilidades FOREIGN KEY (debilidades) REFERENCES tipo(id_tipo);

/*TABLA POKEMON_MOVIMIENTO*/
ALTER TABLE pokemon_movimiento ADD CONSTRAINT fk_movimiento FOREIGN KEY (movimiento) REFERENCES movimiento(id_movimiento);

/*TABLA MOVIMIENTO*/
ALTER TABLE movimiento ADD CONSTRAINT fk_ataque FOREIGN KEY (ataque) REFERENCES ataque(id_ataque);
ALTER TABLE movimiento ADD CONSTRAINT fk_estado FOREIGN KEY (estado) REFERENCES estado(id_estado);
ALTER TABLE movimiento ADD CONSTRAINT fk_mejora FOREIGN KEY (mejora) REFERENCES mejora(id_mejora);

/*TABLA BOLSA*/
ALTER TABLE bolsa ADD CONSTRAINT fk_objetos FOREIGN KEY (objetos) REFERENCES objeto(id_objetos);

/*TABLA ENTRENADOR*/
ALTER TABLE entrenador ADD CONSTRAINT fk_bolsa FOREIGN KEY (bolsa) REFERENCES bolsa(id_bolsa);
ALTER TABLE entrenador ADD CONSTRAINT fk_caja FOREIGN KEY (caja) REFERENCES caja(id_caja);
ALTER TABLE entrenador ADD CONSTRAINT fk_pokedex FOREIGN KEY (pokedex) REFERENCES pokedex(id_pokedex);
ALTER TABLE entrenador ADD CONSTRAINT fk_tienda FOREIGN KEY (tienda) REFERENCES tienda(id_tienda);

/*TABLA CAJA*/
ALTER TABLE caja ADD CONSTRAINT fk_pokemon_entrenamiento FOREIGN KEY (pokemon_entrenamiento) REFERENCES pokemon(id_pokemon);
ALTER TABLE caja ADD CONSTRAINT fk_pokemon_crianza FOREIGN KEY (pokemon_crianza) REFERENCES pokemon(id_pokemon);

/*TABLA EQUIPO*/
ALTER TABLE equipo ADD CONSTRAINT fk_pokemon FOREIGN KEY (pokemon) REFERENCES pokemon(id_pokemon);

/*TABLA POKEDEX*/
ALTER TABLE pokedex ADD CONSTRAINT fk_pokemon FOREIGN KEY (pokemon) REFERENCES pokemon(id_pokemon);

/*TABLA TIENDA*/
ALTER TABLE tienda ADD CONSTRAINT fk_objetos FOREIGN KEY (objetos) REFERENCES objeto(id_objetos);

/*TABLA LIDER_GIMNASIO*/
ALTER TABLE lider_gimnasio ADD CONSTRAINT fk_entrenador FOREIGN KEY (id_lider_gimnasio) REFERENCES entrenador(id_entrenador);