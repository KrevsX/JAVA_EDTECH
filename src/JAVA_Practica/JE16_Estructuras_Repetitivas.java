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

package JAVA_Practica;

import javax.swing.*;

public class JE16_Estructuras_Repetitivas {
    public static void main(String[] args) {

        //    InstruccionFOR();

        LecturaCaracteres();
    }

    public static void InstruccionFOR() {
        String valor = JOptionPane.showInputDialog("Digite el numero de veces repetir....");
        if (valor == null) {
            JOptionPane.showMessageDialog(null, "El codigo no se ejecuta por Cancelar");
        } else {
            FORSencillo(Integer.parseInt(valor));
        }
    }

    public static void FORSencillo(int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.println("El valor de I es: " + i);
        }

    }

    public static void LecturaCaracteres() {
        String valor = JOptionPane.showInputDialog("Digite la cadena de texto a leer");
        if (valor == null) {
            JOptionPane.showMessageDialog(null, "El codigo no se ejecutara al cancelar...");

        } else {

            LeerCaracteresDeString(valor.toUpperCase());

        }
    }

    public static void LeerCaracteresDeString(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Cadena " + i + " - " + cadena.charAt(i));
        }
    }
}
