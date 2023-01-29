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

public class Ejercicio1 {
    public static void main(String[] args) {

        int aprobados = 0;
        int reprobados = 0;


        for (int i = 1; i <= 10; i++) {

            String nombre = JOptionPane.showInputDialog("Ingrese el Nombre del Alumno: #" + i).toUpperCase();

            JOptionPane.showMessageDialog(null, "Acontinuacion Ingresaras las Notas de los 4 Laboratorios de: " + nombre);

            double lab1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Primer Laboratorio: \n"));
            double lab2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Segundo Laboratorio: \n"));
            double lab3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Tercer Laboratorio: \n"));
            double lab4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Cuarto Laboratorio: \n"));

            JOptionPane.showMessageDialog(null, "Acontinuacion Ingresaras las Notas de los 4 Parciales de: " + nombre);

            double par1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Primer Laboratorio: \n"));
            double par2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Segundo Laboratorio: \n"));
            double par3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Tercer Laboratorio: \n"));
            double par4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Nota del Cuarto Laboratorio: \n"));

            double rlab = promLaboratorios(lab1, lab2, lab3, lab4);

            double rpar = promParciales(par1, par2, par3, par4);

//            double notaFinal = promFinal(rpar, rlab);

            if (promFinal(rpar, rlab) >= 6.0) {
                JOptionPane.showMessageDialog(null, "FELICIDADES " + nombre + " APROBASTE CON NOTA: " + promFinal(rpar, rlab));

                aprobados++;
            } else {
                JOptionPane.showMessageDialog(null, "LAMENTABLEMENTE " + nombre + " HAZ REPROBADO CON NOTA: " + promFinal(rpar, rlab));
                reprobados++;
            }
        }
        JOptionPane.showMessageDialog(null,
                "CANTIDAD DE ESTUDIANTES APROBADOS: \n" + aprobados + "\n"
                        + "CANTIDAD DE ESTUDIANTES REPROBADOS: \n" + reprobados);


    }

    public static double promLaboratorios(double l1, double l2, double l3, double l4) {
        double sumatoria = (l1 + l2 + l3 + l4) / 4;
        return sumatoria * 0.4;
    }

    public static double promParciales(double p1, double p2, double p3, double p4) {
        double sumatoria = (p1 + p2 + p3 + p4) / 4;
        return sumatoria * 0.6;
    }

    public static double promFinal(double metodoPromLab, double metodoPromPar) {

        return metodoPromLab + metodoPromPar;
    }
}
