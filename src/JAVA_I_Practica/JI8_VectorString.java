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
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class JI8_VectorString {
    public static void main(String[] args) {
        Vector<String> nombres = new Vector<String>();

        String cadena = JOptionPane.showInputDialog("Ingrese 3 nombres Separados por una ( , )");
        StringTokenizer token = new StringTokenizer(cadena, ",");

        while (token.hasMoreTokens()) {
            nombres.add(token.nextToken().trim());
        }
        imprimirVector(nombres);

    }

    public static void imprimirVector(Vector<String> nombres) {
        Collections.sort(nombres);
        Iterator iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println("Nombres..: " + iter.next());
        }
    }

}
