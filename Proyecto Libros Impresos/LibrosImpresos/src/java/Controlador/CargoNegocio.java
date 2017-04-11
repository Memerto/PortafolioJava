/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Modelo.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JoseMiguel
 */
public class CargoNegocio implements CargoInterface{

    @Override
    public ArrayList<Cargo> consultarCargo(){
        ArrayList<Cargo> cc = new ArrayList();
       
        try{
            
            Connection c = Conexion.Conectar();
            String query="select * from cargo";
            PreparedStatement stmt=c.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Cargo ca = new Cargo();
                ca.setIdCargo(rs.getInt("id_cargo"));
                ca.setTipoCargo(rs.getString("cargo_persona"));
                cc.add(ca);
            }
        }catch(SQLException w){
            System.out.println("Error SQL: " + w.getMessage());
        }catch(Exception e){
            System.out.println("Error Desconocido: " + e.getMessage());
        }
        return cc;
    }
}
