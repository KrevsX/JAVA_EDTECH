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

package JAVA_EjerciciosPracticos.ExsPracticos;

import JAVA_EjerciciosPracticos.ClasesExternas.Doctor;


public class Ejercicio9 {
    //Metodo Construtores...
    // y su funcion...
    // ver clasesExternas
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Orem RIP VAN";
        myDoctor.showName();
        myDoctor.showId();

        Doctor.id++;

        Doctor myDocKevs = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctor2 = new Doctor("Kevin Van Winkle");
    }
}
