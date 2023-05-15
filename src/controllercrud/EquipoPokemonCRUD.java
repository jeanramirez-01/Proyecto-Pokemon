package controllercrud;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipoPokemonCRUD {

	public static void insertPokemonInicialEnEquipo(int id_pokemon, int id_entrenador) {
		// Obtener las estadísticas base del Pokemon
		PokemonCRUD.insertPokemonInicial(id_pokemon);

		// Insertar el Pokemon en la tabla 'equipo' del Entrenador correspondiente
		// Insertar el Pokemon en la tabla 'equipo' del Entrenador correspondiente
		String query = "INSERT INTO equipo (id_entrenador, id_pokemon) VALUES (?, ?)";
		try {
			id_entrenador = EntrenadorCRUD.selectIdEntrenadorRecienCreado();
			id_pokemon = PokemonCRUD.selectIdPokemonRecienInsertado();
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_pokemon);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
