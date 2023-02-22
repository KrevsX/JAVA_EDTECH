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

package JAVA_B_Tareas.Semana_6;

import javax.swing.*;

public class Ejercicio1 {

    /*
    1) Crear un programa que simule el funcionamiento de una calculadora que
    pueda realizar las cuatro operaciones aritméticas básicas (suma, resta,
    multiplicación y división) con valores numéricos enteros. El usuario debe
    especificar la operación a realizar, por ejemplo: S para la suma, R para la
    resta, M para la multiplicación y D para la división. Primero se debe de
    ingresar el primer valor, luego el operador y finalmente el segundo valor.
    Nota: Se recomienda el empleo de la sentencia switch.
    */
    public static void main(String[] args) {

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Primera Valor: "));
        String opcion = JOptionPane.showInputDialog("Ingresar:\n"
                + "S - Para Sumar\n"
                + "R - Para Restar\n"
                + "D -  Para Dividir\n"
                + "M - para Multiplicar\n").toUpperCase();
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Segundo Valor: "));

        switch (opcion) {
            case "S":
                JOptionPane.showMessageDialog(null, "El Resultado es: \n"
                        + Sumar(valor1, valor2));
                break;

            case "R":
                JOptionPane.showMessageDialog(null, "El Resultado es: \n"
                        + Restar(valor1, valor2));
                break;

            case "M":
                JOptionPane.showMessageDialog(null, "El Resultado es: \n"
                        + Multiplicar(valor1, valor2));
                break;

            case "D":
                JOptionPane.showMessageDialog(null, "El Resultado es: \n"
                        + Dividir(valor1, valor2));
                break;

        }

    }

    public static int Sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public static int Restar(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public static int Dividir(int valor1, int valor2) {
        return valor1 / valor2;
    }

    public static int Multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
}
