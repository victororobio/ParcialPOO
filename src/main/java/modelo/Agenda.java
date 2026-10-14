/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


public class Agenda {

    // Lista de contactos guardados 
    private ArrayList<Contacto> contactos = new ArrayList<>();

    
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

  
    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

   
    public boolean guardarContacto(String nombre, String telefono) {
        // Decisión 1, el nombre y el teléfono son obligatorios
        if (nombre == null || nombre.trim().isEmpty() || telefono == null || telefono.trim().isEmpty()) {
            return false;
        }
        // Decisión, no se permiten nombres repetidos (la búsqueda es por nombre)
        if (buscarContacto(nombre) != null) {
            return false;
        }
        
        Contacto contacto = new Contacto(nombre.trim(), telefono.trim());
        contactos.add(contacto);
        return true;
    }

    
    public String buscarTelefono(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        // Decisión, si no se encontró el contacto, no hay teléfono que devolver
        if (contacto == null) {
            return null;
        }
        return contacto.getTelefono();
    }

    
    private Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre.trim())) {
                return contacto;
            }
        }
        return null;
    }
}
