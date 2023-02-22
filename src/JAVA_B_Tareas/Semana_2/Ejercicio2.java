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

public class Ejercicio2 {
    public static void main(String[] args) {
  /*    2) Un trabajador de la industria de la construcción gana $300 al mes en su
        jornada normal de trabajo. Normalmente el empleado tiene que trabajar
        horas extras para cumplir con su trabajo. En el mes a acumulado 15 horas
        extras que se la pagan a $2. ¿Cuánto ganara el trabajador al final de un mes
        de trabajo?.
        $300 al mes y $10 por día (300 / 30 días del mes)
        10 por día / 8 horas del día = $1.25 gana por hora
        15 * 2 = salario extra
        El salario total es el salario normal más el salario extra.
  */
        double salarioEmp = 300;
        int hrsExtra = 15;
        double pagoHora = 2;
        double pagoTotal;
        pagoTotal = salarioEmp + (hrsExtra * pagoHora);

        System.out.println("-----------------------------------------------------");
        System.out.println("$300 al mes y $10 por día (300 / 30 días del mes)\n" +
                "10 por día / 8 horas del día = $1.25 gana por hora \n" +
                "El Salario extra es en Base a: \n" +
                hrsExtra + " Horas Trabajadas,\n" +
                pagoHora + "$ Por Hora Extra Trabajada,\n" +
                "Salario Base + Horas Extras = " + pagoTotal + " $");
        System.out.println("-----------------------------------------------------");


    }

}
