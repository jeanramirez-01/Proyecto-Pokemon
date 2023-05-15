package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCRUD {

	/**
	 * ´ Este metodo se encarga de la consulta del usuario al momento de querer
	 * iniciar sesion en el juego, que si el nombre el del usuario que pasa por
	 * parametro existe en la base de datos y que si su contraseña es de igual
	 * manera la misma, entonces procede a continuar, si no, salta una excepcion
	 * 
	 * @param nombre del usuario
	 * @param pass   es la contraseña del usuario
	 */
	public static boolean selectIniciarSesion(String nombre, String pass) {
		String query = "SELECT nom_entrenador, contrasenia FROM entrenador WHERE nom_entrenador = ? AND contrasenia = ?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setString(1, nombre);
			preparedStatement.setString(2, pass);
			resultSet = preparedStatement.executeQuery();
			return resultSet.next();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * 
	 * 
	 * @param usuario
	 * @param password
	 * @param edad
	 * @param sexo
	 */
	public static void crearUsuario(String usuario, String password, int edad, char sexo) {
		String query = "INSERT INTO entrenador (nom_entrenador, contrasenia, edad, genero, pokecuartos) VALUES ( ?, ?, ?, ?, ?)";

		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setString(1, usuario);
			preparedStatement.setString(2, password);
			preparedStatement.setInt(3, edad);
			preparedStatement.setString(4, String.valueOf(sexo));
			int pokecuartos = (int) (Math.random() * 500) + 1000;
			preparedStatement.setInt(5, pokecuartos);
			preparedStatement.executeUpdate();
			crearBolsa(EntrenadorCRUD.selectIdEntrenador(usuario));
			crearCaja(EntrenadorCRUD.selectIdEntrenador(usuario));

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

	/**
	 * @param nombre
	 * @return
	 */
	public static String recordarContraseña(String nombre) {

		String query = "Select contrasenia\n" + "from entrenador\n" + "where nom_entrenador = '" + nombre + "';";
		String contrasenia = "";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				contrasenia = resultSet.getString("contrasenia");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		return contrasenia;

	}

	/**
	 * @param pass
	 * @return
	 */
	public static String recordarUsuario(String pass) {

		String query = "Select nom_entrenador\n" + "from entrenador\n" + "where contrasenia = '" + pass + "';";
		String user = "";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				user = resultSet.getString("nom_entrenador");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		return user;

	}

	/**
	 * @param id
	 */
	private static void crearBolsa(int id) {

		String query = "Insert into bolsa (id_bolsa, id_entrenador) values (?, ?);";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, id);
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

	/**
	 * @param id
	 */
	private static void crearCaja(int id) {

		String query = "Insert into pc_pokemon (id_pc_pokemon, id_entrenador) values (?,?);";
		try {
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
