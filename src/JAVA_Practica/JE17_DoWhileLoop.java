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

package JAVA_Practica;

import java.util.Scanner;

public class JE17_DoWhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
/*

        // forma dy funcionabilidad de un DoWhileLoop...
        //DoWhileLoop();

        // version de seleccion ternarea...
        turnOnOffLight();
        if (isTurnOnLight) {
            printSos();
        }

        // while con impresion determinada en 10
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i <= 10) {
            printSos();
            i++;
        }
*/

        for (int i = 0; i <= 10; i++) {
            printSos();

        }


    }

    public static void DoWhileLoop() {
        int response;
        do {
            System.out.println("Selecciona el menu");
            System.out.println("1: Movies");
            System.out.println("2: Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());
            switch (response) {
                case 0 -> System.out.println("Gracias por visitarnos");
                case 1 -> System.out.println("Movies");
                case 2 -> System.out.println("Series");
                default -> System.out.println("Selecciona una opcion correcta");
            }
        } while (response != 0);
        System.out.println("Se termino el programa");
    }

    //pracitca whilee...
    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }

    public static void printSos() {
        System.out.println(". . . _ _ _ . . .");
    }
}
