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
    tipo_secundario INT not null,
    nivel_evolutivo INT not null,
    id_evolucion_pokemon Int,
    FOREIGN KEY (tipo_primario) REFERENCES Tipo(id_tipo),
    FOREIGN KEY (tipo_secundario) REFERENCES Tipo(id_tipo),
   	foreign key (id_evolucion_pokemon) references pokedex(num_pokedex);
);


/* Tabla categoria_objeto */
CREATE TABLE categoria_objeto (
    id_categoria INT PRIMARY KEY,
    nombre_categoria VARCHAR(255) NOT NULL
);

/* Tabla objeto */
CREATE TABLE objeto (
    id_objeto INT PRIMARY KEY,
    nom_objeto VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    precio INT NOT NULL,
    /*conexion*/
    id_categoria INT NOT NULL,´
    /*stats que mejora o no*/
    vitalidad INT NOT NULL,
    ataque INT NOT NULL,
    defensa INT NOT NULL,
    ataque_especial INT NOT NULL,
    defensa_especial INT NOT NULL,
    estamina INT NOT NULL,
    velocidad INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES categoria_objeto(id_categoria)
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
    id_gimnasio INT not null,
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

CREATE TABLE equipo (
    id_equipo INT PRIMARY KEY,
    id_entrenador INT NOT NULL,
    id_pokemon INT NOT NULL,
    num_slot INT NOT NULL,
    activo BOOLEAN NOT NULL,
    FOREIGN KEY (id_entrenador) REFERENCES entrenador(id_entrenador),
    FOREIGN KEY (id_pokemon) REFERENCES pokemon(id_pokemon)
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
    nivel INT NOT NULL,
    fertilidad INT NOT NULL,
    sexo ENUM('H', 'M', 'N') NOT NULL,
    /* conexiones*/
    id_objeto INT NOT NULL,
    id_pokemon_movimiento INT NOT NULL,
    FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto),
    FOREIGN KEY (id_pokemon_movimiento) REFERENCES pokemon_movimiento(id_pokemon_movimiento)
   
);

CREATE TABLE pokemon_movimiento(

    id_pokemon_movimiento int PRIMARY KEY,
    /* conexion*/
    id_movimiento Int NOT null,
    foreign key (id_movimiento) references movimientos(id_movimiento)
    
);

CREATE TABLE movimientos (
    id_movimiento INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo_movimiento VARCHAR(50) NOT NULL,
    tipo_ataque ENUM('FISICO', 'ESPECIAL', 'ESTADO', 'MEJORA') NOT NULL,
    potencia INT not null,
    estado VARCHAR(50) not null,
    duracion_estado INT not null,
    mejora VARCHAR(50) not null,
    duracion_mejora INT not null,
    costo_estamina INT NOT NULL
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
  id_tienda INT PRIMARY KEY,
  nom_tienda VARCHAR(50) NOT NULL,
  direccion VARCHAR(255) NOT NULL,
  /*productos que vende*/
  id_objeto INT NOT NULL,
  cantidad_objetos INT NOT NULL,
  FOREIGN KEY (id_objeto) REFERENCES objeto(id_objeto)
);

UPDATE Tipo SET nombre = 'Volador' WHERE id_tipo = 17;

alter table pokedex delete column descripcion;

alter table pokedex add column id_evolucion_pokemon Int;

alter table pokedex add foreign key (id_evolucion_pokemon) references pokedex(num_pokedex);

DELETE FROM pokedex WHERE num_pokedex = 117;

delete from pokedex;

insert into pokedex 
values 
(3, 'Venasaur', 11, 16, null, null),
(2, 'Ivysaur', 11, 16, 32, 3),
(1, 'Bulbasaur', 11, 16, 16, 2),
(6, 'Charizard', 7, 17, null, null),
(5, 'Charmeleon', 7, null, 36, 6),
(4, 'Charmander', 7, null, 16, 5).
(9, 'Blastoise', 2, null, null, null),
(8, 'Wartortle', 2, null, 36, 9),
(7, 'Squirtle', 2, null, 16, 8),
(12, 'Butterfree', 3, 17, null, null),
(11, 'Metapod', 3, null, 10, 12),
(10, 'Caterpie', 3, null, 7, 11),
(15, 'Beedrill', 3, 16, null, null),
(14, 'Kakuna', 3, 16, 10, 15),
(13, 'Weedle', 3, 16, 7, 13),
(18, 'Pidgeot', 10, 17, null, null),
(17, 'Pidgeotto', 10, 17, 36, 18),
(16, 'Pidgey', 10, 17, 18, 16),
(20, 'Raticate', 10, null, null, null),
(19, 'Rattata', 10, null, 20, 20),
(22, 'Fearow', 10, 17, null, null),
(21, 'Spearow', 10, 17, 20, 22),
(24, 'Arbok', 16, null, null, null),
(23, 'Ekans', 16, null, 22, 24),
(26, 'Raichu', 5, null, null, null),
(25, 'Pikachu', 5, null, 25, 26),
(28, 'Sandslash', 15, null, null, null),
(27, 'Sandshrew', 15, null, 22, 28),
(31, 'Nidoqueen', 16, 15, null, null),
(30, 'Nidorina', 16, null, 40, 31),
(29, 'Nidoran♀', 16, null, 16, 30),
(34, 'Nidoking', 16, 15, null, null),
(33, 'Nidorino', 16, null, 40, 34),
(32, 'Nidoran♂', 16, null, 16, 33),
(36, 'Clefable', 10, null, null, null),
(35, 'Clefairy', 10, null, 25, 36),
(38, 'Ninetales', 7, null, null, null),
(37, 'Vulpix', 7, null, 30, 38),
(40, 'Wigglytuff', 10, null, null, null),
(39, 'Jiggypuff', 10, null, 30, 40),
(42, 'Golbat', 16, 17, 40, 169),
(41, 'Zubat', 16, 17, 22, 42),
(45, 'Vileplume', 11, 15, null, null),
(44, 'Gloom', 11, 15, 35, 45),
(43, 'Oddish', 11, 15, 21, 43),
(47, 'Parasect', 3, 11, null, null),
(46, 'Paras', 3, 11, 24, 47),
(49, 'Venomoth', 3, 16, null, null),
(48, 'Venonat', 3, 16, 31, 49),
(51, 'Dugtrio', 15, null, null, null),
(50, 'Diglet', 15, null, 26, 51),
(53, 'Persian', 10, null, null, null),
(52, 'Meowth', 10, null, 28, 53),
(55, 'Golduck', 2, null, null, null),
(54, 'Psyduck', 2, null, 33, 55),
(57, 'Primeape', 9, null, null, null),
(56, 'Mankey', 9, null, 28, 57),
(59, 'Arcanine', 7, null, null, null),
(58, 'Growlithe', 7, null, 35, 59),
(62, 'Poliwrath', 2, 9, null, null),
(61, 'Poliwhirl', 2, null, 42, 62),
(60, 'Poliwag', 2, null, 25, 60),
(65, 'Alakazam', 12, null, null, null),
(64, 'Kadabra', 12, null, 42, 65),
(63, 'Abra', 12, null, 16, 64), 
(68, 'Machamp', 9, null, null, null),
(67, 'Machoke', 9, null, 45, 68),
(66, 'Machop', 9, null, 28, 67),
(71, 'Victreebel', 11, 16, null, null),
(70, 'Weepinbell', 11, 16, 42, 71),
(69, 'Bellsprout', 11, 16, 21, 70),
(73, 'Tentacruel', 2, 16, null, null),
(72, 'Tentacool', 2, 16, 30, 73),
(76, 'Golem', 13, 15, null, null),
(75, 'Graveler', 13, 15, 45, 76),
(74, 'Geodude', 13, 15, 25, 75),
(78, 'Rapidash', 7, null, null, null),
(77, 'Ponyta', 7, null, 30, 78),
(80, 'Slowbro', 2, 12, null, null),
(79, 'Slowpoke', 2, 12, 37, 80),
(82, 'Magneton', 5, 1, null, null),
(81, 'Magnemite', 5, 1, 30, 82),
(83, 'Farfetch´d', 10, 17, null, null),
(85, 'Dodrio', 10, 17, null, null),
(84, 'Doduo', 10, 17, 31, 85),
(87, 'Dewgong', 2, 8, null, null),
(86, 'Seel', 2, null, 34, 87),
(89, 'Muk', 16, null, null, null),
(88, 'Grimer', 16, null, 38, 89),
(91, 'Cloyster', 2, 8, null, null),
(90, 'Shellder', 2, null, 30, 91),
(94, 'Gengar', 6, 16, null, null),
(93, 'Haunter', 6, 16, 45, 94),
(92, 'Gastly', 6, 16, 25, 93),
(95, 'Onix', 13, 15, 40, 208),
(97, 'Hypno', 12, null, null, null),
(96, 'Drowzee', 12, null, 26, 97),
(99, 'Kingler', 2, null, null, null),
(98, 'Krabby', 2, null, 28, 99),
(101, 'Electrode', 5, null, null, null),
(100, 'Voltorb', 5, null, 30, 101),
(103, 'Exeggutor', 11, 12, null, null),
(102, 'Exeggcute', 11, 12, 35, 103), 
(105, 'Marowak', 15, null, null, null),
(104, 'Cubone', 15, null, 28, 105),
(106, 'Hitmonlee', 9, null, null, null),
(107, 'Hitmonchan', 9, null, null, null),
(108, 'Lickitung', 10, null, null, null),
(110, 'Weezing', 16, null, null, null),
(109, 'Koffing', 16, null, null, null),
(112, 'Rhydon', 15, 13, null, null),
(111, 'Rhyhorn', 15, 13, 42, 112),
(113, 'Chansey', 10, null, null, 242),
(114, 'Tangela', 11, null, null, null),
(115, 'Kangaskhan', 10, null, null, null),
(117, 'Seadra', 2, null, 45, 230),
(116, 'Horsea', 2, null, 32, 117),
(119, 'Seaking', 2, null, null, null),
(118, 'Goldeen', 2, null, 33, 119),
(121, 'Starmie', 2, 12, null, null),
(120, 'Staryu', 2, null, 30, 121),
(122, 'Mr. Mine', 12, null, null, null), 
(123, 'Scyther', 3, 17, 42, 212),
(124, 'Jynx', 8, 12, null, null),
(125, 'Electabuzz', 5, null, null, null), 
(126, 'Magmar', 7, null, null, null),
(127, 'Pinsir', 3, null, null, null),
(128, 'Tauros', 10, null, null, null),
(130, 'Gyarados', 2, 17, null, null),
(129, 'Magikarp', 2, null, 20, 130), 
(131, 'Lapras', 2, 8, null, null),
(132, 'Ditto', 10, null, null, null),
(133, 'Eevee', 10, null, null, null),
(134, 'Vaporeon', 2, null, null, null),
(135, 'Jolteon', 5, null, null, null),
(136, 'Flareon', 7, null, null, null),
(137, 'Porygon', 10, null, 30, 233),
(139, 'Omastar', 13, 2, null, null),
(138, 'Omanyte', 13, 2, 40, 139),
(141, 'Kabutops', 13, 2, null, null),
(140, 'Kabuto', 13, 2, 40, 141),
(142, 'Aerodactyl', 13, 17, null, null),
(143, 'Snorlax', 10, null, null, null),
(144, 'Articuno', 8, 17, null, null),
(145, 'Zapdos', 5, 17, null, null),
(146, 'Moltres', 7, 17, null, null),
(149, 'Dragonite', 4, 17, null, null),
(148, 'Dragonair', 4, null, 55, 149),
(147, 'Dratini', 4, null, 30, 148),
(150, 'Mewtwo', 12, null, null, null),
(151, 'Mew', 12, null, null, null),/*POKEDEX 2ª_GENERACION*/
(154, 'Meganium', 11, null, null, null),
(153, 'Bayleef', 11, null, 32, 154),
(152, 'Chikorita', 11, null, 16, 153),
(157, 'Typhlosion', 7, null, null, null),
(156, 'Quilava', 7, null, 36, 157),
(155, 'Cyndaquil', 7, null, 14, 156),
(160, 'Feraligatr', 2, null, null, null),
(159, 'Croconaw', 2, null, 30, 160),
(158, 'Totodile', 2, null, 18, 159),
(162, 'Furret', 10, null, null, null),
(161, 'Sentret', 10, null, 15, 162),
(164, 'Noctowl', 10, 17, null, null),
(163, 'Hoothoot', 10, 17, 20, 164), 
(166, 'Ledian', 3, 17, null, null),
(165, 'Ledyba', 3, 17, 18, 166),
(168, 'Ariados', 3, 16, null, null),
(167, 'Spinarak', 3, 16, 22, 168),
(169, 'Crobat', 16, 17, null, null), 
(171, 'Lanturn', 2, 5, null, null),
(170, 'Chinchou', 2, 5, 27, 171),
(172, 'Pichu', 5, null, 10, 25),
(173, 'Cleffa', 10, null, 10, 10), 
(174, 'Igglybuff', 10, null, 10, 39), 
(176, 'Lanturn', 10, 17, null, null),
(175, 'Chinchou', 10, null, 25, 176), 
(178, 'Xatu', 12, 17, null, null),
(177, 'Natu', 12, 17, 25, 178),
(181, 'Ampharos', 5, null, null, null),
(180, 'Flaaffy', 5, null, 30, 181),
(179, 'Mareep', 5, null, 15, 180), 
(182, 'Bellossom', 11, null, null, null),
(184, 'Azumarill', 2, null, null, null),
(183, 'Marill', 2, null, 18, 184),
(185, 'Sudowoodo', 13, null, null, null), 
(186, 'Politoed', 2, null, null, null),
(189, 'Jumpluff', 11, 17, null, null),
(188, 'Skiploom', 11, 17, 27, 189),
(187, 'Hoppip', 11, 17, 18, 188),
(190, 'Aipom', 10, null, null, null),
(192, 'Sunflora', 12, null, null, null),
(191, 'Sunkern', 12, null, 30, 192),
(193, 'Yanma', 3, 17, null, null),
(195, 'Quagsire', 2, 15, null, null),
(194, 'Wooper', 2, 15, 20, 195),
(196, 'Espeon', 12, null, null, null),
(197, 'Umbreon', 14, null, null, null), 
(198, 'Murkrow', 14, 17, null, null),
(199, 'Slowking', 2, 12, null, null),
(200, 'Misdreavus', 6, null, null, null),
(201, 'Unown', 12, null, null, null),
(202, 'Wobbuffet', 12, null, null, null),
(203, 'Girafarig', 10, 12, null, null),
(205, 'Forrestress', 3, 1, null, null),
(204, 'Pineco', 3, null, 31, 205), 
(206, 'Dunsparce', 10, null, null, null),
(207, 'Gligar', 15, 17, null, null),
(208, 'Steelix', 1, 15, null, null),
(210, 'Granbull', 10, null, null, null),
(209, 'Snubbull', 10, null, null, 210),
(211, 'Qwilfish', 2, 16, null, null),
(212, 'Scizor', 3, 1, null, null, null),
(213, 'Shuckle', 3, 13, null, null),
(214, 'Heracross', 3, 9, null, null),
(215, 'Sneasel', 14, 8, null, null),
(217, 'Ursaring', 10, null, null, null),
(216, 'Teddiursa', 10, null, 30, 217),
(219, 'Magcargo', 7, 13, null, null),
(218, 'Slugma', 7, null, 38, 219),
(221, 'Piloswine', 8, 15, null, null),
(220, 'Swinub', 8, 15, 33, 221),
(222, 'Corsola', 2, 13, null, null),
(223, 'Remoraid', 2, null, null, null),
(224, 'Octillery', 2, null, null, null),
(225, 'Delibird', 8, 17, null, null),
(226, 'Mantiene', 2, 17, null, null), 
(227, 'Skarmory', 1, 17, null, null),
(229, 'Houndoom', 14, 7, null, null),
(228, 'Houndour', 14, 7, 24, 229),
(230, 'Kingdra', 2, 4, null, null),
(232, 'Donphan', 15, null, null, null),
(231, 'Phanpy', 15, null, 25, 232),
(233, 'Porygon2', 10, null, null, null),
(234, 'Stantler', 10, null, null, null),
(235, 'Smeargle', 10, null, null, null),
(236, 'Tyrogue', 9, null, null, null),
(237, 'Hitmontop', 9, null, null, null),
(238, 'Smoochum', 8, 12, 30, 124),
(239, 'Elekid', 5, null, 30, 125),
(240, 'Magby', 7, null, 30, 126),
(241, 'Miltank', 10, null, null, null),
(242, 'Blissey', 10, null, null, null),
(243, 'Raikou', 5, null, null, null),
(244, 'Entei', 7, null, null, null),
(245, 'Suicune', 2, null, null, null),
(248, 'Tyranitar', 13, 14, null, null),
(247, 'Pupitar', 13, 15, 55, 248),
(246, 'Larvitar', 13, 15, 30, 247),
(249, 'Luigia', 12, 17, null, null), 
(250, 'Ho-oh', 7, 17, null, null),
(251, 'Celebi', 12, 11, null, null);

alter table pokedex add column descripcion varchar(255) not null;

update pokedex set descripcion = 'La semilla de su lomo está llena de nutrientes. La semilla brota a medida que el Pokémon crece.' where num_pokedex = 1;