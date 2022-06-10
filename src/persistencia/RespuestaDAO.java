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
import bancopreguntas.Pregunta;
import bancopreguntas.Respuesta;
import java.util.ArrayList;


/**
 *
 * @author Pipe
 */
public class RespuestaDAO {
    

         public static ArrayList<Respuesta> listarRespuestaPreguntaBD(Pregunta pregunta) {
                
        Conexion db_connect = new Conexion();
      
          ArrayList<Respuesta> respuestas = new ArrayList<Respuesta>();
          

        String query = "SELECT * FROM respuesta where idpregunta="+ " " +pregunta.getIdPregunta();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement statement = null;
            ResultSet result = null;

            statement = conexion.prepareStatement(query);
            result = statement.executeQuery();

            while (result.next()) {
                Respuesta respuesta = new Respuesta();

                respuesta.setIdRespuesta(result.getInt("idrespuesta"));
                respuesta.setRespuesta(result.getString("respuesta"));
                respuesta.setLiteralABCD(result.getString("literalABCD").charAt(0));
                if (result.getInt("resultado")==1){
                    respuesta.setResultado(true);
                }
                else
                {
                    respuesta.setResultado(false);
                }
                
                
                respuestas.add(respuesta);
               
            }
        } catch (SQLException ex) {
            System.out.println("No fue posible recuperar los mensajes");
            
        }
        
        
        return respuestas;
        
    }
    
}
