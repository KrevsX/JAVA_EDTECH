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

package JAVA_EjerciciosPracticos.ExsPracticos;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        // Ejercicio1();

        // Ejercicio2();

        //Ejercicio3();

        Ejercicio4();
    }

    public static void Ejercicio1() {

        int numEntrada = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero como Limite de Impresion: "));
        for (int i = 1; i <= numEntrada; i++) {
            System.out.println("Numero de Impresion: " + ":" + i);
        }


    }

    public static void Ejercicio2() {

        int numentrada = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero como limite de impresion: "));

        for (int i = 1; i <= numentrada; i++) {

            System.out.println(i);

            if (i == 100) {
                System.out.println("OPERACION ABORTADA EL NUMERO ES SUPERIOR A 100");
                return;
            }
        }
    }

    public static void Ejercicio3() {
        int numInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero Para Inizializar..."));
        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para Finalizar..."));

        for (int i = numInicial; i <= numFinal; i++) {
            System.out.println("Impreserion Inicial: " + i);
        }
    }

    public static void Ejercicio4() {
        int numInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor Incial..."));

        if (numInicial <= 0) {

            JOptionPane.showMessageDialog(null, "VALOR INICIAL INGRESADO INVALIDO...");
        }

        int numFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Valor Final....."));

        for (int i = numInicial; i <= numFinal; i++) {

            System.out.println(i);

            if (i >= 50) {
                System.out.println("OPERACION ABORTADA EL NUMERO ES SUPERIOR A 50");

                return;

            }
        }
    }
}
