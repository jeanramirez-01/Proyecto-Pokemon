package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import mecanicaspokemon.Bolsa;
import mecanicaspokemon.Entrenador;
import mecanicaspokemon.Equipo;
import mecanicaspokemon.Pokemon;

public class EntrenadorCRUD {

	/**
	 * @return
	 */
	public static LinkedList<Entrenador> selectAllEntrenador() {

		String query = "Select nom_entrenador, edad, sexo, pokecuartos\n" + "from entrenador";

		PreparedStatement preparedStatement = null;
		Entrenador trainer = null;
		LinkedList<Entrenador> trainers = new LinkedList<>();
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString("nom_entrenador");
				int edad = resultSet.getInt("edad");
				String sexo = resultSet.getString("sexo");
				int pokecuartos = resultSet.getInt("pokecuartos");

				trainer = new Entrenador(name, edad, sexo, pokecuartos);

				trainers.add(trainer);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return trainers;

	}

	/**
	 * @return
	 */
	public static int selectIdEntrenadorRecienCreado() {

		String query = "select max(id_entrenador) as id_entrenador from entrenador;";
		int id = 0;
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				id = resultSet.getInt("id_entrenador");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	public static int selectIdEntrenador(String nombre) {

		String query = "Select id_entrenador " + "from entrenador " + "where nom_entrenador = '" + nombre + "';";
		int id = 0;
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				id = resultSet.getInt("id_entrenador");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return id;
	}

	public static boolean comprobarEntrenador(String usuario) {

		String query = "Select nom_entrenador from entrenador where nom_entrenador = ?";

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setString(1, usuario);
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

	public static Entrenador cargarEntrenador(String nombre) {
		String query = "Select id_entrenador, nom_entrenador, edad, genero, pokecuartos\n" 
					 + "from entrenador\n"
					 + "where nom_entrenador = '" + nombre + "';";
		Entrenador trainer = null;

		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id_entrenador");
				String name = resultSet.getString("nom_entrenador");
				int edad = resultSet.getInt("edad");
				String sexo = resultSet.getString("genero");
				int pokecuartos = resultSet.getInt("pokecuartos");
				Equipo team = EquipoPokemonCRUD.cargarEquipoPokemon(selectIdEntrenador(nombre));
				Bolsa bolsa = BolsaCRUD.cargarBolsa(selectIdEntrenador(nombre));
				LinkedList<Pokemon> pc = PcPokemonCRUD.cargarPcPokemon(selectIdEntrenador(nombre));

				trainer = new Entrenador(id, name, edad, sexo, pokecuartos, team, bolsa, pc);

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return trainer;
	}
}
