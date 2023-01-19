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

package JAVA_Tareas.Semana_3;

import java.util.Scanner;

public class Ejercicio2 {
/*
    2) Una empresa de venta de computadoras paga a su personal de ventas un salario
    de $300,00 más una comisión de $50,00 por computadora vendida. Diseñar un
    programa para calcular el salario de un vendedor en un determinado mes,
    conociendo el nº de computadoras vendidas. Al salario devengado se debe de
    retener el 10% en concepto de renta. Imprimir el nombre del vendedor, el salario
    devengado y la retención de la renta.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sueldoMensual = 300;
        double comxVent = 50;

        System.out.println("Ingresar el Nombre del Empleado: ");
        String nomEmp = scan.nextLine();
        System.out.println("Ingresar en texto el Mes: ");
        String mes = scan.nextLine().toUpperCase();
        System.out.println("Ingresar la cantidad de computadoras vendidas en el\n" +
                "Mes de : " + mes);
        int compVend = scan.nextInt();
        scan.close();

        double a = comisionVentaC(compVend);
        double b = sumaSueldoCom(sueldoMensual, a);
        double c = retRenta(b);

        double resultado = b - c;

        System.out.println("-------------------------------------------------------------");
        System.out.println("El Empleado: " + nomEmp);
        System.out.println("----------------------------------------");
        System.out.println("Vendio: " + compVend + " Computadoras en el mes de: " + mes);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Sueldo Mensual:                  " + sueldoMensual + " $" + " +");
        System.out.println("----------------------------------------");
        System.out.println("Comision x Venta: " + compVend + " X " + comxVent + " $" + " =  " + a + " $" + " +");
        System.out.println("----------------------------------------");
        System.out.println("                                " + b + " $" + " =");
        System.out.println("----------------------------------------");
        System.out.println("Rentencion de Renta:             " + c + " $" + " -");
        System.out.println("----------------------------------------");
        System.out.println("Sueldo a Recibir:                " + resultado + " $" + " =");
        System.out.println("----------------------------------------");


    }

    private static double sumaSueldoCom(double sueldoMes, double comVent) {
        return sueldoMes + comVent;
    }

    public static double comisionVentaC(int cantCompuVend) {
        return cantCompuVend * 50.00;
    }

    public static double retRenta(double sumasSuCom) {
        return sumasSuCom * 0.1;

    }

}
