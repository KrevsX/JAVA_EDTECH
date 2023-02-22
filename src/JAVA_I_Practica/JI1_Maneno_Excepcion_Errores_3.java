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

import java.util.Scanner;

public class JI1_Maneno_Excepcion_Errores_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite el valor 2: ");
        int numero2 = sc.nextInt();

        try{
            int resultado = metodo1(numero1, numero2);
            System.out.println("Resultado...." + resultado);
        } catch (Exception e) {
            System.out.println("Error al Dividir..........");
        }
    }
    public static int metodo1(int valor1, int valor2) throws Exception {
        int resultado = metodo2(valor1, valor2);
        System.out.println("Se Ejecuto Error en Metodo1");
        return resultado;
    }
    public static int metodo2(int valor1, int valor2) throws Exception {
        int resultado = valor1/valor2;
        System.out.println("Se Ejecuto Error en Metodo2");
        return resultado;
    }
}
