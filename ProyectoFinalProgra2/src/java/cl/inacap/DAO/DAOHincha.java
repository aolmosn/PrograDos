/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.DAO;

import cl.inacap.modelo.Hincha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre_000
 */
public class DAOHincha extends ConBD{
    
    public ArrayList<Hincha> listarHincha(){
        ArrayList<Hincha> listaHincha = new ArrayList();
        Hincha h;
        try {
            Connection con = this.getConexion();
            String strSQL = "SELECT * FROM HINCHA";
            PreparedStatement ps = con.prepareStatement(strSQL);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                h = new Hincha();
                //Codigo para llenar objeto desde la bd
                
                listaHincha.add(h);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOHincha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAOHincha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaHincha;
    }
    
}
