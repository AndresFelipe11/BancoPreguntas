/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bancopreguntas.Jugador;
import servicios.ServicioJugador;
import servicios.ServicioPreguntas;
import servicios.ServicioRespuesta;
import bancopreguntas.Pregunta;
import bancopreguntas.Respuesta;
import bancopreguntas.Ronda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pipe
 */
public class BancoPreguntas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = JOptionPane.showInputDialog("Hola bienvenido al juego ¿cual es tu nombre?");
        Jugador jugador = new Jugador(nombre);

        for (int i = 1; i <= 5; i++) {
            char correcta = ' ';
            char entradaCorrecta;

            Pregunta pregunta;
            ArrayList<Respuesta> respuestas;
            Ronda ronda = new Ronda(i);
            pregunta = ServicioPreguntas.listarPreguntasPorRonda(i);
            // ServicioRespuesta.listarRespuestaPorPregunta(pregunta);
            respuestas = ServicioRespuesta.listarRespuestaPregunta(pregunta);
            String cadena = "Estas en la ronda: " + i + "\n" + pregunta.getPregunta() + "\n";

            for (Respuesta respuesta : respuestas) {
                cadena = cadena + respuesta.getLiteralABCD() + ": " + respuesta.getRespuesta() + "\n";
               

                if (respuesta.isResultado()) {
                    correcta = respuesta.getLiteralABCD();
                }

            }

            String[] options = { "A", "B", "C", "D" };
            int x = JOptionPane.showOptionDialog(null, cadena,
                    "Selecciona una opcion",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            String entrada = options[x];

            entradaCorrecta = entrada.charAt(0);
            if (ronda.getNivelDificultad() <= 4) {
                if (correcta == entradaCorrecta) {
                    jugador.setPuntaje(jugador.getPuntaje() + ronda.getPuntaje());
                    int continuar = JOptionPane.showConfirmDialog(null, "Felicitaciones "
                            + "has pasado el nivel de dificuldad: " + ronda.getNivelDificultad()
                            + " ¿deseas continuar en el juego?");

                    if (continuar != 0) {

                        JOptionPane.showMessageDialog(null, "Gracias por jugar " + jugador.getNombreJugador() + "\n" +
                                "Tu puntaje es: " + jugador.getPuntaje());
                        ServicioJugador.crearJugador(jugador);
                        break;

                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Gracias por jugar " + jugador.getNombreJugador() + "\n" +
                            "has seleccionado una respuesta incorrecta perdiste todos tus puntos :( ");
                    jugador.setPuntaje(0);
                    ServicioJugador.crearJugador(jugador);
                    break;
                }
            } else {
                if (correcta == entradaCorrecta) {
                    jugador.setPuntaje(jugador.getPuntaje() + ronda.getPuntaje());
                    JOptionPane.showMessageDialog(null,
                            "Felicitaciones has ganado el juego " + jugador.getNombreJugador() + "\n" +
                                    "Tu puntaje es: " + jugador.getPuntaje());
                    ServicioJugador.crearJugador(jugador);
                }

                else {

                    JOptionPane.showMessageDialog(null, "Gracias por jugar " + jugador.getNombreJugador() + "\n" +
                            "has seleccionado una respuesta incorrecta perdiste todos tus puntos :( ");
                    jugador.setPuntaje(0);
                    ServicioJugador.crearJugador(jugador);
                    break;
                }

            }

        }

    }

}
