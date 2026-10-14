/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorcontactosparcial;

import controlador.ControladorAgenda;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import modelo.Agenda;
import vista.VistaAgenda;

/**
 * Clase de arranque. Es el único lugar que conoce las tres capas:
 * crea el modelo, el controlador y la vista, y las conecta.
 *
 * @author emanu
 */
public class GestorContactosParcial {

    public static void main(String[] args) {
        // La interfaz Swing siempre se crea en el hilo de eventos
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            // 1) Modelo, 2) controlador que usa el modelo, 3) vista que usa el controlador
            Agenda agenda = new Agenda();
            ControladorAgenda controlador = new ControladorAgenda(agenda);
            VistaAgenda vista = new VistaAgenda(controlador);
            vista.setVisible(true);
        });
    }
}
