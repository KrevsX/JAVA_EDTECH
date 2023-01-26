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

package JAVA_Tareas.Semana_5;

import javax.swing.*;
import java.text.DecimalFormat;

public class Factura {
    DecimalFormat df = new DecimalFormat("#.00");
    private int noFactura;
    private String nombreCliente;
    private String telefonoCliente;
    private String direccionCliente;
    private double montFactura;


    public Factura() {
        this.noFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de factura: ".toUpperCase()));
        this.nombreCliente = JOptionPane.showInputDialog("Ingresar nombre del cliente: ".toUpperCase());
        this.telefonoCliente = JOptionPane.showInputDialog("Ingresar teléfono del cliente: ".toUpperCase());
        this.direccionCliente = JOptionPane.showInputDialog("Ingresar dirección del cliente: ".toUpperCase());
        this.montFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto total de la factura: ".toUpperCase()));

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

        return "Nombre del Cliente: " + this.nombreCliente.toUpperCase()
                + "  ||   Teléfono: " + this.telefonoCliente + "\n"
                + "Dirección: " + this.direccionCliente.toUpperCase();
    }

    public String Atributos() {

        return "No. Factura: " + this.noFactura + "\n\n"
                + InfoPersonal() + "\n"
                + "_______________________________________________________________" + "\n\n"
                + "Monto Total Factura: " + df.format(this.montFactura) + "\n"
                + "Impuesto IVA 13% : " + df.format(calcularImpuestoIva()) + "\n\n"
                + "Cliente Activo: \n" + estatusCliente();

    }

}
