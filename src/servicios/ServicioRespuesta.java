/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import bancopreguntas.Pregunta;
import bancopreguntas.Respuesta;
import java.util.ArrayList;

import persistencia.RespuestaDAO;

/**
 *
 * @author Pipe
 */
public class ServicioRespuesta {
      
        public static ArrayList<Respuesta> listarRespuestaPregunta(Pregunta pregunta) {
        return RespuestaDAO.listarRespuestaPreguntaBD(pregunta);
    }
    
}
