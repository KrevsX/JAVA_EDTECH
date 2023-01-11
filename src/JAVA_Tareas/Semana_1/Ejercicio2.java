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

package JAVA_Tareas.Semana_1;

public class Ejercicio2 {
    public static void main(String[] args) {

        int carroVendido = 15;
        double precVehiculo = 12000;
        double comXventa = 0.02;
        double gananciaMensual = 15 * precVehiculo * comXventa;

        System.out.println("El Empleado a Vendido: " + carroVendido + " Vehiculos");
        System.out.println("comision por Venta 2% " + precVehiculo * comXventa + " $");
        System.out.println("Ganacia Mensual Comision con por Venta: " + gananciaMensual + " $");
    }
}
