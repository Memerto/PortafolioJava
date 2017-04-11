/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JoseMiguel
 */
public class Persona {    
    private String rut;
    private String clave;
    private String nombre;
    private String apellido;
    private String cargo;

    public Persona() {
    }

    public Persona(String rut, String clave, String nombre, String apellido, String cargo) {
        this.rut = rut;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    public String getRut() {
        return rut;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
        
}