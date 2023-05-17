package controllercrud;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import mecanicaspokemon.Pokemon;

public class EquipoPokemonCRUD {

	public static void insertPokemonInicialEnEquipo(int id_pokemon, String nombreEntrenador) {
		PokemonCRUD.insertPokemonInicial(id_pokemon);
		int id_entrenador = EntrenadorCRUD.selectIdEntrenador(nombreEntrenador);

		String query = "INSERT INTO equipo_pokemon (id_entrenador, id_pokemon) VALUES (?,?)";
		try {
			id_pokemon = PokemonCRUD.selectIdPokemonRecienInsertado();
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_pokemon);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static Pokemon[] cargarEquipoPokemon(int id_entrenador) {

		String query = "";
		Pokemon[] equipo = null;

		return equipo;

	}

}
