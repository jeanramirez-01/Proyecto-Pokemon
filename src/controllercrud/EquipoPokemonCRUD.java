package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mecanicaspokemon.Equipo;
import mecanicaspokemon.Pokemon;

public class EquipoPokemonCRUD {

	public static void insertPokemonInicialEnEquipo(int num_pokedex, String nombreEntrenador) {
		PokemonCRUD.insertPokemon(num_pokedex);
		int id_entrenador = EntrenadorCRUD.selectIdEntrenador(nombreEntrenador);

		String query = "INSERT INTO equipo_pokemon (id_entrenador, id_pokemon) VALUES (?,?)";
		try {
			num_pokedex = PokemonCRUD.selectIdPokemonRecienInsertado();
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, num_pokedex);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		PcPokemonCRUD.crearCaja(id_entrenador, num_pokedex);
	}

	public static void insertPokemonEquipo(int num_pokedex, String nombreEntrenador) {

		PokemonCRUD.insertPokemon(num_pokedex);
		int id_pokemon = PokemonCRUD.selectIdPokemonRecienInsertado();
		int id_entrenador = EntrenadorCRUD.selectIdEntrenador(nombreEntrenador);

		String query = "INSERT INTO equipo_pokemon (id_entrenador, id_pokemon) VALUES (?,?)";
		if (longitudEquipo(id_entrenador) >= 6) {
			PcPokemonCRUD.insertPokemonCaja(num_pokedex, nombreEntrenador);
		} else {
			try {
				PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
				preparedStatement.setInt(1, id_entrenador);
				preparedStatement.setInt(2, id_pokemon);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			PcPokemonCRUD.insertPokemonCajaEquipo(id_pokemon, nombreEntrenador);
		}

	}

	public static Equipo cargarEquipoPokemon(int id_entrenador) {

		String query = "Select id_pokemon\n" + "from equipo_pokemon\n" + "where id_entrenador = " + id_entrenador + ";";

		Pokemon[] equipo = null;
		int i = 0;
		int id_pokemon = 0;
		ArrayList<String> list = new ArrayList<String>();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				id_pokemon = resultSet.getInt("id_pokemon");
				list.add(String.valueOf(id_pokemon));
				i++;
			}
			equipo = new Pokemon[i];
			for (int k = 0; k < equipo.length; k++) {
				String w = list.get(k);
				int id = Integer.parseInt(w);
				equipo[k] = PokemonCRUD.cargarPokemon(id);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		Equipo team = new Equipo(equipo);

		return team;

	}

	private static int longitudEquipo(int id_entrenador) {

		String query = "select count(id_pokemon) as contabilidad\r\n" + "from equipo_pokemon\r\n"
				+ "where id_entrenador = " + id_entrenador + ";";

		int contabilidad = 0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				contabilidad = resultSet.getInt("contabilidad");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return contabilidad;
	}
}
