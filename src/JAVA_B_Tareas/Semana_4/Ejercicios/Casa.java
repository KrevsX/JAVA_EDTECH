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

package JAVA_B_Tareas.Semana_4.Ejercicios;

public class Casa {


    String nomCalle;
    int numPasaje;
    String numCasa;


    public Casa(String nomCalle, int numPasaje, String numCasa) {
        this.nomCalle = nomCalle;
        this.numPasaje = numPasaje;
        this.numCasa = numCasa;
    }

    public void infoCasa() {
        System.out.println("Nombre de la Calle: " + nomCalle);
        System.out.println("Numero de Pasaje:  " + numPasaje);
        System.out.println("Numero de Casa: " + numCasa);
    }
}
