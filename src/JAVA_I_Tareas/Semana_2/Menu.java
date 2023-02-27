/*
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia
 * accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget
 * metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_I_Tareas.Semana_2;

import javax.swing.*;
import java.util.HashMap;

import static JAVA_I_Tareas.Semana_2.Ejercicio_1.*;


public class Menu {

    public static void MenuOpcionesMultiples() {
        HashMap<String, InfoPersonal> infoP = Ejercicio_1.infoAgenda;
        try {
            int opcion;
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                        ---MENU DE OPCIONES AGENDA ELECTRONICA---

                        1. Agregar Nueva Persona...
                                                
                        2. Consultar datos de Personas por medio del DUI...
                                                
                        3. Eliminar datos de Personas por medio del DUI...
                                                
                        4. SALIR DEL MENU...
                        """));

                switch (opcion) {
                    case 1:

                        AgregarPersona(infoP);
                        break;
                    case 2:
                        ConsultarPersonas(infoP);
                        break;
                    case 3:
                        EliminarPersonas(infoP);
                        break;
                    case 4:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "NO HAZ INGREADO UNA OPCION VALIDA...");

                }
            } while (opcion != 4);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "NO HAZ INGREADO UNA OPCION VALIDA...");
        }

    }


}
