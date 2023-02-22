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

package JAVA_B_Practica;


public class JE14_Polimorfismo {

    public String convertirString(int valorInt) {
        String conversion = String.valueOf(valorInt);
        return conversion;
    }

    public String convertirString(double valordouble) {
        String conversion = String.valueOf(valordouble);
        return conversion;
    }

    public String convertirString(float valorfloat) {
        String conversion = String.valueOf(valorfloat);
        return conversion;
    }

    public static void main(String[] args) {
        JE14_Polimorfismo p = new JE14_Polimorfismo();

        System.out.println("Valor de Int a String    : " + p.convertirString(10));
        System.out.println("Valor de Double a String : " + p.convertirString(10));
        System.out.println("Valor de Float a String  : " + p.convertirString(10));

    }
}
