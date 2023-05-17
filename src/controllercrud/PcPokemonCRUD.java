package controllercrud;

import java.sql.PreparedStatement;
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
	
	public static LinkedList<Pokemon> cargarPcPokemon(){
		
		String query = "";
		LinkedList<Pokemon> pcPokemon = null;
		
		return pcPokemon;
	}
	
}
