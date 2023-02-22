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
import java.util.Scanner;

public class JI1_Maneno_Excepcion_Errores_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        try{
            int numero = sc.nextInt();
            System.out.println("El numero ingresado es: " + numero);
        }catch (Exception e){
            System.out.println("Error al Leer el numero......");
        }

    }
}
