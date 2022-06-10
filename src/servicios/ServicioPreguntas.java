/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import persistencia.PreguntaDAO;
import bancopreguntas.Pregunta;



/**
 *
 * @author Pipe
 */
public class ServicioPreguntas {
    
     public static void listarPreguntas() {
        PreguntaDAO.listarPreguntasDB();
    }
     
      public static Pregunta listarPreguntasPorRonda(int ronda) {
          
          return PreguntaDAO.listarPreguntasPorRondaDB(ronda);
    }
    
}
