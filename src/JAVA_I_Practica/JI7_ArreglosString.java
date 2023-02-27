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

import javax.swing.*;
import java.util.StringTokenizer;

public class JI7_ArreglosString {
    public static void main(String[] args) {

        String[] nombres = new String[3];

        String cadena = JOptionPane.showInputDialog("Ingrese 3 Nombres Separados con ( , ) ");

        StringTokenizer tokens = new StringTokenizer(cadena, ",");
        int posc = 0;
        while (tokens.hasMoreTokens()) {
            nombres[posc] = tokens.nextToken().trim();
            posc++;
        }
        imprmirArreglo(nombres);
    }

    public static void imprmirArreglo(String[] nombres) {
        for (String nombre : nombres) {
            System.out.println("Nombres: " + nombre);
        }
    }
}
