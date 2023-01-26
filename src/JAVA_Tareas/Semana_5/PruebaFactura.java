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

package JAVA_Tareas.Semana_5;


import javax.swing.*;

public class PruebaFactura {
/*  Crear la clase Factura utilizando ENCAPSULAMIENTO con las siguientes características:

            Atributos:
            No Factura
            Nombre del Cliente
            Teléfono del Cliente
            Dirección del Cliente
            Monto Total Factura
            Bandera de Cliente Activo o Inactivo
            Impuesto del Iva

            Métodos:
            Crear un método para calcular el Impuesto del Iva (Monto Total Factura * 13%)
            Imprimir el Nombre, Teléfono y Dirección concatenados
            Imprimir Todos los Atributos
            Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
*/

    public static void main(String[] args) {
        Factura fc = new Factura();

        JOptionPane.showMessageDialog(null, fc.Atributos());

    }
}
