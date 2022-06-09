/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import persistencia.JugadorDAO;
import bancopreguntas.Jugador;

/**
 *
 * @author Pipe
 */
public class ServicioJugador {
    
     public static void crearJugador(Jugador jugador) {
        JugadorDAO.crearJugadorDB(jugador);
    }
    
    public static void listarJugadores() {
        JugadorDAO.listarJugadoresDB();
    }
    
}
