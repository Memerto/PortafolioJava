/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author JoseMiguel
 */
public class Vale {
    private int idVale;
    private String TipoVale;
    private int precio;
    private Date fecha;
    private int hora;

    public Vale() {
    }

    public Vale(int idVale, String TipoVale, int precio, Date fecha, int hora) {
        this.idVale = idVale;
        this.TipoVale = TipoVale;
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdVale() {
        return idVale;
    }

    public String getTipoVale() {
        return TipoVale;
    }

    public int getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setIdVale(int idVale) {
        this.idVale = idVale;
    }

    public void setTipoVale(String TipoVale) {
        this.TipoVale = TipoVale;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString(){
        return this.TipoVale;
    }
   
}
