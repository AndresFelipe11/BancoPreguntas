/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pipe
 */
public class Conexion {

    public Connection get_connection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopreguntas", "root", "6afmgd8r");
            if (connection != null) {
                System.out.println("\nLa conexion a sido exitosa\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}