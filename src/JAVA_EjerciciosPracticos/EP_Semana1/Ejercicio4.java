/*
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_EjerciciosPracticos.EP_Semana1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el Sueldo Base");
        double sueldoBase = scan.nextDouble();

        double descRenta = sueldoBase * 0.1;
        double descAfp =sueldoBase * 0.0725;
        double descSeguro =sueldoBase* 0.03;

        double totalRecibir;

        totalRecibir = sueldoBase - descRenta-descAfp-descSeguro;

        System.out.println("Total a Recibir: "+ totalRecibir);


    }
}
