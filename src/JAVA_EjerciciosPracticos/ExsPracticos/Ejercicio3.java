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

package JAVA_EjerciciosPracticos.ExsPracticos;

public class Ejercicio3 {
    public static void main(String[] args) {

        double preciohorno = 69;
        double descuento = 0.13;
        double preciosinIva;

        preciosinIva = preciohorno - (preciohorno * descuento);

        System.out.println("precio sin Iva: " + preciosinIva);
        System.out.println("Iva: 13%");
        System.out.println("Precio con Iva: " + preciohorno);
    }
}
