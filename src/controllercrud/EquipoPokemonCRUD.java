package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mecanicaspokemon.Equipo;
import mecanicaspokemon.Pokemon;

public class EquipoPokemonCRUD {
	
	public static void main(String[] args) {
		cargarEquipoPokemon(1).mostrarEquipo();
	}

	public static void insertPokemonInicialEnEquipo(int id_pokemon, String nombreEntrenador) {
		PokemonCRUD.insertPokemonInicial(id_pokemon);
		int id_entrenador = EntrenadorCRUD.selectIdEntrenador(nombreEntrenador);

		String query = "INSERT INTO equipo_pokemon (id_entrenador, id_pokemon) VALUES (?,?)";
		try {
			id_pokemon = PokemonCRUD.selectIdPokemonRecienInsertado();
			PreparedStatement preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			preparedStatement.setInt(1, id_entrenador);
			preparedStatement.setInt(2, id_pokemon);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static Equipo cargarEquipoPokemon(int id_entrenador) {

		String query = "Select id_pokemon\n" 
					 + "from equipo_pokemon\n" 
					 + "where id_entrenador = " + id_entrenador + ";";
		Pokemon[] equipo = new Pokemon[6];
		int i = 0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id_pokemon = resultSet.getInt("id_pokemon");
				equipo[i] = PokemonCRUD.cargarPokemon(id_pokemon);
				i++;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		Equipo team = new Equipo(equipo);
		
		return team;

	}

}
