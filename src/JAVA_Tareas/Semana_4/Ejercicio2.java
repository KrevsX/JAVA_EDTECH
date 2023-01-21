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

package JAVA_Tareas.Semana_4;

import JAVA_Tareas.Semana_4.Ejercicios.Banco;

import javax.swing.*;

public class Ejercicio2 {
/*
    2) Modelar una clase que calcule cuanto le dará su banco después de realizar un
    depósito a plazo fijo. Para ello el programa debe pedir el nombre del cliente y la
    cantidad que desea invertir en el banco, el interés anual que le pagará el banco
    por el dinero (ejemplo 3%) y el plazo de la inversión (De 1 a 12 meses). El
    programa debe de calcular el dinero que se obtiene después de un año o en el
    mes que el usuario requiera recuperar su inversión (divida el interés entre 12 y
    multiplíquelo por el número de meses). El programa deberá imprimir el nombre
    del cliente, el monto invertido y la ganancia obtenida.
*/

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Ingresar Nombre Cliente: ");
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingresar la Cantidad que Desea Invertir: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingresar Interes Anual: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Plazo de Inversion (En Meses): "));
        Banco banco = new Banco(a, b, c, d);

        JOptionPane.showMessageDialog(null, "LOS DATOS INGRESADOS Y RESULTANTES SON: \n" +
                "______________________________________\n"
                + banco.Info());

    }

}
