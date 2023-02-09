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

package JAVA_EjerciciosPracticos.ClasesExternas;

public class Doctor {
    //Atributos
    public static int id = 0;
    public String name;
    String speciality;

    public Doctor() {
        System.out.println("Construyendo el Objeto");
        id++;
    }

    public Doctor(String name) {
        System.out.println("El nombre Asignado es: " + name);
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
