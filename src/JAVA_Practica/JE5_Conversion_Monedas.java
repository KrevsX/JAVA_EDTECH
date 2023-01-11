/*
 * Copyright (c) 2023. By.Kevin Alas
 * All rights reserved
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package JAVA_Practica;

public class JE5_Conversion_Monedas {
    public static void main(String[] args) {
        // variable local para determinar la cantidad que tenemos

        double monedaDolar=75.00;

        double monedaEuro=monedaDolar*0.7;
        double monedaReinoUnido= monedaDolar*0.61;
        double monedaAustalia = monedaDolar*0.95;
        double monedaCanada= monedaDolar*0.97;

        System.out.println("Moneda Europa: "+ monedaEuro);
        System.out.println("Moneda ReinoUnido: "+ monedaReinoUnido);
        System.out.println("Moneda Australia: " + monedaAustalia);
        System.out.println("Moneda Canada: " + monedaCanada);
    }
}
