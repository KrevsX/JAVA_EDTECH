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
import java.io.*;

import static JAVA_I_Tareas.Semana_1.Menu.MenuOpcionMultiple;


public class Ejercicio_1 {
    public static void main(String[] args) {

        MenuOpcionMultiple();

    }

    public static void crearArchivo() {
        //-- Ruta proporcionada por Lic Daniel...
        String ruta = "\\edutech\\Excepciones.txt";
        String[] info = {"1.Kevin..",
                "2.Kevin..",
                "3.Kevin..",
                "4.Kevin..",
                "5.Kevin..",
        };

        try {
            File doc = new File(ruta);
            doc.createNewFile();

            BufferedWriter addInfo = new BufferedWriter(new FileWriter(doc));
            for (String newLine : info) {
                addInfo.write(newLine);
                addInfo.newLine();
            }
            addInfo.close();
            JOptionPane.showMessageDialog(null, "Archivo Creado....".toUpperCase());

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al Crear Archivo....".toUpperCase() + e.getMessage());

        }
    }

    public static void mostrarArchivo() {
        String ruta = "\\edutech\\Excepciones.txt";

        try {
            BufferedReader showInfo = new BufferedReader(new FileReader(ruta));
            String line;
            while ((line = showInfo.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar Archivo....".toUpperCase() + e.getMessage());
        }

    }
}
