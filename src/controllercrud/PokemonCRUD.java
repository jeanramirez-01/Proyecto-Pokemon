package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import mecanicaspokemon.Movimiento;
import mecanicaspokemon.Pokemon;
import mecanicaspokemon.TipoPokemon;

public class PokemonCRUD {

	public static void insertPokemonInicial(int id) {

		String query = "Insert into pokemon (num_pokedex, vitalidad, ataque, defensa, ataque_especial, defensa_especial, velocidad, sexo)\n"
				+ "values (?,?,?,?,?,?,?,?);";

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			Pokemon pokemon = PokedexCRUD.selectStatsBase(id);
			preparedStatement.setInt(1, pokemon.getIdPokemon());
			preparedStatement.setInt(2, pokemon.getVitalidadMaxima());
			preparedStatement.setInt(3, pokemon.getAtaqueMaxima());
			preparedStatement.setInt(4, pokemon.getDefensaMaxima());
			preparedStatement.setInt(5, pokemon.getAtaqueEspecialMaxima());
			preparedStatement.setInt(6, pokemon.getDefensaEspecialMaxima());
			preparedStatement.setInt(7, pokemon.getVelocidadMaxima());
			Random random = new Random();
			String opciones = "HMN";
			int randomInt = random.nextInt(opciones.length());
			char sexo = opciones.charAt(randomInt);

			preparedStatement.setString(8, String.valueOf(sexo));
			preparedStatement.executeUpdate();
			crearMovimientoPokemon(selectIdPokemonRecienInsertado());

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * @param nombre
	 * @return
	 */
	public static String selectRutaSprite(int id) {

		String query = "Select ruta_sprite\n" + "from pokedex\n" + "where num_pokedex = " + id + ";";
		String ruta = "";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				ruta = resultSet.getString("ruta_sprite");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ruta;
	}

	public static String selectRutaSonidoPokemon(int id) {

		String query = "Select ruta_cry\n" + "from pokedex\n" + "where num_pokedex = " + id + ";";
		String ruta = "";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				ruta = resultSet.getString("ruta_cry");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ruta;
	}

	public static int selectIdPokemonRecienInsertado() {
		String query = "Select max(id_pokemon) as id_pokemon from pokemon";
		int id = 0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				id = resultSet.getInt("id_pokemon");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	private static void crearMovimientoPokemon(int id) {

		String query = "Insert into pokemon_movimiento (id_pokemon) values (?)";

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);

			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public static Pokemon cargarPokemon(int id_pokemon) {

		String query = "Select P.nom_pokemon, T1.nombre as tipo1, T2.nombre as tipo2, P.descripcion, Pk.mote, Pk.vitalidad, Pk.ataque, Pk.defensa, Pk.ataque_especial, Pk.defensa_especial, Pk.velocidad, Pk.estamina, Pk.nivel, Pk.sexo, Pk.experiencia\n"
				+ "from pokemon Pk\n" + "join pokedex P on Pk.num_pokedex = P.num_pokedex\n"
				+ "JOIN tipo T1 ON T1.id_tipo = P.tipo_primario\n"
				+ "left JOIN tipo T2 ON T2.id_tipo = P.tipo_secundario\n" + "where Pk.id_pokemon = " + id_pokemon + ";";
		Pokemon pk = null;

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String nom = resultSet.getString("nom_pokemon");
				String tipo1 = resultSet.getString("tipo1");
				String tipo2 = resultSet.getString("tipo2");
				String mote = resultSet.getString("mote");
				int vt = resultSet.getInt("vitalidad");
				int at = resultSet.getInt("ataque");
				int df = resultSet.getInt("defensa");
				int atE = resultSet.getInt("ataque_especial");
				int dfE = resultSet.getInt("defensa_especial");
				int vl = resultSet.getInt("velocidad");
				int st = resultSet.getInt("estamina");
				int nv = resultSet.getInt("nivel");
				String sexo = resultSet.getString("sexo");
				int exp = resultSet.getInt("experiencia");
				String desc = resultSet.getString("descripcion");
				Movimiento[] mov = MovimientoCRUD.cargarMovimientosPokemon(id_pokemon);

				if (tipo2 == null) {
					TipoPokemon[] tip1 = { TipoPokemon.valueOf(tipo1) };
					pk = new Pokemon(nom, tip1, mote, vt, at, df, atE, dfE, vl, st, nv, sexo, exp, mov, desc);
				} else {
					TipoPokemon[] tip1 = { TipoPokemon.valueOf(tipo1), TipoPokemon.valueOf(tipo2) };
					pk = new Pokemon(nom, tip1, mote, vt, at, df, atE, dfE, vl, st, nv, sexo, exp, mov, desc);
				}

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return pk;
	}

}