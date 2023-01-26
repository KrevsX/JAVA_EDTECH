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

package JAVA_Tareas.Semana_5.Ejercicio;

import javax.swing.*;

public class Factura {
    private int noFactura;
    private String nombreCliente;
    private String telefonoCliente;
    private String direccionCliente;
    private double montFactura;


    public Factura() {
        this.noFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de factura: "));
        this.nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        this.telefonoCliente = JOptionPane.showInputDialog("Ingrese el teléfono del cliente: ");
        this.direccionCliente = JOptionPane.showInputDialog("Ingrese la dirección del cliente: ");
        this.montFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de la factura: "));

    }

    public String estatusCliente() {

        String estatusCleinte;
        if (this.montFactura > 0) {


            estatusCleinte = """
                    ________
                    ACTIVO ✔
                    ________""";

        } else {

            estatusCleinte = """
                    __________
                    INACTIVO ❌
                    __________""";

        }
        return estatusCleinte;
    }

    public double calcularImpuestoIva() {
        return this.montFactura * 0.13;
    }


    public String InfoPersonal() {

        return "Nombre del Cliente: " + this.nombreCliente
                + "|| Teléfono: " + this.telefonoCliente + "\n"
                + " Dirección: " + this.direccionCliente;
    }

    public String Atributos() {

        return "No. Factura: " + this.noFactura + "\n\n"
                + InfoPersonal() + "\n"
                + "_______________________________________________________________" + "\n"
                + " Monto Total Factura: " + this.montFactura + "\n"
                + " Cliente Activo: \n" + estatusCliente()
                + " Impuesto IVA: " + calcularImpuestoIva();
    }

}
