package controllercrud;

import mecanicaspokemon.Pokemon;
import mecanicaspokemon.TipoPokemon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class PokedexCRUD {

	public static void main(String[] args) {

		insertStats();

	}

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

	/**
	 * @param id
	 * @return
	 */
	public static Pokemon selectSinglePokemon(int id) {

		String query = "Select P.nom_pokemon, T1.nombre as tipo1, T2.nombre as tipo2,\n" + "P.descripcion\n"
				+ "from pokedex P\n" + "JOIN tipo T1 ON T1.id_tipo = P.tipo_primario\n"
				+ "left JOIN tipo T2 ON T2.id_tipo = P.tipo_secundario\n" + "where P.num_pokedex = " + id + ";";

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
					single = new Pokemon(id, name, tipo, descripcion);
				} else {
					TipoPokemon[] tipo = { TipoPokemon.valueOf(tipo1), TipoPokemon.valueOf(tipo2) };
					single = new Pokemon(id, name, tipo, descripcion);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return single;
	}

	/**
	 * 
	 */
	public static void insertStats() {
		String query = "INSERT INTO pokemon (id_pokemon, vitalidad, ataque, defensa, ataque_especial, defensa_especial, velocidad) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);

			LinkedList<Pokemon> pokedex = selectPokedex(); // Obtener la lista de pokémon de la Pokédex

			for (Pokemon pokemon : pokedex) {
				pokemon.generarIVS(); // Generar los valores aleatorios de las estadísticas del pokémon
				preparedStatement.setInt(1, pokemon.getIdPokemon());
				preparedStatement.setInt(2, pokemon.getVitalidadMaxima());
				preparedStatement.setInt(3, pokemon.getAtaqueMaxima());
				preparedStatement.setInt(4, pokemon.getDefensaMaxima());
				preparedStatement.setInt(5, pokemon.getAtaqueEspecialMaxima());
				preparedStatement.setInt(6, pokemon.getDefensaEspecialMaxima());
				preparedStatement.setInt(7, pokemon.getVelocidadMaxima());
				preparedStatement.executeUpdate(); // Insertar los valores de las estadísticas en la tabla 'pokemon'

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
