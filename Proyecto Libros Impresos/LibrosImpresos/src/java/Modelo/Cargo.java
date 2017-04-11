/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author CETECOM
 */
public class Cargo {
    private int idCargo;
    private String TipoCargo;

    public Cargo() {
    }

    public Cargo(int idCargo, String TipoCargo) {
        this.idCargo = idCargo;
        this.TipoCargo = TipoCargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public String getTipoCargo() {
        return TipoCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public void setTipoCargo(String TipoCargo) {
        this.TipoCargo = TipoCargo;
    }
    
    @Override
    public String toString(){
        return this.TipoCargo;
    }
    
}
