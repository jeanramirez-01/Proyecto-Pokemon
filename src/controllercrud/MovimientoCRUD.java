package controllercrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mecanicaspokemon.Movimiento;
import mecanicaspokemon.TipoPokemon;

public class MovimientoCRUD {

	public static Movimiento[] cargarMovimientosPokemon(int id_pokemon) {

		int[] id = cargarTablaIntermediaMovimiento(id_pokemon);
		Movimiento[] listaMovimientos = new Movimiento[4];

		PreparedStatement preparedStatement = null;

		for (int i = 0; i < cargarTablaIntermediaMovimiento(id_pokemon).length; i++) {
			String query = "Select M.nombre, T.nombre as tipo, MA.potencia, MA.tipo_ataque \r\n"
					+ "from movimiento M\r\n" 
					+ "join tipo T on M.id_tipo_movimiento = T.id_tipo\r\n"
					+ "join movimientos_ataques MA on M.id_movimiento = MA.id_movimiento\r\n"
					+ "where M.id_movimiento = " + id[i] + ";";

			try {
				preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					String nombre = resultSet.getString("nombre");
					String tipo = resultSet.getString("tipo");
					String tipoAtaque = resultSet.getString("tipo_ataque");
					int potencia = resultSet.getInt("potencia");

					listaMovimientos[i] = new Movimiento(nombre, TipoPokemon.valueOf(tipo),
							Movimiento.TipoAtaque.valueOf(tipoAtaque), potencia);

				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		return listaMovimientos;

	}

	private static int[] cargarTablaIntermediaMovimiento(int id_pokemon) {

		String query = "Select id_movimiento\n" 
					 + "from pokemon_movimiento \n" 
					 + "where id_pokemon = " + id_pokemon+ ";";
		int[] lista = new int[4];
		int i = 0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id_movimiento = resultSet.getInt("id_movimiento");
				lista[i] = id_movimiento;
				i++;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return lista;
	}

}
