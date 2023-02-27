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

public class JI5_Arreglos {
    public static void main(String[] args) {
        String [] nombres = new String[4];
        nombres[0] = "Juan";
        nombres[1] = "Pedro";
        nombres[2] = "Maria";
        nombres[3] = "Ana";

        try{
            System.out.println("Nombre: " + nombres[0]);
            System.out.println("Nombre: " + nombres[1]);
            System.out.println("Nombre: " + nombres[2]);
            System.out.println("Nombre: " + nombres[3]);

          //La linea es Solamente para probar el error den Array.....
            //  System.out.println("Nombre: " + nombres[5]);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("ERROR EN EL ARREGLO // FUERA DE RANGO...");

        }catch (Exception e2){
            System.out.println("ERROR GENERAL EN ARREGLO..../");

        }

    }
}
