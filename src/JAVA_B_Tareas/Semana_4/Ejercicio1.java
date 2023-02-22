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

package JAVA_B_Tareas.Semana_4;

import JAVA_B_Tareas.Semana_4.Ejercicios.Casa;

import java.util.Scanner;

public class Ejercicio1 {
/*
    1) Modelar una clase Casa con los atributos número de casa, numero de pasaje y
    nombre de la calle. El número de la casa debe ser alfanumérico para contemplar
    las casas que tengan números como “27A”). Cuando la casa se crea se asigna
    tanto el número de la casa, el número de pasaje y la calle. La clase tiene que
    tener definido un método para imprimir los valores asignados.
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la Calle: ");
        String a = scan.nextLine().toUpperCase();

        System.out.println("Ingrese el numero de Pasaje: ");
        int b = Integer.parseInt(scan.nextLine());

        System.out.println("Ingrese el numero del Casa: ");
        String c = scan.nextLine().toUpperCase();

        Casa info = new Casa(a, b, c);

        info.infoCasa();


    }

}
