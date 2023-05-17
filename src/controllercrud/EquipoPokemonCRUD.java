package controllercrud;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipoPokemonCRUD {

	public static void insertPokemonInicialEnEquipo(int id_pokemon, int id_entrenador) {
		PokemonCRUD.insertPokemonInicial(id_pokemon);

		crearEquipo(id_entrenador);

		String query = "INSERT INTO equipo_pokemon (id_equipo, id_pokemon, num_slot) VALUES (?, ?,?)";
		try {
			id_entrenador = EntrenadorCRUD.selectIdEntrenadorRecienCreado();
			id_pokemon = PokemonCRUD.selectIdPokemonRecienInsertado();
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_pokemon);
			preparedStatement.setInt(3, 1);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private static void crearEquipo(int id_entrenador) {

		String query = "Insert into equipo values(?,?);";
		try {
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_entrenador);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
