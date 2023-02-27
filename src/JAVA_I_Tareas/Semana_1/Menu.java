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

package JAVA_I_Tareas.Semana_1;


import javax.swing.*;

import static JAVA_I_Tareas.Semana_1.Ejercicio_1.crearArchivo;
import static JAVA_I_Tareas.Semana_1.Ejercicio_1.mostrarArchivo;

public class Menu {

    public static void MenuOpcionMultiple() {
        int opcion;
        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una Opcion...: \n"
                    + "1- Crear un Nuevo Archivo con el nombre de ==> Excepciones.txt <== \n"
                    + "2- Abrir y Leer el Archivo Creado.\n"
                    + "3- Salir del Menu"));

            switch (opcion) {
                case 1:
                    crearArchivo();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "el contenido se mostrara en consola....".toUpperCase());
                    mostrarArchivo();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del Programaa...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Opcion Ingresada Invalida");
                    break;

            }

        } while (true);

    }

}
