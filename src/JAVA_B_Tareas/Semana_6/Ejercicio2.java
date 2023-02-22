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
import java.text.DecimalFormat;

public class Ejercicio2 {

    /*
    2) La empresa Compu Smart se dedica a la venta de equipos de computación.
    Vende tanto computadoras como dispositivos periféricos y consumibles. La
    empresa cuenta con un grupo de 5 vendedores a los cuales les paga la
    comisión según el rango de la venta efectuada. Si el vendedor vende de
    $3000 en adelante la comisión es el 10%, si vende de $1000 a $2999 gana
    el 8% y si la venta es de 1$ a $999 gana un 5%. Pero cada vendedor tiene
    un salario base de $300 al cual se le suma el valor de la comisión por ventas.
    Determinar el salario líquido de un vendedor según el monto de la venta
    realizada tomando en cuenta que se descuenta el 10% en concepto de renta.
    */
    public static void main(String[] args) {

        double salario = 300.00;

        String nombEmp = JOptionPane.showInputDialog("Ingresar Nombre del Empleado");

        double ventaEfectuada = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto Vendido: \n"));

        if (ventaEfectuada >= 3000.0) {

            Sup3000(nombEmp, salario, ventaEfectuada);

        } else if (ventaEfectuada >= 1000.0 && ventaEfectuada <= 2999.0) {

            Sup1kto2999(nombEmp, salario, ventaEfectuada);

        } else if (ventaEfectuada >= 1 && ventaEfectuada <= 999.0) {

            Sup1to999(nombEmp, salario, ventaEfectuada);

        } else {

            JOptionPane.showMessageDialog(null, "DATOS NO CONTEMPLADOS....");
        }
    }

    public static void Sup3000(String nombEmp, double salario, double ventaEq) {
        DecimalFormat df = new DecimalFormat("#.00");
        double sumatoria = salario + (ventaEq * 0.1);
        double retencion = sumatoria * 0.1;
        double resultado = sumatoria - retencion;
        JOptionPane.showMessageDialog(null, "Nombre de Empleado: \n"
                + nombEmp.toUpperCase() + "\n"
                + "Renta: \n"
                + "$ " + df.format(retencion) + "\n"
                + "Salario Liquido a Recibir: \n"
                + "$ " + df.format(resultado));
    }

    public static void Sup1kto2999(String nombEmp, double salario, double ventaEq) {
        DecimalFormat df = new DecimalFormat("#.00");
        double sumatoria = salario + (ventaEq * 0.08);
        double retencion = sumatoria * 0.1;
        double resultado = sumatoria - retencion;
        JOptionPane.showMessageDialog(null, "Nombre de Empleado: \n"
                + nombEmp.toUpperCase() + "\n"
                + "Renta: \n"
                + "$ " + df.format(retencion) + "\n"
                + "Salario Liquido a Recibir: \n"
                + "$ " + df.format(resultado));
    }

    public static void Sup1to999(String nombEmp, double salario, double ventaEq) {
        DecimalFormat df = new DecimalFormat("#.00");
        double sumatoria = salario + (ventaEq * 0.05);
        double retencion = sumatoria * 0.1;
        double resultado = sumatoria - retencion;
        JOptionPane.showMessageDialog(null, "Nombre de Empleado: \n"
                + nombEmp.toUpperCase() + "\n"
                + "Renta: \n"
                + "$ " + df.format(retencion) + "\n"
                + "Salario Liquido a Recibir: \n"
                + "$ " + df.format(resultado));
    }
}
