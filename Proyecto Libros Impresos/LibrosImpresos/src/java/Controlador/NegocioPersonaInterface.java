/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;

/**
 *
 * @author JoseMiguel
 */
public interface NegocioPersonaInterface {
     Persona ValidarPersona(String user, String pass);    
}
