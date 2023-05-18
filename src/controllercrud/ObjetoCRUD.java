package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mecanicaspokemon.Objeto;
import mecanicaspokemon.Objeto.CategoriasBolsa;
import mecanicaspokemon.Objeto.NombreObjeto;

public class ObjetoCRUD {

	public static void main(String[] args) {
		System.out.println(cargarOjeto(15).toString());
	}

	public static Objeto cargarOjeto(int id_objeto) {

		String query = "Select id_objeto, nom_objeto, precio, descripcion, categoria_objeto\n" + "from objeto\n"
				+ "where id_objeto = " + id_objeto + ";";

		Objeto obj = null;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int id = resultSet.getInt("id_objeto");
				String nom = resultSet.getString("nom_objeto");
				int prc = resultSet.getInt("precio");
				String desc = resultSet.getString("descripcion");
				String categ = resultSet.getString("categoria_objeto");
				if (id == 1) {
					obj = new Objeto(NombreObjeto.valueOf(nom), 0, desc, null);
				} else {
					obj = new Objeto(NombreObjeto.valueOf(nom), prc, desc, CategoriasBolsa.valueOf(categ));
				}

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return obj;
	}

}
