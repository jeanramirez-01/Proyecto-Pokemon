package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import mecanicaspokemon.Pokemon;

public class PcPokemonCRUD {

	public static void crearCaja(int id) {

		String query = "Insert into pc_pokemon (id_entrenador) values (?);";
		try {
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static LinkedList<Pokemon> cargarPcPokemon(int id_entrenador) {

		String query = "Select id_pokemon\n" + "from pc_pokemon" + "where id_entrenador = " + id_entrenador + ";";
		LinkedList<Pokemon> pcPokemon = new LinkedList<Pokemon>();
		int i = 0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id_pokemon = resultSet.getInt("id_pokemon");
				pcPokemon.add(PokemonCRUD.cargarPokemon(id_pokemon));
				i++;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return pcPokemon;
	}

}
