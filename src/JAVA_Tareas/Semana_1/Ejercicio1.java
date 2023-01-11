/*
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_Tareas.Semana_1;

public class Ejercicio1 {
    public static void main(String[] args) {

        double preciohorno = 75;
        double descuento = 0.13;
        double precioConiva;


        precioConiva = preciohorno+(preciohorno * descuento);

        System.out.println("-----------------------");
        System.out.println("Precio Sin Iva: " + preciohorno);
        System.out.println("-----------------------");
        System.out.println("13% IVA: " + preciohorno*descuento);
        System.out.println("-----------------------");
        System.out.println("precio Con Iva: " + precioConiva);
        System.out.println("-----------------------");

    }
}
