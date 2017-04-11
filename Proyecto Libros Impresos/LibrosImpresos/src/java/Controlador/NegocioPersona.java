/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Datos.Conexion;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JoseMiguel
 */
public class NegocioPersona implements NegocioPersonaInterface{
    
    /**
     *
     * @param user
     * @param pass
     * @return
     */
    @Override
    public Persona ValidarPersona(String user, String pass){
        Connection c = Conexion.Conectar();        
        Persona per= null;
        try{
            PreparedStatement query = c.prepareStatement("select * from persona where rut_persona=? and clave_persona=?");
            query.setString(1, user);
            query.setString(2, pass);
            ResultSet rs= query.executeQuery();
            while(rs.next()){
                per= new Persona();
                per.setRut(rs.getString("rut_persona"));
                per.setClave(rs.getString("clave_persona"));
                per.setNombre(rs.getString("nombre_persona"));
                per.setApellido(rs.getString("apellido_persona"));                
                per.setCargo(rs.getString("cargo_persona"));              
            }            
        }catch(SQLException ex){
            Logger.getLogger(NegocioPersona.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return per;
    }
}
