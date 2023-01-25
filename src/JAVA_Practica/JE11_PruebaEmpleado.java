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

package JAVA_Practica;

public class JE11_PruebaEmpleado {

    public static void main(String[] args) {

        JE10_Empleado emp = new JE10_Empleado();

        emp.setNoCarnet(9393);
        emp.setNombres("Kevs");
        emp.setApellidos("Van Winkle");

        System.out.println("Carnet    : " + emp.getNoCarnet());
        System.out.println("Nombres   : " + emp.getNombres());
        System.out.println("Apellidos : " + emp.getApellidos());
    }

}
