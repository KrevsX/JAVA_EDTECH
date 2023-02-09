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

public class Ejercicio7 {
    public static void main(String[] args) {
        String montoDinero = JOptionPane.showInputDialog("Ingrese la cantidad de Dinero a Depositar");
        String numeroAnios = JOptionPane.showInputDialog("Ingrese los Anios del deposito");
        String interesAnual = JOptionPane.showInputDialog("Ingrese el interes Anual....");

        calculoInteres(Double.parseDouble(montoDinero), Integer.parseInt(numeroAnios), Double.parseDouble(interesAnual));

    }

    public static void calculoInteres(double montoD, double numeroAnios, double interes) {
        for (int i = 1; i < numeroAnios; i++) {
            double interesXAnio = montoD * (interes / 100);
            montoD += montoD * (interes / 100);
            System.out.println("Monto Interes en el Anio: " + i + ": " + interesXAnio);
            System.out.println("Monto Dinero mas Interes: " + montoD);
            System.out.println("------------------------------------------");
        }
    }
}
