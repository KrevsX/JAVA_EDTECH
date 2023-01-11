/*
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_EjerciciosPracticos.EP_Semana1;

public class Ejercicio5 {
    public static void main(String[] args) {
        double adquirido = 12000;
        double anualmente = 2400;

        double primerAno;
        double segundoAno;
        double tercerAno;
        double cuartoAno;


        primerAno = adquirido - anualmente;
        segundoAno = primerAno - anualmente;
        tercerAno = segundoAno - anualmente;
        cuartoAno = tercerAno - anualmente;
        double quintoAno = cuartoAno - anualmente;

        System.out.println("La cantidad Adquirida de " + adquirido + " Tendra 5 anos de vida Util");
        System.out.println("12,000 / 5 = $2,400 Por ano");
        System.out.println("El Primer Ano es  = " + primerAno);
        System.out.println("El Segundo Ano es = " + segundoAno);
        System.out.println("El Tercer Ano es  = " + tercerAno);
        System.out.println("El Cuarto Ano es  = " + cuartoAno);
        System.out.println("El Quinto Ano es  = " + quintoAno);


    }
}
