package controllercrud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import mecanicaspokemon.Bolsa;

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

		String query = "";
		Bolsa bolsa = null;

		return bolsa;
	}

}
