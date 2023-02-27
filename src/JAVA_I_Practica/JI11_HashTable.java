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

package JAVA_I_Practica;

import java.util.Hashtable;
import java.util.Scanner;

public class JI11_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> empleados = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Primer Nombre: ");
        String primerNombre = sc.nextLine();
        System.out.println("Ingrese el Segundo Nombre: ");
        String segundoNombre = sc.nextLine();
        System.out.println("Ingrese el Tercer Nombre: ");
        String tercerNombre = sc.nextLine();

        empleados.put(1, primerNombre);
        empleados.put(2, segundoNombre);
        empleados.put(3, tercerNombre);

        imprimirHashTable(empleados);

    }

    public static void imprimirHashTable(Hashtable<Integer, String> empleados) {
        for (String emps : empleados.values()) {
            System.out.println("Nombre del Empleado: " + emps);
        }
    }
}
