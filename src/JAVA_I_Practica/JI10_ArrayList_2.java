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

package JAVA_I_Practica;


import javax.swing.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Empleado {
    private String noNit;
    private String nombreContrib;

    public Empleado(String noNit, String nombreContrib) {
        this.noNit = noNit;
        this.nombreContrib = nombreContrib;
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombreContrib() {
        return nombreContrib;
    }

    public void setNombreContrib(String nombreContrib) {
        this.nombreContrib = nombreContrib;
    }
}

public class JI10_ArrayList_2 {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        String caderna = JOptionPane.showInputDialog("Ingrese nombre y numero de Nit Separados por una -> ( , ) ");

        StringTokenizer token = new StringTokenizer(caderna, ",");
        int posc = 1;
        String nombreContrib = "";
        String noNit = "";
        while (token.hasMoreTokens()) {
            if (posc == 1) nombreContrib = token.nextToken().trim();
            if (posc == 2) noNit = token.nextToken().trim();
            posc++;

        }
        empleados.add(new Empleado(noNit, nombreContrib));
        imprimirArrayList(empleados);
    }

    public static void imprimirArrayList(ArrayList<Empleado> empleado) {

        for (Empleado emp : empleado) {
            System.out.println("Numero de NIT..: " + emp.getNoNit());
            System.out.println("Nombre Contribuyente..: " + emp.getNombreContrib());
        }
    }
}

