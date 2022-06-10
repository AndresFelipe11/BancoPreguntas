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
import bancopreguntas.Ronda;
import bancopreguntas.Pregunta;

/**
 *
 * @author Pipe
 */
public class PreguntaDAO {
    
    
     public static void listarPreguntasDB() {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement statement = null;
            ResultSet result = null;

            String query = "SELECT * FROM pregunta;";
            statement = conexion.prepareStatement(query);
            result = statement.executeQuery();

            while (result.next()) {
                System.out.println("idPregunta: " + result.getInt("idpregunta"));
                System.out.println("pregunta: " + result.getString("pregunta"));
               
                



                System.out.println("");
            }
        } catch (SQLException ex) {
            System.out.println("No fue posible recuperar los mensajes");
        }
    }
     
        public static Pregunta listarPreguntasPorRondaDB(int ronda) {
        Conexion db_connect = new Conexion();
        
        Ronda rondaO=new Ronda(ronda);
        String query = "SELECT * FROM pregunta WHERE idronda= " + "" 
                +ronda +
                " order by rand() limit 1";
                        
        Pregunta pregunta= new Pregunta();


        try (Connection conexion = db_connect.get_connection()) {
            PreparedStatement statement = null;
            ResultSet result = null;

            statement = conexion.prepareStatement(query);
            result = statement.executeQuery();

            while (result.next()) {
               // System.out.println("Pregunta: " + result.getString("pregunta"));
               // System.out.println("Ronda: " + result.getInt("idronda"));               
               //System.out.println("");
                
                
                pregunta.setIdPregunta(result.getInt("idpregunta"));
                pregunta.setPregunta(result.getString("pregunta"));
                pregunta.setRonda(rondaO);
                

                
            }
            return pregunta;
        } catch (SQLException ex) {
            System.out.println("No fue posible recuperar los mensajes");
            
        }
        
        return null;
    }
    
}
