package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import mecanicaspokemon.Pokemon;

public class PokemonCRUD {

	public static void main(String[] args) {

		insertPokemonInicial(152);

	}

	public static void insertPokemonInicial(int id) {

		String query = "Insert into pokemon (num_pokedex, vitalidad, ataque, defensa, ataque_especial, defensa_especial, velocidad)\n"
				+ "values (?,?,?,?,?,?,?);";

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
			preparedStatement.executeUpdate(); // Insertar los valores de las estadísticas en la tabla 'pokemon'

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

}