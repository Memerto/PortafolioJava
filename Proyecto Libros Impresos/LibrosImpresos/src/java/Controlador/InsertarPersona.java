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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoseMiguel
 */
public class InsertarPersona  {
    public boolean CrearPersona(Persona pers)
    {
    
        Connection c = Conexion.Conectar();
        boolean aux=false;
 
        PreparedStatement query;        
       
            try {
                
                query=c.prepareStatement("insert into persona (rut_persona,clave_persona,nombre_persona,apellido_persona,cargo_persona)values(?,?,?,?,?)");
                query.setString(1, pers.getRut());
                query.setString(2, pers.getClave());
                query.setString(3, pers.getNombre());
                query.setString(4, pers.getApellido());
                query.setString(5, pers.getCargo());
                query.executeUpdate();
               
                aux = true;
                
            } catch (SQLException ex) {
                Logger.getLogger(InsertarPersona.class.getName()).log(Level.SEVERE, null, ex);
               
            }
            
            return aux;
        
            
    }
}


