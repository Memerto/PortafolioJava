/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Modelo.Vale;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JoseMiguel
 */
public class TipoValeNegocio implements TipoValeInterface{

    @Override
    public ArrayList<Vale> consultarVale(){
        ArrayList<Vale> cv = new ArrayList();
       
        try{
            
            Connection c = Conexion.Conectar();
            String query="select * from vales";
            PreparedStatement stmt=c.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Vale va = new Vale();
                va.setIdVale(rs.getInt("id_vale"));
                va.setTipoVale(rs.getString("tipo_vale"));
                /*va.setPrecio(rs.getInt("precio"));
                va.setFecha(rs.getDate("fecha", null));
                va.setHora(rs.getInt("hora"));*/
                cv.add(va);
            }
        }catch(SQLException w){
            System.out.println("Error SQL: " + w.getMessage());
        }catch(Exception e){
            System.out.println("Error Desconocido: " + e.getMessage());
        }
        return cv;
    }
}
