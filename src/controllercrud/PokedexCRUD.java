package controllercrud;

import mecanicaspokemon.Pokemon;
import mecanicaspokemon.TipoPokemon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class PokedexCRUD {

    public static void main(String[] args) {

        for (int i = 0; i < selectPokedex().size(); i++) {
            System.out.println(selectPokedex().get(i));
        }

    }

    public static LinkedList selectPokedex() {

        String query = "Select P.num_pokedex, P.nom_pokemon, T1.nombre as tipo1, T2.nombre as tipo2,\n" +
                "P.descripcion\n" +
                "from pokedex P\n" +
                "JOIN tipo T1 ON T1.id_tipo = P.tipo_primario\n" +
                "left JOIN tipo T2 ON T2.id_tipo = P.tipo_secundario\n" +
                "order by p.num_pokedex";

        PreparedStatement preparedStatement = null;
        Pokemon single = null;
        LinkedList<Pokemon> pokedex = new LinkedList<>();
        try {
            preparedStatement = MySQLConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id_pokemon = resultSet.getInt("num_pokedex");
                String name = resultSet.getString("nom_pokemon");
                String tipo1 = resultSet.getString("tipo1");
                String tipo2 = resultSet.getString("tipo2");
                String descripcion = resultSet.getString("descripcion");

                if (tipo2 == null) {
                    TipoPokemon[] tipo = {TipoPokemon.valueOf(tipo1), null};
                    single = new Pokemon(id_pokemon, name, tipo, descripcion);
                } else {
                    TipoPokemon[] tipo = {TipoPokemon.valueOf(tipo1), TipoPokemon.valueOf(tipo2)};
                    single = new Pokemon(id_pokemon, name, tipo, descripcion);
                }
                pokedex.add(single);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return pokedex;
    }

    public static void insertStats() {

        String query = "Insert into pokemon (id_pokemon, vitalidad, ataque, defensa, ataque_especial, defensa_especial, velocidad)\n" +
                "values (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        Pokemon single = null;

        for (int i = 0; i < selectPokedex().size(); i++) {
            single.generarIVS();
        }

    }
}
