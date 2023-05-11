package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PokemonCRUD {
	
	public static void main(String[] args) {
		
		System.out.println(selectRutaSprite(1));
		
	}
	
	
	/**
	 * @param nombre
	 * @return
	 */
	public static String selectRutaSprite(int id) {

		String query = "Select ruta_sprite\n" 
					 + "from pokedex\n" 
					 + "where num_pokedex = " + id + ";";
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

		String query = "Select ruta_cry\n" 
					 + "from pokedex\n" 
					 + "where num_pokedex = " + id + ";";
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

	
}