package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import mecanicaspokemon.Bolsa;
import mecanicaspokemon.Equipo;
import mecanicaspokemon.Objeto;

public class BolsaCRUD {

	public static void crearBolsa(int id) {

		String query = "Insert into bolsa (id_entrenador) values (?);";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

	}

	public static Bolsa cargarBolsa(int id_entrenador) {

		String query = "Select id_objeto, cantidad_objetos\n" 
					 + "from bolsa\n" 
					 + "where id_entrenador = " + id_entrenador + ";";
		LinkedList<Objeto> lista = new LinkedList<Objeto>();
		int i = 0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id_objeto = resultSet.getInt("id_objeto");
				int cantidad_objetos = resultSet.getInt("cantidad_objetos");
//				lista.  PokemonCRUD.cargarPokemon(id_pokemon);
				i++;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		Bolsa bolsa = new Bolsa(lista);

		return bolsa;

	}

}
