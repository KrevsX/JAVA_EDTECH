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

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JI1_Maneno_Excepcion_Errores {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double precioSinIva;
        double precioConIva;

        try{
            System.out.println("Digite Precio sin Iva:  ");
            precioSinIva = Double.parseDouble(reader.readLine());
            precioConIva = precioSinIva *1.13;
            System.out.printf("Precio sin Iva: " + precioSinIva);
            System.out.println("Precio con Iva: " + precioConIva);
        }catch (Exception e){
            System.out.println("Error al capturar datos desde el teclado....");
            System.out.println(e.getMessage());
        }
    }
}
