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

import java.util.InputMismatchException;
import java.util.Scanner;

public class JI4_Maneno_Excepcion_Errores_4 {

    public static void main(String[] args) {
        try{
            int x;
            x = numSelect();
            System.out.println("Tu numero es:/// "+ x);
        }catch (InputMismatchException ex) {
            System.out.println("Haz Ingresado un valor \n"
                    + "////  QUE NO ES ENTERO ////");
        }

    }
    public static int numSelect() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero...: ");
        return sc.nextInt();
    }
}
