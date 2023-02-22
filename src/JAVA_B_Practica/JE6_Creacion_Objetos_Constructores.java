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

public class JE6_Creacion_Objetos_Constructores {
    long noCarnet;
    String nombres;
    String apellidos;

    public void registrarEmpleado() {
        System.out.println("Metedo para Registrar empleados");

    }

    public void consultarEmpleado() {
        System.out.println("metodo para consultar empleado");
    }

    public void eliminarEmpleado() {
        System.out.println("Metodo para Eliminar Empleado");
    }

    public static void main(String[] args) {
        JE6_Creacion_Objetos_Constructores emp = new JE6_Creacion_Objetos_Constructores();
        emp.noCarnet = 29833;
        emp.apellidos = "Alas";
        emp.nombres = "kev";

        emp.registrarEmpleado();
        emp.consultarEmpleado();
        emp.eliminarEmpleado();

        System.out.println("No Carnet: " + emp.noCarnet);
        System.out.println("Apellidos: " + emp.apellidos);
        System.out.println("Nombres: " + emp.nombres);
    }
}
