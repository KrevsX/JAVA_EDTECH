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

package JAVA_B_Tareas.Semana_2;

public class Ejercicio1 {
    public static void main(String[] args) {
/*  1) Si queremos convertir de grados Fahrenheit a grados Celsius debemos de
    utilizar una fórmula de conversión. Si queremos convertir 90 grados
    Fahrenheit a grados Celsius cuanto dará?
    °C = (°F − 32) × 5 ⁄ 9
*/
        double fahrenheit = 90;

        double celsius = ((fahrenheit - 32) * 5 / 9);
        System.out.println("-----------------------");
        System.out.println("90° Grados Fahrenheit");
        System.out.println("-----------------------");
        System.out.println("La Conversion a Celsius es: " + celsius);
        System.out.println("-----------------------");

    }
}
