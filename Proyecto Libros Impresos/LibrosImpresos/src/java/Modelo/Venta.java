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
public class Venta {
    private int idVenta;
    private int total;
    private Date fecha;
    private int hora;

    public Venta() {
    }

    public Venta(int idVenta, int total, Date fecha, int hora) {
        this.idVenta = idVenta;
        this.total = total;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public int getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
}
