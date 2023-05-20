package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import mecanicaspokemon.Pokemon;

public class PcPokemonCRUD {

	public static void crearCaja(int id_entrenador, int id_pokemon) {

		String query = "Insert into pc_pokemon (id_entrenador, id_pokemon) values (?,?);";
		try {
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_pokemon);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static LinkedList<Pokemon> cargarPcPokemon(int id_entrenador) {

		String query = "Select id_pokemon\n" + "from pc_pokemon\n" + "where id_entrenador = " + id_entrenador
				+ " and activo = true;";
		LinkedList<Pokemon> pcPokemon = new LinkedList<Pokemon>();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id_pokemon = resultSet.getInt("id_pokemon");
				pcPokemon.add(PokemonCRUD.cargarPokemon(id_pokemon));

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return pcPokemon;
	}

	public static void insertPokemonCaja(int num_pokedex, String nombreEntrenador) {

		PokemonCRUD.insertPokemon(num_pokedex);
		int id_entrenador = EntrenadorCRUD.selectIdEntrenador(nombreEntrenador);

		String query = "INSERT INTO pc_pokemon (id_entrenador, id_pokemon, activo) VALUES (?,?, true)";
		try {
			num_pokedex = PokemonCRUD.selectIdPokemonRecienInsertado();
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, num_pokedex);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public static void insertPokemonCajaEquipo(int id_pokemon, String nombreEntrenador) {

		int id_entrenador = EntrenadorCRUD.selectIdEntrenador(nombreEntrenador);

		String query = "INSERT INTO pc_pokemon (id_entrenador, id_pokemon) VALUES (?,?)";
		try {
			
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_pokemon);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
