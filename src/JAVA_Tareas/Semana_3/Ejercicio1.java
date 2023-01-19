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

public class Ejercicio1 {
    /*  1) Escriba un programa para calcular el salario de un empleado sabiendo que su
        salario diario es de $10.00 y que el pago por hora extra es del 10% del salario
        diario. El programa deberá permitir ingresar el nombre del empleado, el número
        de días trabajados, el salario diario y el número total de horas extras. El
        programa deberá de imprimir el nombre del empleado y el salario final del
        empleado.
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el Nombre del Empleado: ");
        String nombreEmp = scan.nextLine().toUpperCase();
        System.out.println("Ingresa los Dias Trabajados: ");
        int diaTrab = scan.nextInt();
        System.out.println("Ingresar la cantidad de Horas Extras Trabjadas: ");
        int hrsExTrab = scan.nextInt();
        System.out.println("""
                Seleccionar Salario Diario:\s
                1) 10.00$\s
                2) Otro - Ingresar nuevo Salario Diario\s
                """);

        int opcion = scan.nextInt();
        if (opcion == 1) {

            double vaConocido = valorHrExtra(10.00);
            double a = pagoMensualop1(diaTrab);
            double b = valorHrExtra(hrsExTrab, vaConocido);
            double c = a + b;

            scan.close();

            System.out.println("-------------------------------------------------------------");
            System.out.println("El Nombre del Empleado Ingresado es: " + nombreEmp);
            System.out.println("------------------------------------");
            System.out.println("Salario Final del Empleado: " + c);
            System.out.println("-------------------------------------------------------------");

        } else if (opcion == 2) {

            System.out.println("Ingresar Nuevo Salario Diario");
            double nvSueldoDiario = scan.nextDouble();

            double vaIngresado = valorHrExtra(nvSueldoDiario);
            double a = pagoMensualop2(diaTrab, nvSueldoDiario);
            double b = valorHrExtra(hrsExTrab, vaIngresado);
            double c = a + b;



            System.out.println("-------------------------------------------------------------");
            System.out.println("El Nombre del Empleado Ingresado es: " + nombreEmp);
            System.out.println("------------------------------------");
            System.out.println("Salario Final del Empleado: " + c);
            System.out.println("-------------------------------------------------------------");


        } else {
            System.out.println(" -EL VALOR INGRESADO NO ES VALIDO-\n"
                    + "INTENTALO NUEVAMENTE");
        }
    }

    public static double valorHrExtra(int hrextra_trabajada, double pagoHrExtra) {

        return hrextra_trabajada * pagoHrExtra;
    }

    //PAGO MENSUAL OPCION 1
    public static double pagoMensualop1(int hrTrabajada) {
        return hrTrabajada * 10;
    }


    //PAGO MENSUAL OPCION 2
    public static double pagoMensualop2(int hrTrabajada, double valorIngresado) {
        return hrTrabajada * valorIngresado;
    }

    //VALOR DE LA HORA EXTRA
    public static double valorHrExtra(double valorConocido) {
        return valorConocido * 0.1;
    }

}
