insert into tipo (nombre, indice) 
values 
('ACERO', 0),
('AGUA', 1),
('BICHO', 2),
('DRAGON', 3),
('ELECTRICO', 4),
('FANTASMA', 5),
('FUEGO', 6),
('HIELO', 7),
('LUCHA', 8),
('NORMAL', 9),
('PLANTA', 10),
('PSIQUICO', 11),
('ROCA', 12),
('SINIESTRO', 13),
('TIERRA', 14),
('VENENO', 15),
('VOLADOR', 16);

insert into pokedex (num_pokedex, nom_pokemon, tipo_primario, tipo_secundario, nivel_evolutivo, id_evolucion_pokemon)
values
(3, 'Venasaur', 11, 16, null, null),
(2, 'Ivysaur', 11, 16, 32, 3),
(1, 'Bulbasaur', 11, 16, 16, 2),
(6, 'Charizard', 7, 17, null, null),
(5, 'Charmeleon', 7, null, 36, 6),
(4, 'Charmander', 7, null, 16, 5),
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
(16, 'Pidgey', 10, 17, 18, 17),
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
(169, 'Crobat', 16, 17, null, null), 
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
(208, 'Steelix', 1, 15, null, null),
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
(242, 'Blissey', 10, null, null, null),
(113, 'Chansey', 10, null, null, 242),
(114, 'Tangela', 11, null, null, null),
(115, 'Kangaskhan', 10, null, null, null),
(230, 'Kingdra', 2, 4, null, null),
(117, 'Seadra', 2, null, 45, 230),
(116, 'Horsea', 2, null, 32, 117),
(119, 'Seaking', 2, null, null, null),
(118, 'Goldeen', 2, null, 33, 119),
(121, 'Starmie', 2, 12, null, null),
(120, 'Staryu', 2, null, 30, 121),
(122, 'Mr. Mine', 12, null, null, null), 
(212, 'Scizor', 3, 1, null, null),
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
(233, 'Porygon2', 10, null, null, null),
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
(151, 'Mew', 12, null, null, null),
/*POKEDEX 2ª_GENERACION*/
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
(210, 'Granbull', 10, null, null, null),
(209, 'Snubbull', 10, null, null, 210),
(211, 'Qwilfish', 2, 16, null, null),
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
(232, 'Donphan', 15, null, null, null),
(231, 'Phanpy', 15, null, 25, 232),
(234, 'Stantler', 10, null, null, null),
(235, 'Smeargle', 10, null, null, null),
(236, 'Tyrogue', 9, null, null, null),
(237, 'Hitmontop', 9, null, null, null),
(238, 'Smoochum', 8, 12, 30, 124),
(239, 'Elekid', 5, null, 30, 125),
(240, 'Magby', 7, null, 30, 126),
(241, 'Miltank', 10, null, null, null),
(243, 'Raikou', 5, null, null, null),
(244, 'Entei', 7, null, null, null),
(245, 'Suicune', 2, null, null, null),
(248, 'Tyranitar', 13, 14, null, null),
(247, 'Pupitar', 13, 15, 55, 248),
(246, 'Larvitar', 13, 15, 30, 247),
(249, 'Luigia', 12, 17, null, null), 
(250, 'Ho-oh', 7, 17, null, null),
(251, 'Celebi', 12, 11, null, null);

update pokedex set descripcion = 'La semilla de su lomo está llena de nutrientes. La semilla brota a medida que el Pokémon crece.' where num_pokedex = 1;
update pokedex set descripcion = 'Puede aumentar su fuerza con energía solar. Ésta también hace que crezca el capullo de su lomo.' where num_pokedex = 2;
update pokedex set descripcion = 'Llena su cuerpo de energía con los rayos solares que captan los anchos pétalos de su flor.' where num_pokedex = 3;
update pokedex set descripcion = 'La llama de su cola indica su fuerza vital. Si está débil, la llama arderá más tenue.' where num_pokedex = 4;
update pokedex set descripcion = 'Por Naturaleza, se acalora con facilidad: siempre está buscando enemigos. Sólo se calma cuando gana.' where num_pokedex = 5;
update pokedex set descripcion = 'Si Charizard se enfurece, la llama de la punta de su cola producirá destellos de color azul claro.' where num_pokedex = 6;
update pokedex set descripcion = 'Su caparazón es blando al nacer. Pero pronto se endurecerá y será capaz de resistir cualquier amenaza.' where num_pokedex = 7;
update pokedex set descripcion = 'Es reconocido como símbolo de longevidad. Los Wartortle ancianos tienen algas sobre el caparazón.' where num_pokedex = 8;
update pokedex set descripcion = 'Deliberadamente se hace más pesado para contrarrestar la fuerza de los chorros de agua que dispara.' where num_pokedex = 9;
update pokedex set descripcion = 'Para protegerse despide un hedor horrible de sus antenas, con el que repele a sus enemigos.' where num_pokedex = 10;
update pokedex set descripcion = 'En el caparazón, mientras se prepara para evolucionar, está blando y débil, en estado catatónico' where num_pokedex = 11;
update pokedex set descripcion = 'Recoge miel a diario y la adhiere al pelo de sus patas para llevarla a su colmena.' where num_pokedex = 12;
update pokedex set descripcion = 'Su venenoso aguijón es muy potente, y su colorido cuerpo hace que los enemigos huyan.' where num_pokedex = 13;
update pokedex set descripcion = 'Aunque sea un capullo, es capaz de moverse. Extenderá su púa venenosa si es atacado.' where num_pokedex = 14;
update pokedex set descripcion = 'Puede vencer a cualquier rival con sus potentes aguijones venenosos. Puede atacar en grupo.' where num_pokedex = 15;
update pokedex set descripcion = 'Suele ocultarse entre altas hierbas. Como no le gusta luchar, se defiende pateando arena.' where num_pokedex = 16;
update pokedex set descripcion = 'Su visión es extraordinaria. Aunque vuele muy alto, detectará todo movimiento de su presa.' where num_pokedex = 17;
update pokedex set descripcion = 'Sus músculos pectorales son tan fuertes que podría parar una ventisca con unos cuantos aleteos.' where num_pokedex = 18;
update pokedex set descripcion = 'Come de todo. Se establece donde quiera que haya comida, y se reproduce continuamente.' where num_pokedex = 19;
update pokedex set descripcion = 'Roe cualquier cosa con sus duros colmillos. Puede hasta derribar ciertos edificios royéndolos.' where num_pokedex = 20;
update pokedex set descripcion = 'Aletea con sus cortas alas para hacer salir a los insectos de la hierba, y los caza con su pico.' where num_pokedex = 21;
update pokedex set descripcion = 'Asciende al cielo repentinamente para caer después en picado, y de un solo golpe atrapar a su presa.' where num_pokedex = 22;
update pokedex set descripcion = 'Puede separar su mandíbula para engullir a grandes presas, aunque esto le dificulte el movimiento.' where num_pokedex = 23;
update pokedex set descripcion = 'Paralizando a su presa con los dibujos de su piel, apresa y envenena a la asustada víctima.' where num_pokedex = 24;
update pokedex set descripcion = 'Este inteligente Pokémon tuesta las duras BAYAS con electricidad para hacerlas más comestibles.' where num_pokedex = 25;
update pokedex set descripcion = 'Cuando se carga de electricidad, sus músculos se tensan y se vuelve más agresivo de lo normal.' where num_pokedex = 26;
update pokedex set descripcion = 'Si cae de gran altura, este Pokémon podría convertirse en una pelota y rebotar contra el suelo.' where num_pokedex = 27;
update pokedex set descripcion = 'En un intento por esconderse, saldrá corriendo a gran velocidad, dejando tras de sí una gran polvareda.' where num_pokedex = 28;
update pokedex set descripcion = 'Cuando alimenta a sus crías, primero mastica y ablanda la comida y luego la escupe para su prole.' where num_pokedex = 29;
update pokedex set descripcion = 'Cuando alimenta a sus crías, primero mastica y ablanda la comida y luego la escupe para su prole.' where num_pokedex = 30;
update pokedex set descripcion = 'Su cuerpo está cubierto por pequeñas escamas. Nunca parece acobardarse ante ningún ataque.' where num_pokedex = 31;
update pokedex set descripcion = 'Es pequeño, pero su cuerno está lleno de veneno. Primero embiste, y después lanza su venenosa cornada' where num_pokedex = 32;
update pokedex set descripcion = 'Levanta sus grandes orejas para vigilar. Si detecta algo, atacará de inmediato.' where num_pokedex = 33;
update pokedex set descripcion = 'Mueve su cola en combate. Si su enemigo queda atontado, le embiste con su robusto cuerpo.' where num_pokedex = 34;
update pokedex set descripcion = 'La luz de luna que guarda en las alas de su lomo parece darle la habilidad de flotar en el aire.' where num_pokedex = 35;
update pokedex set descripcion = 'Con su fino oído puede percibir sonidos muy lejanos. Suele habitar en lugares silenciosos.' where num_pokedex = 36;
update pokedex set descripcion = 'A medida que crece, su blanca cola gana color y se divide en seis. Es cálido y adorable.' where num_pokedex = 37;
update pokedex set descripcion = 'Cuentan algunas leyendas que cada una de sus nueve colas posee su propio y único poder místico.' where num_pokedex = 38;
update pokedex set descripcion = 'Si se hincha para CANTAR una nana, cantará más tiempo, y puede causar sopor en el público.' where num_pokedex = 39;
update pokedex set descripcion = 'Su piel es tan suave que si dos de ellos se acurrucan juntos, no querrán separarse nunca.' where num_pokedex = 40;
update pokedex set descripcion = 'Al volar, emite constantemente ondas ultrasónicas por la boca para comprobar los alrededores.' where num_pokedex = 41;
update pokedex set descripcion = 'Por muy dura que sea la piel de su víctima, clava sus afilados colmillos para atiborrarse de su sangre.' where num_pokedex = 42;
update pokedex set descripcion = 'Despertado por la luz de la luna, vaga por la noche. De día se mantiene en silencio bajo la tierra.' where num_pokedex = 43;
update pokedex set descripcion = 'Lo que parece ser baba es realmente miel. Es muy pegajoso y se adhiere tercamente si lo tocas.' where num_pokedex = 44;
update pokedex set descripcion = 'Tiene los pétalos más grandes del mundo. Éstos expulsan densas nubes de polen tóxico al caminar.' where num_pokedex = 45;
update pokedex set descripcion = 'Está cubierto de esporas de seta al nacer. A medida que crece, las setas brotan de su lomo.' where num_pokedex = 46;
update pokedex set descripcion = 'Suele vivir en lugares oscuros y húmedos, los preferidos, no del bicho, sino de la seta de su lomo.' where num_pokedex = 47;
update pokedex set descripcion = 'Sus ojos también funcionan como radares. Atrapa y come pequeños bichos ocultos en la oscuridad.' where num_pokedex = 48;
update pokedex set descripcion = 'Cuando ataca, agita sus largas alas violentamente para esparcir polvo venenoso a su alrededor.' where num_pokedex = 49;
update pokedex set descripcion = 'Su piel es muy fina. Si se expone a la luz, su sangre se calienta y su crecimiento se debilita.' where num_pokedex = 50;
update pokedex set descripcion = 'Sus tres cabezas suben y bajan para remover la tierra cercana, facilitándole la excavación.' where num_pokedex = 51;
update pokedex set descripcion = 'Le fascinan los objetos redondos. No deja de jugar con ellos hasta que se cansa y cae rendido.' where num_pokedex = 52;
update pokedex set descripcion = 'Muy valorado por su aire sofisticado. Sin embargo, ataca y araña por el más mínimo motivo.' where num_pokedex = 53;
update pokedex set descripcion = 'Tiene poderes místicos que no recuerda haber usado. Por eso, siempre parece desconcertado.' where num_pokedex = 54;
update pokedex set descripcion = 'Cuando nada a toda velocidad usando sus palmeadas extremidades, su frente comienza a brillar.' where num_pokedex = 55;
update pokedex set descripcion = 'Tiene muy mal humor. Cuando se agrupan atacan a cualquier cosa sin motivo aparente.' where num_pokedex = 56;
update pokedex set descripcion = 'Si te acercas a él mientras duerme, se despertará y te dará caza en estado medio sonámbulo.' where num_pokedex = 57;
update pokedex set descripcion = 'De Naturaleza valiente y honrada, se enfrenta sin miedo a enemigos más grandes y fuertes.' where num_pokedex = 58;
update pokedex set descripcion = 'Este Pokémon chino legendario es considerado magnífico. A mucha gente le encanta su gran melena.' where num_pokedex = 59;
update pokedex set descripcion = 'Por ser un poco torpe al caminar con sus jóvenes patas, siempre prefiere nadar a caminar.' where num_pokedex = 60;
update pokedex set descripcion = 'La espiral de su pecho se ondula delicadamente. Mirarlo provoca gradualmente un estado de sopor.' where num_pokedex = 61;
update pokedex set descripcion = 'Este fuerte y hábil nadador es capaz hasta de cruzar los grandes océanos, sólo por placer.' where num_pokedex = 62;
update pokedex set descripcion = 'Siente los ataques inminentes y se TELETRANSPORTA a un lugar seguro, antes de que éstos puedan darle.' where num_pokedex = 63;
update pokedex set descripcion = 'Es muy fuerte espiritualmente. Cuanto mayor sea el peligro, mayor será su poder psíquico.' where num_pokedex = 64;
update pokedex set descripcion = 'Cerrando sus ojos aumenta sus demás sentidos. Esto le permite usar sus habilidades al máximo.' where num_pokedex = 65;
update pokedex set descripcion = 'Siempre rebosante de fuerza, pasa el tiempo levantando piedras. Esto le lleva a ser aún más fuerte.' where num_pokedex = 66;
update pokedex set descripcion = 'Siempre va a máxima potencia, pero este fuerte y resistente Pokémon no se cansa nunca.' where num_pokedex = 67;
update pokedex set descripcion = 'Mueve rápidamente sus cuatro brazos para golpear con incesantes golpes y puñetazos desde todos los ángulos.' where num_pokedex = 68;
update pokedex set descripcion = 'Aunque su cuerpo es extremadamente delgado, es muy rápido a la hora de capturar a sus presas.' where num_pokedex = 69;
update pokedex set descripcion = 'Aunque está lleno de ÁCIDO, no llega a derretirse porque también rezuma fluidos neutralizantes.' where num_pokedex = 70;
update pokedex set descripcion = 'El ÁCIDO con que disuelve a muchas presas se endulza, haciéndolo hasta más efectivo para atraer a su presa.' where num_pokedex = 71;
update pokedex set descripcion = 'Cuando baja la marea, podrían aparecer restos deshidratados de Tentacool junto a la orilla.' where num_pokedex = 72;
update pokedex set descripcion = 'Sus 80 tentáculos absorben agua y se alargan para OPRIMIR la respiración de sus presas y enemigos.' where num_pokedex = 73;
update pokedex set descripcion = 'Puede que mucha gente no se dé cuenta, pero si lo miras de cerca, descubrirás muchos Geodude alrededor.' where num_pokedex = 74;
update pokedex set descripcion = 'De Naturaleza descuidada y libre, no le importa dañarse cuando baja rodando montañas.' where num_pokedex = 75;
update pokedex set descripcion = 'Muda su piel una vez al año. La concha desechada se endurece de inmediato y se desmorona.' where num_pokedex = 76;
update pokedex set descripcion = 'Al nacer es un poco lento, pero poco a poco se vuelve más rápido para poder seguir a sus padres.' where num_pokedex = 77;
update pokedex set descripcion = 'Al galope, sus cuatro cascos apenas tocan el suelo porque se mueve rapidísimo.' where num_pokedex = 78;
update pokedex set descripcion = 'Descansa ocioso junto al agua. Si algo muerde su cola, no lo notará en todo el día.' where num_pokedex = 79;
update pokedex set descripcion = 'Si el Shellder que muerde su cola se desprende Durante una lucha, se convertirá en un simple Slowpoke.' where num_pokedex = 80;
update pokedex set descripcion = 'Atraído por ondas electromagnéticas, podría acercarse a los entrenadores que estén usando el POKÉGEAR.' where num_pokedex = 81;
update pokedex set descripcion = 'Tres Magnemite se enlazan por una intensa fuerza magnética. Si te acercas, te dolerán los oídos.' where num_pokedex = 82;
update pokedex set descripcion = 'Si a alguien se le ocurre estropear los cultivos de puerros, usará su propio puerro para evitarlo.' where num_pokedex = 83;
update pokedex set descripcion = 'Alternando ambas cabezas arriba y abajo, se equilibra para correr de una forma más estable.' where num_pokedex = 84;
update pokedex set descripcion = 'Recoge datos y hace planes el triple de rápido, pero si piensa demasiado podría quedar paralizado.' where num_pokedex = 85;
update pokedex set descripcion = 'Aunque torpe en tierra, es un hábil nadador. Lo que más le gusta es nadar en mares helados.' where num_pokedex = 86;
update pokedex set descripcion = 'Su aerodinámico cuerpo avanza fácilmente por el agua. Cuanto más fría, más diversión.' where num_pokedex = 87;
update pokedex set descripcion = 'Mientras se mueve, pierde partes de su cuerpo, de donde saldrá un nuevo Grimer. Esto aumenta su hedor.' where num_pokedex = 88;
update pokedex set descripcion = 'Les encanta reunirse en zonas apestosas donde se acumula el lodo, haciendo su olor más insoportable.' where num_pokedex = 89;
update pokedex set descripcion = 'Nada hacia atrás abriendo y cerrando su concha. Es sorprendentemente rápido.' where num_pokedex = 90;
update pokedex set descripcion = 'Cuando cierra de golpe su concha será imposible abrirla, hasta por los más fuertes.' where num_pokedex = 91;
update pokedex set descripcion = 'Con su cuerpo gaseoso puede colarse por donde quiera, aunque con un golpe de viento saldría despedido.' where num_pokedex = 92;
update pokedex set descripcion = 'En la oscuridad total, donde no se ve nada, Haunter acecha a su próxima víctima.' where num_pokedex = 93;
update pokedex set descripcion = 'Roba el calor de sus alrededores. Si sientes un escalofrío, seguro que hay algún Gengar cerca.' where num_pokedex = 94;
update pokedex set descripcion = 'Gira y se retuerce bajo la tierra. El atronador rugido de su excavación resuena a lo lejos.' where num_pokedex = 95;
update pokedex set descripcion = 'Si crees haber tenido un buen sueño, y no puedes acordarte, seguro que se lo ha comido un Drowzee.' where num_pokedex = 96;
update pokedex set descripcion = 'Cuando está muy hambriento, duerme a los humanos que encuentra para poder devorar sus sueños.' where num_pokedex = 97;
update pokedex set descripcion = 'Ante el peligro, se camufla con las burbujas que desprende su boca, para parecer más grande.' where num_pokedex = 98;
update pokedex set descripcion = 'Le cuesta levantar su exagerada y desproporcionada pinza. Su tamaño le impide apuntar correctamente.' where num_pokedex = 99;
update pokedex set descripcion = 'Se mueve rodando. Si el terreno es irregular, una chispa provocada por algún bache lo haría explotar.' where num_pokedex = 100;
update pokedex set descripcion = 'Es peligroso. Si almacena mucha electricidad y está ocioso, se entretiene explosionando.' where num_pokedex = 101;
update pokedex set descripcion = 'Su cáscara es muy resistente. Si llega a romperse, podría sobrevivir si evita derramar su contenido.' where num_pokedex = 102;
update pokedex set descripcion = 'Sus tres cabezas piensan de forma independiente. Sin embargo, son amigas y no suelen discutir nunca.' where num_pokedex = 103;
update pokedex set descripcion = 'Si está triste o solitario, agita la calavera y emite un sonido lúgubre y lastimero.' where num_pokedex = 104;
update pokedex set descripcion = 'Se le ha visto golpeando rocas con el hueso que lleva, para enviar mensajes a los demás.' where num_pokedex = 105;
update pokedex set descripcion = 'Este Pokémon tiene un sentido del equilibrio increíble. Puede dar patadas desde cualquier sitio.' where num_pokedex = 106;
update pokedex set descripcion = 'Sus puños cortan el aire, aunque parece necesitar un descanso tras 3 minutos de combate.' where num_pokedex = 107;
update pokedex set descripcion = 'Los nervios súperdesarrollados hallados por toda su lengua permiten que la manipule hábilmente.' where num_pokedex = 108;
update pokedex set descripcion = 'Su fino y delgado cuerpo está lleno de gases que causan tos, estornudos y lagrimeos constantes.' where num_pokedex = 109;
update pokedex set descripcion = 'Si uno de los gemelos Koffing se infla, el otro se desinfla. Mezclan constantemente sus venenosos gases.' where num_pokedex = 110;
update pokedex set descripcion = 'Es un poco torpe al girar debido a sus cuatro cortas patas. Sólo puede atacar y correr en una dirección.' where num_pokedex = 111;
update pokedex set descripcion = 'Su dura coraza le protege hasta del calor de la lava. Sin embargo, la coraza le hace insensible.' where num_pokedex = 112;
update pokedex set descripcion = 'Camina con cuidado para que no se rompa su huevo. Sin embargo, es extremadamente rápido escapando.' where num_pokedex = 113;
update pokedex set descripcion = 'Las cintas que ocultan todo su cuerpo no dejan de moverse. Esto desconcierta a sus enemigos.' where num_pokedex = 114;
update pokedex set descripcion = 'Si no hay peligro, el joven sale de la bolsa y juega. El adulto vigila atentamente al joven.' where num_pokedex = 115;
update pokedex set descripcion = 'Si es atacado por un enemigo más grande, nada veloz a un lugar seguro gracias a su aleta dorsal.' where num_pokedex = 116;
update pokedex set descripcion = 'Un análisis de sus células revela la presencia de un gen no encontrado en Horsea. Es un tema muy polémico.' where num_pokedex = 117;
update pokedex set descripcion = 'Sus aletas dorsal, trasera y pectoral ondean gráciles en el agua. Por eso es llamado el bailarín acuático.' where num_pokedex = 118;
update pokedex set descripcion = 'Durante la puesta acuden Seaking de todas partes, coloreando los ríos de un rojo brillante.' where num_pokedex = 119;
update pokedex set descripcion = 'De noche, la parte central de su cuerpo parpadea al ritmo del latido cardíaco de los humanos.' where num_pokedex = 120;
update pokedex set descripcion = 'La parte central de su cuerpo se denomina núcleo. Brilla en colores diferentes cada vez que es visto.' where num_pokedex = 121;
update pokedex set descripcion = 'Un hábil mimo desde que nace. Aprende a crear objetos invisibles a medida que crece.' where num_pokedex = 122;
update pokedex set descripcion = 'Avanza por la hierba con sus afiladas guadañas, más rápido de lo que el ojo humano pueda percibir.' where num_pokedex = 123;
update pokedex set descripcion = 'Mueve su cuerpo rítmicamente. Parece cambiar de ritmo dependiendo de cómo se sienta.' where num_pokedex = 124;
update pokedex set descripcion = 'Por la superficie de su piel corre la electricidad. En la oscuridad, su cuerpo se torna blanquecino.' where num_pokedex = 125;
update pokedex set descripcion = 'Odia los lugares fríos, y despide calientes llamas para hacer el entorno un poco más confortable.' where num_pokedex = 126;
update pokedex set descripcion = 'Cava guaridas con sus cuernos para pasar la noche. Por la mañana, la tierra húmeda se pega a su cuerpo.' where num_pokedex = 127;
update pokedex set descripcion = 'Luchan entre sí con sus cuernos. El jefe de la manada alardea de las cicatrices de sus cuernos.' where num_pokedex = 128;
update pokedex set descripcion = 'Un Pokémon desvalido y patético. A veces es capaz de saltar alto, pero nunca más de 2 metros.' where num_pokedex = 129;
update pokedex set descripcion = 'Dicen que en guerras pasadas, Gyarados aparecía dejando a su paso la ruina y el caos.' where num_pokedex = 130;
update pokedex set descripcion = 'Son buenos de corazón. Muchos fueron capturados por ser tan pacíficos. Ahora hay muchos menos.' where num_pokedex = 131;
update pokedex set descripcion = 'Se puede transformar en cualquier cosa. Cuando duerme, se vuelve roca para evitar el ataque.' where num_pokedex = 132;
update pokedex set descripcion = 'Es capaz de alterar la composición de su cuerpo para confundirse con el entorno.' where num_pokedex = 133;
update pokedex set descripcion = 'Cuando las aletas de Vaporeon vibran, significa que lloverá en las próximas horas.' where num_pokedex = 134;
update pokedex set descripcion = 'Concentra la débil actividad eléctrica de sus células para lanzar dañinas descargas.' where num_pokedex = 135;
update pokedex set descripcion = 'Almacena parte del aire que inhala en su bolsa interior, que llega a calentarse a más de 1.700 grados.' where num_pokedex = 136;
update pokedex set descripcion = 'Es un Pokémon creado por el hombre. Como no respira, la gente quiere probarlo en cualquier sitio.' where num_pokedex = 137;
update pokedex set descripcion = 'Resucitado de un fósil, este Pokémon usa el aire de su concha para sumergirse y emerger.' where num_pokedex = 138;
update pokedex set descripcion = 'Al parecer, rompió la concha de Shellder con sus afilados colmillos y absorbió el interior.' where num_pokedex = 139;
update pokedex set descripcion = 'En raras ocasiones se han encontrado como fósiles, porque se habían escondido en el fondo marino.' where num_pokedex = 140;
update pokedex set descripcion = 'Repliega sus extremidades en el agua para hacerse más compacto, y mueve su concha para nadar rápido.' where num_pokedex = 141;
update pokedex set descripcion = 'Un malvado Pokémon que data de hace mucho tiempo. Parece volar extendiendo sus alas y planeando.' where num_pokedex = 142;
update pokedex set descripcion = 'Su supuesto grito podrían ser sus ronquidos, o los ruidos de su hambrienta tripa.' where num_pokedex = 143;
update pokedex set descripcion = 'Dicen que las magníficas alas translúcidas de este legendario pájaro Pokémon son de hielo.' where num_pokedex = 144;
update pokedex set descripcion = 'Este legendario pájaro Pokémon provoca violentas tormentas de rayos agitando sus brillantes alas.' where num_pokedex = 145;
update pokedex set descripcion = 'Este Pokémon legendario esparce ascuas con cada aleteo. Es una visión digna de ver.' where num_pokedex = 146;
update pokedex set descripcion = 'Al nacer ya tiene un tamaño considerable. Muda continuamente de piel a la vez que crece.' where num_pokedex = 147;
update pokedex set descripcion = 'Dicen que cuando su cuerpo desprende un aura, el tiempo empieza a cambiar inmediatamente.' where num_pokedex = 148;
update pokedex set descripcion = 'Dicen que este Pokémon vuela continuamente por la inmensidad del mar, y que rescata a los ahogados.' where num_pokedex = 149;
update pokedex set descripcion = 'Debido a sus increíbles capacidades de lucha, sólo piensa en eliminar a sus enemigos.' where num_pokedex = 150;
update pokedex set descripcion = 'Dicen que sólo se aparece a los puros de corazón, y a quienes desean verlo con todas sus fuerzas.' where num_pokedex = 151;

update pokedex set descripcion = 'Un dulce aroma se desprende de la hoja de su cabeza. Es dócil y le encanta absorber los rayos de sol.' where num_pokedex = 152;
update pokedex set descripcion = 'Su cuello huele a especias. Dicen que por alguna razón, su simple olor te incita a luchar.' where num_pokedex = 153;
update pokedex set descripcion = 'El olor que desprenden sus pétalos contiene una sustancia que calma el instinto agresivo.' where num_pokedex = 154;
update pokedex set descripcion = 'Es tímido, y siempre se enrosca como una pelota. Si es atacado, enciende su lomo para protegerse.' where num_pokedex = 155;
update pokedex set descripcion = 'Ten cuidado si te da la espalda en combate. Significa que te va a atacar con su lomo de fuego.' where num_pokedex = 156;
update pokedex set descripcion = 'Si su furia crece, se calienta tanto que cualquier cosa que toque se prenderá al instante.' where num_pokedex = 157;
update pokedex set descripcion = 'Sus desarrolladas y potentes fauces pueden romper cualquier cosa. Su entrenador debe tener cuidado.' where num_pokedex = 158;
update pokedex set descripcion = 'Si pierde un colmillo, le crecerá otro en su lugar. Siempre tiene 48 colmillos en su boca.' where num_pokedex = 159;
update pokedex set descripcion = 'Al morder con sus feroces fauces, mueve su cabeza despedazando salvajemente a su víctima.' where num_pokedex = 160;
update pokedex set descripcion = 'Un Pokémon muy precavido. Se levanta con su cola para tener una mejor vista de los alrededores.' where num_pokedex = 161;
update pokedex set descripcion = 'Construye un nido donde introducir su largo y delgado cuerpo, en el que no pueden entrar otros Pokémon.' where num_pokedex = 162;
update pokedex set descripcion = 'Camina con un solo pie. Cambia tan rápidamente de pie que apenas se le ve.' where num_pokedex = 163;
update pokedex set descripcion = 'Sus ojos están especialmente adaptados, concentrando la luz para poder ver en la oscuridad.' where num_pokedex = 164;
update pokedex set descripcion = 'Es muy tímido. Tiene miedo de moverse cuando va solo. Pero si va en grupo, se vuelve muy activo.' where num_pokedex = 165;
update pokedex set descripcion = 'Cuando parpadean las estrellas en el cielo nocturno, se mece, desprendiendo un polvo brillante.' where num_pokedex = 166;
update pokedex set descripcion = 'Mantiene la misma postura en su telaraña durante días, esperando a que se acerque una presa inocente.' where num_pokedex = 167;
update pokedex set descripcion = 'Teje su telaraña desde atrás y desde su boca. Es muy difícil saber dónde está cada cual.' where num_pokedex = 168;
update pokedex set descripcion = 'Es tan silencioso cuando vuela en la oscuridad con sus cuatro alas, que cuesta percibirlo cuando se acerca.' where num_pokedex = 169;
update pokedex set descripcion = 'Descarga electricidad positiva y negativa entre las puntas de sus dos antenas y electrocuta al enemigo.' where num_pokedex = 170;
update pokedex set descripcion = 'La luz que emite es tan brillante que puede iluminar la superficie del mar desde unos 5 km de profundidad.' where num_pokedex = 171;
update pokedex set descripcion = 'Todavía no domina el almacenamiento de electricidad, y descargará un rayo si se divierte o asusta.' where num_pokedex = 172;
update pokedex set descripcion = 'Por su inusual forma estrellada, la gente cree que procede de un meteorito que cayó a la tierra.' where num_pokedex = 173;
update pokedex set descripcion = 'Su cuerpo es muy blando. Si se pone a rodar, rebotará contra todo y será imposible de parar.' where num_pokedex = 174;
update pokedex set descripcion = 'El cascarón parece estar lleno de alegría. Dicen que trae buena suerte si es tratado con cariño.' where num_pokedex = 175;
update pokedex set descripcion = 'Dicen que aparece entre gentes cuidadosas y de buen corazón, a quienes inunda de felicidad.' where num_pokedex = 176;
update pokedex set descripcion = 'Va dando saltitos porque sus alas no han crecido lo suficiente. Siempre está pendiente de algo.' where num_pokedex = 177;
update pokedex set descripcion = 'Dicen que se mantiene quieto y en silencio porque observa el pasado y el futuro al mismo tiempo.' where num_pokedex = 178;
update pokedex set descripcion = 'Cuando almacena electricidad en su cuerpo, dobla su volumen. Tócalo y recibirás una descarga.' where num_pokedex = 179;
update pokedex set descripcion = 'Como almacena tanta electricidad, ha desarrollado parches donde no crece ni la lana.' where num_pokedex = 180;
update pokedex set descripcion = 'La punta de su cola reluce brillantemente y puede ser vista desde lejos. Es usado como faro.' where num_pokedex = 181;
update pokedex set descripcion = 'Los Bellossom suelen reunirse para bailar. Dicen que sus danzas son un ritual para invocar al sol.' where num_pokedex = 182;
update pokedex set descripcion = 'La punta de su cola, que contiene aceite, le permite nadar sin miedo a ahogarse.' where num_pokedex = 183;
update pokedex set descripcion = 'Guardando silencio y prestando mucha atención puede saber lo que hay en los rápidos y salvajes ríos.' where num_pokedex = 184;
update pokedex set descripcion = 'Aunque pretende ser un árbol, en su composición se parece más a una roca que a una planta.' where num_pokedex = 185;
update pokedex set descripcion = 'Si Poliwag y Poliwhirl oyen su grito, responderán reuniéndose a lo largo y ancho de este mundo.' where num_pokedex = 186;
update pokedex set descripcion = 'Para evitar ser llevados por el viento, se reúnen en grupos, aunque adoran las suaves brisas.' where num_pokedex = 187;
update pokedex set descripcion = 'La flor de su cabeza se abre y cierra según suba o baje la temperatura.' where num_pokedex = 188;
update pokedex set descripcion = 'Si es llevado por el viento, podría dar la vuelta al mundo controlando el vuelo con sus esporas.' where num_pokedex = 189;
update pokedex set descripcion = 'Su cola es tan potente que puede usarla para agarrarse a la rama de un árbol y no caer.' where num_pokedex = 190;
update pokedex set descripcion = 'Puede caer del cielo de repente. Si le ataca un Spearow, moverá violentamente sus hojas.' where num_pokedex = 191;
update pokedex set descripcion = 'Convierte la luz solar en energía. En la oscuridad, tras el atardecer, cierra sus pétalos y queda inmóvil.' where num_pokedex = 192;
update pokedex set descripcion = 'Si aletea muy rápido, genera ondas expansivas capaces de hacer añicos todas las ventanas próximas.' where num_pokedex = 193;
update pokedex set descripcion = 'Este Pokémon vive en aguas frías. Sale del agua para buscar comida cuando refresca el ambiente.' where num_pokedex = 194;
update pokedex set descripcion = 'Este despreocupado Pokémon es de Naturaleza tranquila. Siempre que nada, choca con los barcos.' where num_pokedex = 195;
update pokedex set descripcion = 'Usa el corto pelaje que cubre su cuerpo para sentir el viento y predecir las acciones enemigas.' where num_pokedex = 196;
update pokedex set descripcion = 'Cuando se siente amenazado, este Pokémon se protege lanzando sudor venenoso por todos sus poros.' where num_pokedex = 197;
update pokedex set descripcion = 'Temido y odiado por muchos, dicen que trae la desgracia a todos aquéllos que lo ven por la noche.' where num_pokedex = 198;
update pokedex set descripcion = 'Su intelecto e intuición son increíbles. No pierde la compostura en ninguna situación.' where num_pokedex = 199;
update pokedex set descripcion = 'Le gusta hacer travesuras como gritar y aullar por la noche, para asustar a la gente.' where num_pokedex = 200;
update pokedex set descripcion = 'Tienen forma de jeroglíficos sobre lápidas antiguas. Dicen que ambos están relacionados.' where num_pokedex = 201;
update pokedex set descripcion = 'Odia la luz y las sacudidas. Si le atacan, infla su cuerpo para aumentar su contraataque.' where num_pokedex = 202;
update pokedex set descripcion = 'Su cola tiene un pequeño cerebro. ¡Cuidado! Si te acercas, puede reaccionar a tu olor y morder.' where num_pokedex = 203;
update pokedex set descripcion = 'Le gusta engrosar su coraza añadiendo cortezas de árbol. El aumento de peso no le molesta.' where num_pokedex = 204;
update pokedex set descripcion = 'Todo su cuerpo está protegido por una coraza de metal. Lo que esconde la coraza es un misterio.' where num_pokedex = 205;
update pokedex set descripcion = 'Este Pokémon escapa hacia atrás perforando el suelo con su cola, si es descubierto.' where num_pokedex = 206;
update pokedex set descripcion = 'Vuela directo a la cara del objetivo, y acaba con su aterrada víctima inyectándole veneno.' where num_pokedex = 207;
update pokedex set descripcion = 'Su cuerpo ha sido comprimido en el interior de la tierra, y por eso es hasta más duro que el diamante.' where num_pokedex = 208;
update pokedex set descripcion = 'Aunque parezca aterrador, en realidad es amable y afectuoso. Es muy popular entre las mujeres.' where num_pokedex = 209;
update pokedex set descripcion = 'Es muy tímido y asustadizo. Si se siente atacado, se moverá para evitar al enemigo.' where num_pokedex = 210;
update pokedex set descripcion = 'Para arrojar sus venenosas púas, infla su cuerpo bebiendo hasta 10 litros de agua de una sola vez.' where num_pokedex = 211;
update pokedex set descripcion = 'Mueve sus pinzas para asustar al enemigo. Por los dibujos de su cuerpo parece tener 3 cabezas.' where num_pokedex = 212;
update pokedex set descripcion = 'Las BAYAS que almacena en su concha se descomponen en un líquido pegajoso.' where num_pokedex = 213;
update pokedex set descripcion = 'Este fuerte Pokémon clava su preciado cuerno en la tripa del enemigo, lo eleva y luego lo arroja.' where num_pokedex = 214;
update pokedex set descripcion = 'Sus ocultas garras son muy afiladas. Si le atacan, extiende sus garras y asusta al enemigo.' where num_pokedex = 215;
update pokedex set descripcion = 'Si encuentra miel, brillará la marca de su frente. Se lame las garras cuando están llenas de miel.' where num_pokedex = 216;
update pokedex set descripcion = 'Aunque trepa muy bien, prefiere agitar los árboles con sus patas y comer las BAYAS caídas.' where num_pokedex = 217;
update pokedex set descripcion = 'No duerme nunca. Tiene que seguir moviéndose porque si se detiene, su cuerpo de lava podría enfriarse.' where num_pokedex = 218;
update pokedex set descripcion = 'La concha de su lomo son restos de piel enfriada y endurecida. Se rompe fácilmente con sólo tocarla.' where num_pokedex = 219;
update pokedex set descripcion = 'Frota su hocico contra el suelo para desenterrar comida. A veces descubre aguas termales.' where num_pokedex = 220;
update pokedex set descripcion = 'Como su largo vello corporal le impide ver con claridad, sigue atacando repetidamente.' where num_pokedex = 221;
update pokedex set descripcion = 'Crece y muda continuamente. La parte superior de su cabeza es muy apreciada por su belleza.' where num_pokedex = 222;
update pokedex set descripcion = 'Tiene muy buena puntería. Dispara agua a sus presas, hasta si se están moviendo, a más de 100 metros.' where num_pokedex = 223;
update pokedex set descripcion = 'Atrapa a los enemigos con sus tentáculos, y después los golpea con su dura cabeza.' where num_pokedex = 224;
update pokedex set descripcion = 'Siempre lleva comida. Dicen que hay muchos desaparecidos que sobrevivieron gracias a ésta.' where num_pokedex = 225;
update pokedex set descripcion = 'Mientras nada majestuosamente, no le importa que Remoraid le siga para comerse sus sobras.' where num_pokedex = 226;
update pokedex set descripcion = 'Sus fuertes alas parecen pesadas, aunque son huecas y ligeras, y le permiten volar libremente.' where num_pokedex = 227;
update pokedex set descripcion = 'Usa diferentes tipos de gritos para comunicarse con los de su especie, o para seguir a su presa.' where num_pokedex = 228;
update pokedex set descripcion = 'Si te quemas con las llamas que lanza por su boca, el dolor no desaparecerá nunca.' where num_pokedex = 229;
update pokedex set descripcion = 'Dicen que suele esconderse en cuevas submarinas. Puede crear torbellinos al bostezar.' where num_pokedex = 230;
update pokedex set descripcion = 'Mueve su larga trompa para jugar, pero como es tan fuerte, esto podría resultar peligroso.' where num_pokedex = 231;
update pokedex set descripcion = 'Tiene afilados y duros colmillos, y una gruesa piel. Su PLACAJE es tan fuerte que puede derribar una casa.' where num_pokedex = 232;
update pokedex set descripcion = 'Esta versión mejorada de Porygon fue creada para explorar el espacio, aunque no puede volar.' where num_pokedex = 233;
update pokedex set descripcion = 'Su cornamenta cambia el flujo del aire para crear un espacio de realidad distorsionada.' where num_pokedex = 234;
update pokedex set descripcion = 'La punta de su cola rezuma un fluido especial. Lo pinta todo con este líquido para marcar su terreno.' where num_pokedex = 235;
update pokedex set descripcion = 'Ataca siempre con mucha energía. Para fortalecerse a sí mismo, sigue luchando aunque pierda' where num_pokedex = 236;
update pokedex set descripcion = 'Si te gustan sus suaves, elegantes y danzarinas patadas, acabarás taladrado.' where num_pokedex = 237;
update pokedex set descripcion = 'Sus labios son la parte más sensible de su cuerpo. Siempre los usa para examinar las cosas.' where num_pokedex = 238;
update pokedex set descripcion = 'Gira sus brazos para generar electricidad, pero se agota rápido, así que sólo se recarga un poco.' where num_pokedex = 239;
update pokedex set descripcion = 'Cada vez que inspira y expira, lanza ascuas por su boca y por sus fosas nasales.' where num_pokedex = 240;
update pokedex set descripcion = 'Su leche, rica en nutrientes, es la mejor bebida contra el cansancio y la enfermedad.' where num_pokedex = 241;
update pokedex set descripcion = 'Cualquiera que pruebe un poco de huevo de Blissey, se volverá más amable y agradable con todos.' where num_pokedex = 242;
update pokedex set descripcion = 'Las nubes de lluvia que lleva le permiten lanzar rayos a voluntad. Dicen que apareció con un rayo.' where num_pokedex = 243;
update pokedex set descripcion = 'Cuando ladra, los volcanes entran en erupción. Como no puede controlar su poder, corre siempre en cabeza.' where num_pokedex = 244;
update pokedex set descripcion = 'Conocido como la reencarnación de los vientos del norte, puede purificar aguas turbias y sucias.' where num_pokedex = 245;
update pokedex set descripcion = 'Se alimenta de tierra. Después de comer una gran montaña, se duerme y empieza a crecer.' where num_pokedex = 246;
update pokedex set descripcion = 'Su caparazón es duro como una piedra, y muy resistente. Su GOLPE puede derribar montañas.' where num_pokedex = 247;
update pokedex set descripcion = 'Su cuerpo es casi inmune a los ataques. Por eso le encanta desafiar a sus enemigos.' where num_pokedex = 248;
update pokedex set descripcion = 'Dicen que permanece en silencio en el fondo del mar debido a su inmenso poder.' where num_pokedex = 249;
update pokedex set descripcion = 'Cuenta la leyenda que este Pokémon vuela por el cielo con sus magníficas alas de siete colores.' where num_pokedex = 250;
update pokedex set descripcion = 'Este Pokémon vaga por el tiempo. La hierba y los árboles crecen por los campos por donde pasa.' where num_pokedex = 251;

insert into objeto (nom_objeto, descripcion) values ('Jovani Vazquez', 'Te otorga el poder del mango, para poder dominar puerto rico');
insert into objeto (nom_objeto, precio, descripcion, categoria_objeto, ataque, defensa, velocidad) values ('PESA',5000,'Aumenta el ataque y la defensa un 20%, pero disminuye su velocidad un 20%', 'OBJETO',  0.20, 0.20, 0.20);
insert into objeto (nom_objeto, precio, descripcion, categoria_objeto, defensa, defensa_especial, velocidad)values  ('PLUMA',5000,'Aumenta la velocidad un 30%, pero disminuye la defensa y la defensa especial en un 20%.', 'OBJETO', 0.20,  0.20, 0.30);
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto, defensa, defensa_especial, velocidad, ataque) values ('CHALECO',5000,'Aumenta la defensa y la defensa especial un 20%, pero disminuye la velocidad y el ataque un 15%.',  'OBJETO', 0.20,  0.2, 0.15, 0.15);
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto, estamina, velocidad) values ('BASTON',5000,'Aumenta la generacion de estamina un 20%, pero disminuye en un 15% la velocidad.', 'OBJETO', 0.2, 0.15);
INSERT INTO objeto (nom_objeto, precio, descripcion, categoria_objeto, estamina,defensa_especial) VALUES ('PILAS', '5000', 'Recupera la estamina actual en un 50% de la estamina maxima, pero disminuye la defensa especial un 30%.', 'OBJETO' ,0.3, 0.5);

insert into objeto(nom_objeto, precio, descripcion, categoria_objeto, vitalidad) values ('POCION',300,'Medicina en spray, que cura heridas y restaura 20 PS de un POKÉMON.',  'BOTIQUIN', 20 );
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto, vitalidad) values ('SUPERPOCION',700,'Medicina en spray, que cura heridas y restaura 50 PS de un POKÉMON.',  'BOTIQUIN', 50);
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto, vitalidad) values ('HIPERPOCION',1500,'Medicina en spray, que cura heridas y restaura 200 PS de un POKÉMON.',  'BOTIQUIN', 200);

insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('ANTIDOTO',100,'Medicina en spray, que cura a un POKÉMON envenenado.',  'BOTIQUIN');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('ANTIPARALIZADOR',200,'Medicina en spray, que cura a un POKÉMON paralizado.',  'BOTIQUIN');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('DESPERTAR',250,'Medicina en spray, que despierta a un POKÉMON dormido.',  'BOTIQUIN');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('ANTIQUEMAR',250,'Medicina en spray, que cura a un POKÉMON quemado.',  'BOTIQUIN');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('ANTIHIELO',250,'Medicina en spray, que descongela a un POKÉMON.',  'BOTIQUIN');

insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('POKE BALL',200,'Sirve para atrapar POKÉMON salvajes. Parece una cápsula.',  'POKEBALL');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('SUPERBALL',600,'Es buena. Tiene más índice de éxito que la POKÉ BALL.',  'POKEBALL');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('ULTRABALL',1200,'Es muy buena. Tiene más índice que la SUPERBALL.',  'POKEBALL');
insert into objeto(nom_objeto, precio, descripcion, categoria_objeto) values ('MASTERBALL',500000,'Es la mejor. Atrapa siempre al pokémon. No falla.',  'POKEBALL');

insert into movimiento (nombre, id_tipo_movimiento) 
values 
('Burbuja', 2),
('Cascada', 2),
('Hidrobomba', 2),
('Martillazo', 2),
('Pistola agua', 2),
('Rayo burbuja', 2),
('Refugio', 2),
('Surf', 2),
('Tenaza', 2),
('Chupavidas', 3),
('Disparo demora', 3),
('Doble ataque', 3),
('Pin misil', 3),
('Furia dragón', 4),
('Impactrueno', 5),
('Onda trueno', 5),
('Puño trueno', 5),
('Rayo', 5),
('Trueno', 5),
('Lengüetazo', 6),
('Rayo confuso', 6),
('Tinieblas', 6),
('Ascuas', 7),
('Giro fuego', 7),
('Lanzallamas', 7),
('Lanzallamada', 7),
('Puño fuego', 7),
('Neblina', 8),
('Niebla', 8),
('Puño hielo', 8),
('Rayo aurora', 8),
('Rayo hielo', 8),
('Ventisca', 8),
('Contraataque', 9),
('Doble ataque', 9),
('Golpe kárate', 9),
('Patada baja', 9),
('Patada giro', 9),
('Patada salto', 9),
('Patada salto alta', 9),
('Sísmico', 9),
('Sumisión', 9),
('Afilar', 10),
('Agarre', 10),
('Anulación', 10),
('Arañazo', 10),
('Atadura', 10),
('Ataque furia', 10),
('Ataque rápido', 10),
('Atizar', 10),
('Autodestrucción', 10),
('Beso amoroso', 10),
('Bomba huevo', 10),
('Bomba sónica', 10),
('Bombardeo', 10),
('Cabezazo', 10),
('Canto', 10),
('Clavo cañón', 10),
('Constricción', 10),
('Conversión', 10),
('Cornada', 10),
('Corte', 10),
('Cuchillida', 10),
('Danza espada', 10),
('Derribo', 10),
('Desarrollo', 10),
('Deslumbrar', 10),
('Destello', 10),
('Destructor', 10),
('Día de pago', 10),
('Doble dofetón', 10),
('Doble equipo', 10),
('Doble filo', 10),
('Explosión', 10),
('Foco energía', 10),
('Fortaleza', 10),
('Fuerza', 10),
('Furia', 10),
('Golpe cabeza', 10),
('Golpe cuerpo', 10),
('Golpes furia', 10),
('Gruñido', 10),
('Guillotina', 10),
('Hipercolmillo', 10),
('Hiperrayo', 10),
('Látigo', 10),
('Malicioso', 10),
('Megapatada', 10),
('Megapuño', 10),
('Meteoros', 10),
('Metrónomo', 10),
('Ovocuración', 10),
('Pantalla de humo', 10),
('Perforador', 10),
('Pisotón', 10),
('Placaje', 10),
('Puño cometa', 10),
('Puño mareo', 10),
('Metrónomo', 10),
('Recuperación', 10),
('Reducción', 10),
('Remolino', 10),
('Restricción', 10),
('Rizo defensa', 10),
('Rugido', 10),
('Salpicadura', 10),
('Saña', 10),
('Superdiente', 10),
('Supersónico', 10),
('Sustituto', 10),
('Transformación', 10),
('Triataque', 10),
('Venganza', 10),
('Viento cortante', 10),
('Chirrido', 10),
('Absorber', 11),
('Danza pétalo', 11),
('Drenadoras', 11),
('Espora', 11),
('Hoja afilada', 11),
('Látigo cepa', 11),
('Megaagotar', 11),
('Parilizador', 11),
('Rayo solar', 11),
('Somnífero', 11),
('Agilidad', 12),
('Amnesia', 12),
('Barrera', 12),
('Comesueños', 12),
('Confusión', 12),
('Descanso', 12),
('Hipnosis', 12),
('Kinético', 12),
('Meditación', 12),
('Pantalla de luz', 12),
('Psicoonda', 12),
('Psicorrayo', 12),
('Psíquico', 12),
('Reflejo', 12),
('Teletransporte', 12),
('Avalancha', 13),
('Lanzarrocas', 13),
('Mordisco', 14),
('Ataque arena', 15),
('Excavar', 15),
('Fisura', 15),
('Hueso palo', 15),
('Huesomerang', 15),
('Terremoto', 15),
('Ácido', 16),
('Armadura ácida', 16),
('Gas venenoso', 16),
('Picotazo veneno', 16),
('Polución', 16),
('Polvo veneno', 16),
('Residuos', 16),
('Tóxico', 16),
('Ataque aéreo', 17),
('Ataque ala', 17),
('Espejo', 17),
('Pico taladro', 17),
('Picotazo', 17),
('Tornado', 17),
('Vuelo', 17),
('Ala de acero', 1),
('Cola férrea', 1),
('Garra metal', 1),
('Danza lluvia', 2),
('Pulpocañón', 2),
('Torbellino', 2),
('Corte de furia', 3),
('Megacuerno', 3),
('Telaraña', 3),
('Ciclón', 4),
('Dragoaliento', 4),
('Enfado', 4),
('Chispa', 5),
('Electrocañón', 5),
('Bola sombra', 6),
('Maldición', 6),
('Mismo destino', 6),
('Pesadilla', 6),
('Rencor', 6),
('Día soleado', 7),
('Fuego sagrado', 7),
('Rueda fuego', 7),
('Beso dulce', 10),
('Encanto', 10),
('Luz lunar', 10),
('Nieve polvo', 8),
('Viento hielo', 8),
('Detección', 9),
('Golpe roca', 9),
('Inviersión', 9),
('Llave vital', 9),
('Puño dinámico', 9),
('Tajo cruzado', 9),
('Triple patada', 9),
('Ultrapuño', 9),
('Aguante', 10),
('Atracción', 10),
('Autosugestión', 10),
('Azote', 10),
('Batido', 10),
('Canto mortal', 10),
('Cara susto', 10),
('Cascabel cura', 10),
('Contoneo', 10),
('Conversión2', 10),
('Divide dolor', 10),
('Dulce aroma', 10),
('Esquema', 10),
('Falso tortazo', 10),
('Fijar blanco', 10),
('Frustración', 10),
('Giro rápido', 10),
('Mal de ojo', 10),
('Otra vez', 10),
('Poder oculto', 10),
('Presente', 10),
('Profecía', 10),
('Protección', 10),
('Relevo', 10),
('Retribución', 10),
('Ronquido', 10),
('Sol matinal', 10),
('Sonámbulo', 10),
('Tambor', 10),
('Telépata', 10),
('Velo sagrado', 10),
('Velocidad extrema', 10),
('Esporagodón', 11),
('Gigadrenado', 11),
('Síntesis', 11),
('Manto espejo', 12),
('Premonición', 12),
('Poder pasado', 13),
('Rodar', 13),
('Tormenta arena', 13),
('Finta', 14),
('Ladrón', 14),
('Paliza', 14),
('Persecución', 14),
('Triturar', 14),
('Ataque óseo', 15),
('Bofetón lodo', 15),
('Magnitud', 15),
('Púas', 15),
('Bomba lodo', 10),
('Aerochorro', 10);

insert into estado (nombre, tipo_estado)
values
('PARALIZADO', 'PERSISTENTE'),
('QUEMADO', 'PERSISTENTE'),
('ENVENENADO', 'PERSISTENTE'),
('GRAVEMENTE_ENVENENADO', 'PERSISTENTE'),
('CONGELADO', 'PERSISTENTE'),
('DORMIDO', 'TEMPORAL'),
('CONFUSO', 'TEMPORAL'),
('DRENADORAS', 'TEMPORAL'),
('AMENDRENTADO', 'TEMPORAL'),
('DEBILITADO', 'OTRO_ESTADO'),
('NORMAL', 'OTRO_ESTADO');

update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/1.gif' where num_pokedex = 1;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/2.gif' where num_pokedex = 2;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/3.gif' where num_pokedex = 3;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/4.gif' where num_pokedex = 4;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/5.gif' where num_pokedex = 5;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/6.gif' where num_pokedex = 6;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/7.gif' where num_pokedex = 7;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/8.gif' where num_pokedex = 8;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/9.gif' where num_pokedex = 9;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/10.gif' where num_pokedex = 10;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/11.gif' where num_pokedex = 11;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/12.gif' where num_pokedex = 12;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/13.gif' where num_pokedex = 13;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/14.gif' where num_pokedex = 14;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/15.gif' where num_pokedex = 15;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/16.gif' where num_pokedex = 16;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/17.gif' where num_pokedex = 17;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/18.gif' where num_pokedex = 18;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/19.gif' where num_pokedex = 19;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/20.gif' where num_pokedex = 20;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/21.gif' where num_pokedex = 21;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/22.gif' where num_pokedex = 22;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/23.gif' where num_pokedex = 23;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/24.gif' where num_pokedex = 24;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/25.gif' where num_pokedex = 25;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/26.gif' where num_pokedex = 26;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/27.gif' where num_pokedex = 27;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/28.gif' where num_pokedex = 28;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/29.gif' where num_pokedex = 29;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/30.gif' where num_pokedex = 30;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/31.gif' where num_pokedex = 31;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/32.gif' where num_pokedex = 32;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/33.gif' where num_pokedex = 33;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/34.gif' where num_pokedex = 34;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/35.gif' where num_pokedex = 35;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/36.gif' where num_pokedex = 36;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/37.gif' where num_pokedex = 37;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/38.gif' where num_pokedex = 38;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/39.gif' where num_pokedex = 39;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/40.gif' where num_pokedex = 40;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/41.gif' where num_pokedex = 41;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/42.gif' where num_pokedex = 42;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/43.gif' where num_pokedex = 43;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/44.gif' where num_pokedex = 44;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/45.gif' where num_pokedex = 45;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/46.gif' where num_pokedex = 46;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/47.gif' where num_pokedex = 47;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/48.gif' where num_pokedex = 48;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/49.gif' where num_pokedex = 49;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/50.gif' where num_pokedex = 50;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/51.gif' where num_pokedex = 51;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/52.gif' where num_pokedex = 52;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/53.gif' where num_pokedex = 53;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/54.gif' where num_pokedex = 54;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/55.gif' where num_pokedex = 55;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/56.gif' where num_pokedex = 56;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/57.gif' where num_pokedex = 57;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/58.gif' where num_pokedex = 58;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/59.gif' where num_pokedex = 59;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/60.gif' where num_pokedex = 60;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/61.gif' where num_pokedex = 61;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/62.gif' where num_pokedex = 62;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/63.gif' where num_pokedex = 63;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/64.gif' where num_pokedex = 64;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/65.gif' where num_pokedex = 65;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/66.gif' where num_pokedex = 66;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/67.gif' where num_pokedex = 67;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/68.gif' where num_pokedex = 68;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/69.gif' where num_pokedex = 69;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/70.gif' where num_pokedex = 70;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/71.gif' where num_pokedex = 71;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/72.gif' where num_pokedex = 72;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/73.gif' where num_pokedex = 73;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/74.gif' where num_pokedex = 74;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/75.gif' where num_pokedex = 75;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/76.gif' where num_pokedex = 76;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/77.gif' where num_pokedex = 77;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/78.gif' where num_pokedex = 78;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/79.gif' where num_pokedex = 79;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/80.gif' where num_pokedex = 80;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/81.gif' where num_pokedex = 81;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/82.gif' where num_pokedex = 82;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/83.gif' where num_pokedex = 83;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/84.gif' where num_pokedex = 84;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/85.gif' where num_pokedex = 85;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/86.gif' where num_pokedex = 86;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/87.gif' where num_pokedex = 87;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/88.gif' where num_pokedex = 88;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/89.gif' where num_pokedex = 89;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/90.gif' where num_pokedex = 90;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/91.gif' where num_pokedex = 91;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/92.gif' where num_pokedex = 92;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/93.gif' where num_pokedex = 93;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/94.gif' where num_pokedex = 94;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/95.gif' where num_pokedex = 95;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/96.gif' where num_pokedex = 96;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/97.gif' where num_pokedex = 97;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/98.gif' where num_pokedex = 98;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/99.gif' where num_pokedex = 99;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/100.gif' where num_pokedex = 100;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/101.gif' where num_pokedex = 101;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/102.gif' where num_pokedex = 102;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/103.gif' where num_pokedex = 103;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/104.gif' where num_pokedex = 104;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/105.gif' where num_pokedex = 105;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/106.gif' where num_pokedex = 106;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/107.gif' where num_pokedex = 107;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/108.gif' where num_pokedex = 108;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/109.gif' where num_pokedex = 109;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/110.gif' where num_pokedex = 110;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/111.gif' where num_pokedex = 111;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/112.gif' where num_pokedex = 112;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/113.gif' where num_pokedex = 113;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/114.gif' where num_pokedex = 114;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/115.gif' where num_pokedex = 115;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/116.gif' where num_pokedex = 116;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/117.gif' where num_pokedex = 117;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/118.gif' where num_pokedex = 118;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/119.gif' where num_pokedex = 119;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/120.gif' where num_pokedex = 120;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/121.gif' where num_pokedex = 121;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/122.gif' where num_pokedex = 122;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/123.gif' where num_pokedex = 123;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/124.gif' where num_pokedex = 124;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/125.gif' where num_pokedex = 125;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/126.gif' where num_pokedex = 126;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/127.gif' where num_pokedex = 127;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/128.gif' where num_pokedex = 128;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/129.gif' where num_pokedex = 129;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/130.gif' where num_pokedex = 130;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/131.gif' where num_pokedex = 131;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/132.gif' where num_pokedex = 132;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/133.gif' where num_pokedex = 133;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/134.gif' where num_pokedex = 134;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/135.gif' where num_pokedex = 135;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/136.gif' where num_pokedex = 136;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/137.gif' where num_pokedex = 137;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/138.gif' where num_pokedex = 138;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/139.gif' where num_pokedex = 139;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/140.gif' where num_pokedex = 140;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/141.gif' where num_pokedex = 141;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/142.gif' where num_pokedex = 142;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/143.gif' where num_pokedex = 143;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/144.gif' where num_pokedex = 144;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/145.gif' where num_pokedex = 145;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/146.gif' where num_pokedex = 146;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/147.gif' where num_pokedex = 147;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/148.gif' where num_pokedex = 148;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/149.gif' where num_pokedex = 149;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/150.gif' where num_pokedex = 150;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/151.gif' where num_pokedex = 151;

update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/152.gif' where num_pokedex = 152;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/153.gif' where num_pokedex = 153;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/154.gif' where num_pokedex = 154;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/155.gif' where num_pokedex = 155;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/156.gif' where num_pokedex = 156;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/157.gif' where num_pokedex = 157;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/158.gif' where num_pokedex = 158;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/159.gif' where num_pokedex = 159;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/160.gif' where num_pokedex = 160;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/161.gif' where num_pokedex = 161;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/162.gif' where num_pokedex = 162;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/163.gif' where num_pokedex = 163;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/164.gif' where num_pokedex = 164;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/165.gif' where num_pokedex = 165;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/166.gif' where num_pokedex = 166;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/167.gif' where num_pokedex = 167;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/168.gif' where num_pokedex = 168;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/169.gif' where num_pokedex = 169;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/170.gif' where num_pokedex = 170;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/171.gif' where num_pokedex = 171;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/172.gif' where num_pokedex = 172;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/173.gif' where num_pokedex = 173;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/174.gif' where num_pokedex = 174;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/175.gif' where num_pokedex = 175;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/176.gif' where num_pokedex = 176;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/177.gif' where num_pokedex = 177;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/178.gif' where num_pokedex = 178;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/179.gif' where num_pokedex = 179;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/180.gif' where num_pokedex = 180;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/181.gif' where num_pokedex = 181;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/182.gif' where num_pokedex = 182;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/183.gif' where num_pokedex = 183;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/184.gif' where num_pokedex = 184;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/185.gif' where num_pokedex = 185;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/186.gif' where num_pokedex = 186;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/187.gif' where num_pokedex = 187;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/188.gif' where num_pokedex = 188;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/189.gif' where num_pokedex = 189;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/190.gif' where num_pokedex = 190;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/191.gif' where num_pokedex = 191;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/192.gif' where num_pokedex = 192;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/193.gif' where num_pokedex = 193;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/194.gif' where num_pokedex = 194;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/195.gif' where num_pokedex = 195;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/196.gif' where num_pokedex = 196;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/197.gif' where num_pokedex = 197;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/198.gif' where num_pokedex = 198;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/199.gif' where num_pokedex = 199;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/200.gif' where num_pokedex = 200;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/201.gif' where num_pokedex = 201;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/202.gif' where num_pokedex = 202;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/203.gif' where num_pokedex = 203;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/204.gif' where num_pokedex = 204;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/205.gif' where num_pokedex = 205;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/206.gif' where num_pokedex = 206;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/207.gif' where num_pokedex = 207;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/208.gif' where num_pokedex = 208;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/209.gif' where num_pokedex = 209;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/210.gif' where num_pokedex = 210;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/211.gif' where num_pokedex = 211;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/212.gif' where num_pokedex = 212;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/213.gif' where num_pokedex = 213;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/214.gif' where num_pokedex = 214;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/215.gif' where num_pokedex = 215;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/216.gif' where num_pokedex = 216;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/217.gif' where num_pokedex = 217;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/218.gif' where num_pokedex = 218;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/219.gif' where num_pokedex = 219;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/220.gif' where num_pokedex = 220;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/221.gif' where num_pokedex = 221;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/222.gif' where num_pokedex = 222;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/223.gif' where num_pokedex = 223;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/224.gif' where num_pokedex = 224;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/225.gif' where num_pokedex = 225;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/226.gif' where num_pokedex = 226;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/227.gif' where num_pokedex = 227;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/228.gif' where num_pokedex = 228;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/229.gif' where num_pokedex = 229;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/230.gif' where num_pokedex = 230;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/231.gif' where num_pokedex = 231;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/232.gif' where num_pokedex = 232;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/233.gif' where num_pokedex = 233;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/234.gif' where num_pokedex = 234;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/235.gif' where num_pokedex = 235;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/236.gif' where num_pokedex = 236;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/237.gif' where num_pokedex = 237;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/238.gif' where num_pokedex = 238;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/239.gif' where num_pokedex = 239;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/240.gif' where num_pokedex = 240;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/241.gif' where num_pokedex = 241;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/242.gif' where num_pokedex = 242;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/243.gif' where num_pokedex = 243;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/244.gif' where num_pokedex = 244;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/245.gif' where num_pokedex = 245;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/246.gif' where num_pokedex = 246;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/247.gif' where num_pokedex = 247;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/248.gif' where num_pokedex = 248;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/249.gif' where num_pokedex = 249;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/250.gif' where num_pokedex = 250;
update pokedex set ruta_sprite = 'recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/251.gif' where num_pokedex = 251;

update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/1.mp3' where num_pokedex = 1;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/2.mp3' where num_pokedex = 2;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/3.mp3' where num_pokedex = 3;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/4.mp3' where num_pokedex = 4;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/5.mp3' where num_pokedex = 5;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/6.mp3' where num_pokedex = 6;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/7.mp3' where num_pokedex = 7;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/8.mp3' where num_pokedex = 8;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/9.mp3' where num_pokedex = 9;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/10.mp3' where num_pokedex = 10;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/11.mp3' where num_pokedex = 11;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/12.mp3' where num_pokedex = 12;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/13.mp3' where num_pokedex = 13;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/14.mp3' where num_pokedex = 14;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/15.mp3' where num_pokedex = 15;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/16.mp3' where num_pokedex = 16;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/17.mp3' where num_pokedex = 17;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/18.mp3' where num_pokedex = 18;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/19.mp3' where num_pokedex = 19;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/20.mp3' where num_pokedex = 20;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/21.mp3' where num_pokedex = 21;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/22.mp3' where num_pokedex = 22;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/23.mp3' where num_pokedex = 23;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/24.mp3' where num_pokedex = 24;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/25.mp3' where num_pokedex = 25;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/26.mp3' where num_pokedex = 26;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/27.mp3' where num_pokedex = 27;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/28.mp3' where num_pokedex = 28;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/29.mp3' where num_pokedex = 29;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/30.mp3' where num_pokedex = 30;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/31.mp3' where num_pokedex = 31;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/32.mp3' where num_pokedex = 32;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/33.mp3' where num_pokedex = 33;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/34.mp3' where num_pokedex = 34;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/35.mp3' where num_pokedex = 35;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/36.mp3' where num_pokedex = 36;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/37.mp3' where num_pokedex = 37;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/38.mp3' where num_pokedex = 38;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/39.mp3' where num_pokedex = 39;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/40.mp3' where num_pokedex = 40;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/41.mp3' where num_pokedex = 41;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/42.mp3' where num_pokedex = 42;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/43.mp3' where num_pokedex = 43;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/44.mp3' where num_pokedex = 44;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/45.mp3' where num_pokedex = 45;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/46.mp3' where num_pokedex = 46;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/47.mp3' where num_pokedex = 47;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/48.mp3' where num_pokedex = 48;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/49.mp3' where num_pokedex = 49;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/50.mp3' where num_pokedex = 50;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/51.mp3' where num_pokedex = 51;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/52.mp3' where num_pokedex = 52;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/53.mp3' where num_pokedex = 53;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/54.mp3' where num_pokedex = 54;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/55.mp3' where num_pokedex = 55;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/56.mp3' where num_pokedex = 56;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/57.mp3' where num_pokedex = 57;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/58.mp3' where num_pokedex = 58;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/59.mp3' where num_pokedex = 59;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/60.mp3' where num_pokedex = 60;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/61.mp3' where num_pokedex = 61;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/62.mp3' where num_pokedex = 62;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/63.mp3' where num_pokedex = 63;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/64.mp3' where num_pokedex = 64;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/65.mp3' where num_pokedex = 65;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/66.mp3' where num_pokedex = 66;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/67.mp3' where num_pokedex = 67;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/68.mp3' where num_pokedex = 68;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/69.mp3' where num_pokedex = 69;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/70.mp3' where num_pokedex = 70;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/71.mp3' where num_pokedex = 71;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/72.mp3' where num_pokedex = 72;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/73.mp3' where num_pokedex = 73;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/74.mp3' where num_pokedex = 74;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/75.mp3' where num_pokedex = 75;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/76.mp3' where num_pokedex = 76;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/77.mp3' where num_pokedex = 77;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/78.mp3' where num_pokedex = 78;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/79.mp3' where num_pokedex = 79;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/80.mp3' where num_pokedex = 80;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/81.mp3' where num_pokedex = 81;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/82.mp3' where num_pokedex = 82;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/83.mp3' where num_pokedex = 83;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/84.mp3' where num_pokedex = 84;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/85.mp3' where num_pokedex = 85;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/86.mp3' where num_pokedex = 86;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/87.mp3' where num_pokedex = 87;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/88.mp3' where num_pokedex = 88;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/89.mp3' where num_pokedex = 89;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/90.mp3' where num_pokedex = 90;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/91.mp3' where num_pokedex = 91;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/92.mp3' where num_pokedex = 92;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/93.mp3' where num_pokedex = 93;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/94.mp3' where num_pokedex = 94;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/95.mp3' where num_pokedex = 95;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/96.mp3' where num_pokedex = 96;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/97.mp3' where num_pokedex = 97;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/98.mp3' where num_pokedex = 98;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/99.mp3' where num_pokedex = 99;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/100.mp3' where num_pokedex = 100;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/101.mp3' where num_pokedex = 101;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/102.mp3' where num_pokedex = 102;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/103.mp3' where num_pokedex = 103;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/104.mp3' where num_pokedex = 104;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/105.mp3' where num_pokedex = 105;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/106.mp3' where num_pokedex = 106;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/107.mp3' where num_pokedex = 107;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/108.mp3' where num_pokedex = 108;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/109.mp3' where num_pokedex = 109;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/110.mp3' where num_pokedex = 110;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/111.mp3' where num_pokedex = 111;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/112.mp3' where num_pokedex = 112;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/113.mp3' where num_pokedex = 113;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/114.mp3' where num_pokedex = 114;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/115.mp3' where num_pokedex = 115;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/116.mp3' where num_pokedex = 116;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/117.mp3' where num_pokedex = 117;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/118.mp3' where num_pokedex = 118;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/119.mp3' where num_pokedex = 119;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/120.mp3' where num_pokedex = 120;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/121.mp3' where num_pokedex = 121;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/122.mp3' where num_pokedex = 122;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/123.mp3' where num_pokedex = 123;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/124.mp3' where num_pokedex = 124;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/125.mp3' where num_pokedex = 125;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/126.mp3' where num_pokedex = 126;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/127.mp3' where num_pokedex = 127;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/128.mp3' where num_pokedex = 128;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/129.mp3' where num_pokedex = 129;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/130.mp3' where num_pokedex = 130;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/131.mp3' where num_pokedex = 131;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/132.mp3' where num_pokedex = 132;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/133.mp3' where num_pokedex = 133;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/134.mp3' where num_pokedex = 134;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/135.mp3' where num_pokedex = 135;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/136.mp3' where num_pokedex = 136;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/137.mp3' where num_pokedex = 137;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/138.mp3' where num_pokedex = 138;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/139.mp3' where num_pokedex = 139;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/140.mp3' where num_pokedex = 140;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/141.mp3' where num_pokedex = 141;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/142.mp3' where num_pokedex = 142;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/143.mp3' where num_pokedex = 143;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/144.mp3' where num_pokedex = 144;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/145.mp3' where num_pokedex = 145;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/146.mp3' where num_pokedex = 146;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/147.mp3' where num_pokedex = 147;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/148.mp3' where num_pokedex = 148;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/149.mp3' where num_pokedex = 149;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/150.mp3' where num_pokedex = 150;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen1/151.mp3' where num_pokedex = 151;

update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/152.mp3' where num_pokedex = 152;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/153.mp3' where num_pokedex = 153;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/154.mp3' where num_pokedex = 154;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/155.mp3' where num_pokedex = 155;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/156.mp3' where num_pokedex = 156;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/157.mp3' where num_pokedex = 157;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/158.mp3' where num_pokedex = 158;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/159.mp3' where num_pokedex = 159;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/160.mp3' where num_pokedex = 160;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/161.mp3' where num_pokedex = 161;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/162.mp3' where num_pokedex = 162;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/163.mp3' where num_pokedex = 163;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/164.mp3' where num_pokedex = 164;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/165.mp3' where num_pokedex = 165;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/166.mp3' where num_pokedex = 166;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/167.mp3' where num_pokedex = 167;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/168.mp3' where num_pokedex = 168;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/169.mp3' where num_pokedex = 169;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/170.mp3' where num_pokedex = 170;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/171.mp3' where num_pokedex = 171;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/172.mp3' where num_pokedex = 172;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/173.mp3' where num_pokedex = 173;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/174.mp3' where num_pokedex = 174;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/175.mp3' where num_pokedex = 175;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/176.mp3' where num_pokedex = 176;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/177.mp3' where num_pokedex = 177;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/178.mp3' where num_pokedex = 178;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/179.mp3' where num_pokedex = 179;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/180.mp3' where num_pokedex = 180;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/181.mp3' where num_pokedex = 181;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/182.mp3' where num_pokedex = 182;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/183.mp3' where num_pokedex = 183;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/184.mp3' where num_pokedex = 184;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/185.mp3' where num_pokedex = 185;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/186.mp3' where num_pokedex = 186;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/187.mp3' where num_pokedex = 187;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/188.mp3' where num_pokedex = 188;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/189.mp3' where num_pokedex = 189;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/190.mp3' where num_pokedex = 190;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/191.mp3' where num_pokedex = 191;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/192.mp3' where num_pokedex = 192;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/193.mp3' where num_pokedex = 193;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/194.mp3' where num_pokedex = 194;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/195.mp3' where num_pokedex = 195;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/196.mp3' where num_pokedex = 196;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/197.mp3' where num_pokedex = 197;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/198.mp3' where num_pokedex = 198;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/199.mp3' where num_pokedex = 199;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/200.mp3' where num_pokedex = 200;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/201.mp3' where num_pokedex = 201;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/202.mp3' where num_pokedex = 202;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/203.mp3' where num_pokedex = 203;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/204.mp3' where num_pokedex = 204;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/205.mp3' where num_pokedex = 205;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/206.mp3' where num_pokedex = 206;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/207.mp3' where num_pokedex = 207;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/208.mp3' where num_pokedex = 208;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/209.mp3' where num_pokedex = 209;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/210.mp3' where num_pokedex = 210;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/211.mp3' where num_pokedex = 211;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/212.mp3' where num_pokedex = 212;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/213.mp3' where num_pokedex = 213;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/214.mp3' where num_pokedex = 214;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/215.mp3' where num_pokedex = 215;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/216.mp3' where num_pokedex = 216;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/217.mp3' where num_pokedex = 217;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/218.mp3' where num_pokedex = 218;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/219.mp3' where num_pokedex = 219;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/220.mp3' where num_pokedex = 220;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/221.mp3' where num_pokedex = 221;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/222.mp3' where num_pokedex = 222;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/223.mp3' where num_pokedex = 223;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/224.mp3' where num_pokedex = 224;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/225.mp3' where num_pokedex = 225;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/226.mp3' where num_pokedex = 226;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/227.mp3' where num_pokedex = 227;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/228.mp3' where num_pokedex = 228;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/229.mp3' where num_pokedex = 229;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/230.mp3' where num_pokedex = 230;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/231.mp3' where num_pokedex = 231;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/232.mp3' where num_pokedex = 232;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/233.mp3' where num_pokedex = 233;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/234.mp3' where num_pokedex = 234;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/235.mp3' where num_pokedex = 235;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/236.mp3' where num_pokedex = 236;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/237.mp3' where num_pokedex = 237;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/238.mp3' where num_pokedex = 238;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/239.mp3' where num_pokedex = 239;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/240.mp3' where num_pokedex = 240;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/241.mp3' where num_pokedex = 241;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/242.mp3' where num_pokedex = 242;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/243.mp3' where num_pokedex = 243;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/244.mp3' where num_pokedex = 244;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/245.mp3' where num_pokedex = 245;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/246.mp3' where num_pokedex = 246;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/247.mp3' where num_pokedex = 247;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/248.mp3' where num_pokedex = 248;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/249.mp3' where num_pokedex = 249;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/250.mp3' where num_pokedex = 250;
update pokedex set ruta_cry = 'recursos/audios/Original_Pokemon_Cries/Gen2/251.mp3' where num_pokedex = 251;
