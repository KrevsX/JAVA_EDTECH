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

package JAVA_EjerciciosPracticos.EP_Semana1;

import javax.swing.*;


public class Ejercicio6 {
    public static void main(String[] args) {
        String valorVenta = JOptionPane.showInputDialog("Digite el valor de la Venta Realizada: ");
        String sexoVendedor = JOptionPane.showInputDialog("Ingrese el Sexo del Vendedor");
        calcularComision(Double.parseDouble(valorVenta), sexoVendedor.toUpperCase().charAt(0));
    }

    public static void calcularComision(double valorVenta, char sexoVendedor) {
        if (sexoVendedor == 'M') {
            double comision = 0.03 * valorVenta;
            double salario = 200 + comision;
            JOptionPane.showMessageDialog(null, "EL SALARIO DEL VENDERO MASCULINO ES : " + salario);

        } else if (sexoVendedor == 'F') {
            double comision = 0.05 * valorVenta;
            double salario = 200 + comision;
            JOptionPane.showMessageDialog(null, "EL SALARIO DEL VENDEDOR FEMENINO ES : " + salario);

        } else {
            JOptionPane.showMessageDialog(null, "SEXO DEL VENDEDOR ES INVALIDO");
        }
    }
}
