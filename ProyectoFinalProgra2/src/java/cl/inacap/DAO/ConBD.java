/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andre_000
 */
public class ConBD {
    String user = "progrados";
    String pass = "123456";
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    
    public Connection getConexion() throws ClassNotFoundException, SQLException {
        //Se registra el driver.
        Class.forName("oracle.jdbc.OracleDriver");
        
        //Le pongo las variables como parámetros.
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }
}
