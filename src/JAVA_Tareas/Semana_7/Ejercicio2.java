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

package JAVA_Tareas.Semana_7;

import javax.swing.*;

public class Ejercicio2 {
    /*
    2) Un obrero necesita calcular su salario semanal, si trabaja 40 horas o menos
        tiene un pago de 10 dólares por hora, y si trabaja más de 40 horas se le paga
        15 dólares por hora por cada hora extra, realizar el programa en Java.
        Ingresar el número de horas trabajadas y calcular el salario devengado.
        El programa deberá de hacer los cálculos para 10 empleados utilizando
        repeticiones.
    */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int hrsTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Horas Trabajadas del Empleado: " + i + "#"));
            double salario;
            if (hrsTrabajadas <= 40) {
                salario = hrsTrabajadas * 10;

            } else {
                salario = hrsTrabajadas * 15;

            }
            JOptionPane.showMessageDialog(null, "El Empleado " + i + "# " + "Genero: " + salario + " $\n"
                    + "En base a " + hrsTrabajadas + " Horas Extras Realizadas");
        }
    }
}
