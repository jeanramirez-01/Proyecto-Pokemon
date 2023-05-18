package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mecanicaspokemon.Estado;
import mecanicaspokemon.Estado.NombreEstado;
import mecanicaspokemon.Estado.TiposEstados;

public class EstadoCRUD {

	public static Estado cargarEstadoPokemon(int id_estado) {

		String query = "Select id_estado, nombre, tipo_estado\n" 
				+ "from estado\n" 
				+ "where id_estado = " + id_estado+ ";";

		Estado est = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int id = resultSet.getInt("id_estado");
				String nom = resultSet.getString("nombre");
				String tipE = resultSet.getString("tipo_estado");

				est = new Estado(id, NombreEstado.valueOf(nom), TiposEstados.valueOf(tipE));

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return est;

	}

}
