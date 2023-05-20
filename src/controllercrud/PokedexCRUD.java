package controllercrud;

import mecanicaspokemon.Pokemon;
import mecanicaspokemon.TipoPokemon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class PokedexCRUD {

	/**
	 * @return
	 */
	public static LinkedList<Pokemon> selectPokedex() {

		String query = "Select P.num_pokedex, P.nom_pokemon, T1.nombre as tipo1, T2.nombre as tipo2,\n"
				+ "P.descripcion\n" + "from pokedex P\n" + "JOIN tipo T1 ON T1.id_tipo = P.tipo_primario\n"
				+ "left JOIN tipo T2 ON T2.id_tipo = P.tipo_secundario\n" + "order by p.num_pokedex";

		PreparedStatement preparedStatement = null;
		Pokemon single = null;
		LinkedList<Pokemon> pokedex = new LinkedList<>();
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {

				int id_pokemon = resultSet.getInt("num_pokedex");
				String name = resultSet.getString("nom_pokemon");
				String tipo1 = resultSet.getString("tipo1");
				String tipo2 = resultSet.getString("tipo2");
				String descripcion = resultSet.getString("descripcion");

				if (tipo2 == null) {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1) };
					single = new Pokemon(id_pokemon, name, tipo, descripcion);
				} else {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1), TipoPokemon.valueOf(tipo2) };
					single = new Pokemon(id_pokemon, name, tipo, descripcion);
				}
				pokedex.add(single);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return pokedex;
	}

	public static Pokemon selectStatsBase(int id) {

		String query = "select num_pokedex, vitalidad_base, ataque_base, defensa_base, ataque_especial_base, defensa_especial_base, velocidad_base\r\n"
				+ "from pokedex\n" + "where num_pokedex = " + id + ";";
		PreparedStatement preparedStatement = null;
		Pokemon single = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int num_pokedex = resultSet.getInt("num_pokedex");
				int vtBS = resultSet.getInt("vitalidad_base");
				int atBS = resultSet.getInt("ataque_base");
				int dfBS = resultSet.getInt("defensa_base");
				int atEBS = resultSet.getInt("ataque_especial_base");
				int dfEBS = resultSet.getInt("defensa_especial_base");
				int vlBS = resultSet.getInt("velocidad_base");

				single = new Pokemon(num_pokedex, vtBS, atBS, dfBS, atEBS, dfEBS, vlBS);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return single;
	}

	/**
	 * @param num_pokedex
	 * @return
	 */
	public static Pokemon selectSinglePokemon(int num_pokedex) {

		String query = "Select P.nom_pokemon, T1.nombre as tipo1, T2.nombre as tipo2, P.descripcion\n"
				+ "from pokedex P\n" + "JOIN tipo T1 ON T1.id_tipo = P.tipo_primario\n"
				+ "left JOIN tipo T2 ON T2.id_tipo = P.tipo_secundario\n" + "where P.num_pokedex = " + num_pokedex + ";";

		Pokemon single = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String name = resultSet.getString("nom_pokemon");
				String tipo1 = resultSet.getString("tipo1");
				String tipo2 = resultSet.getString("tipo2");
				String descripcion = resultSet.getString("descripcion");

				if (tipo2 == null) {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1) };
					single = new Pokemon(num_pokedex, name, tipo, descripcion);
				} else {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1), TipoPokemon.valueOf(tipo2) };
					single = new Pokemon(num_pokedex, name, tipo, descripcion);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return single;
	}

	public static Pokemon selectSinglePokemonAleatorio(int num_pokedex) {

		String query = "Select P.nom_pokemon, T1.nombre as tipo1, T2.nombre as tipo2, P.descripcion, P.vitalidad_base\n"
					 + "from pokedex P\n" 
					 + "JOIN tipo T1 ON T1.id_tipo = P.tipo_primario\n"
					 + "left JOIN tipo T2 ON T2.id_tipo = P.tipo_secundario\n" 
					 + "where P.num_pokedex = " + num_pokedex + ";";

		Pokemon single = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String name = resultSet.getString("nom_pokemon");
				String tipo1 = resultSet.getString("tipo1");
				String tipo2 = resultSet.getString("tipo2");
				String descripcion = resultSet.getString("descripcion");
				int vt = resultSet.getInt("vitalidad_base");

				if (tipo2 == null) {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1) };
					single = new Pokemon(num_pokedex, name, tipo, descripcion, vt);
				} else {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1), TipoPokemon.valueOf(tipo2) };
					single = new Pokemon(num_pokedex, name, tipo, descripcion, vt);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return single;
	}
	
	private static void insertStats() {
		String query = "update pokedex set vitalidad_base = ?, ataque_base = ?, defensa_base= ?, ataque_especial_base= ?, defensa_especial_base= ?, velocidad_base = ? where num_pokedex = ?;";

		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);

			LinkedList<Pokemon> pokedex = selectPokedex();

			for (Pokemon pokemon : pokedex) {
				pokemon.generarIVS();
				preparedStatement.setInt(1, pokemon.getVitalidadMaxima());
				preparedStatement.setInt(2, pokemon.getAtaqueMaxima());
				preparedStatement.setInt(3, pokemon.getDefensaMaxima());
				preparedStatement.setInt(4, pokemon.getAtaqueEspecialMaxima());
				preparedStatement.setInt(5, pokemon.getDefensaEspecialMaxima());
				preparedStatement.setInt(6, pokemon.getVelocidadMaxima());
				preparedStatement.setInt(7, pokemon.getIdPokemon());
				preparedStatement.executeUpdate();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void cargarStats() {

		String query = "SELECT vitalidad_base\n" + "from pokedex";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int vida = resultSet.getInt("vitalidad_base");
				if (vida != 0) {
					return;
				} else {
					insertStats();
				}

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
