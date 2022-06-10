/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bancopreguntas.Jugador;

/**
 *
 * @author Pipe
 */
public class JugadorDAO {

    public static void listarJugadoresDB() {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement statement = null;
            ResultSet result = null;

            String query = "SELECT * FROM jugador";
            statement = conexion.prepareStatement(query);
            result = statement.executeQuery();

            while (result.next()) {
                System.out.println("idJugador: " + result.getInt("idJugador"));
                System.out.println("nombre Jugador: " + result.getString("nombreJugador"));
                System.out.println("Puntaje: " + result.getInt("puntaje"));
                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.println("No fue posible recuperar los mensajes");
        }
    }

    public static void crearJugadorDB(Jugador jugador) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement stament = null;
            try {
                String query = "INSERT INTO jugador (nombreJugador, puntaje) VALUES (?, ?)";
                stament = (PreparedStatement) conexion.prepareStatement(query);
                stament.setString(1, jugador.getNombreJugador());
                stament.setInt(2, jugador.getPuntaje());
                stament.executeUpdate();
                System.out.println("El Jugador " + jugador.getNombreJugador() + " a sido creado correctamente en BD");
            } catch (SQLException ex) {
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
