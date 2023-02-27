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

package JAVA_I_Practica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JI6_Leer_Archivos {
    public static void main(String[] args) {

        try {
            BufferedReader ltr = new BufferedReader(new FileReader("C:\\Users\\RAVENX\\IdeaProjects\\JAVA_EDTECH\\src\\JAVA_I_Practica\\CursoJava.txt"));
            String linea = ltr.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = ltr.readLine();
            }

        }catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}
