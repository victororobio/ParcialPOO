/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Agenda;


public class ControladorAgenda {

    // Modelo con el que trabaja el controlador 
    private Agenda agenda;

    
    public ControladorAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    
    public boolean guardarContacto(String nombre, String telefono) {
        
        return agenda.guardarContacto(nombre.trim(), telefono.trim());
    }

    
    public String buscarTelefono(String nombre) {
        return agenda.buscarTelefono(nombre.trim());
    }
}
