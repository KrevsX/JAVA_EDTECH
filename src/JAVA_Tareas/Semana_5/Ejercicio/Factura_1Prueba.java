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
import java.text.DecimalFormat;

public class Factura_1Prueba {

    private long noFactura;
    private String nombre;
    private long telefono;
    private String direccion;
    private double montFactura;

    public double impuestoIva() {

        return montFactura * 0.13;
    }

    public void setNoFactura(long noFactura) {
        this.noFactura = noFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void setMontFactura(double montFactura) {
        this.montFactura = montFactura;
    }


    public String InfoPersonal() {

        return "Nombre del Cliente: " + this.nombre + "  ||  " + "Telefono: " + this.telefono + "\n\n"
                + "Direccion: " + this.direccion;
    }

    public String TdsAtributos() {
        return "Factura Numero: " + this.noFactura + "\n\n"
                + "Monto de Factura: " + this.montFactura;
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

    public static class Ejercicio1 {
        /*  Crear la clase Factura utilizando ENCAPSULAMIENTO con las siguientes características:

            Atributos:
            No Factura
            Nombre del Cliente
            Teléfono del Cliente
            Dirección del Cliente
            Monto Total Factura
            Bandera de Cliente Activo o Inactivo
            Impuesto del Iva

            Métodos:
            Crear un método para calcular el Impuesto del Iva (Monto Total Factura * 13%)
            Imprimir el Nombre, Teléfono y Dirección concatenados
            Imprimir Todos los Atributos
            Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas.
        */
        public static void main(String[] args) {

            DecimalFormat df = new DecimalFormat("#.00");
            Factura_1Prueba fact = new Factura_1Prueba();

            //  NOTA   //
            //  EL ESTATUS DEL CLIENTE ESTA BASADO
            //  EN EL MONTO INGRESADO
            //  AL INGRESAR 0 SERA INACTIVO
            //  AL IMGRESAR UN NUMERO MAYOR A 0 SERA ACTIVO...

            long noFactura = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresa el Numero de Factura: \n"));
            String nombre = JOptionPane.showInputDialog(null, "Ingrese su Nombre: \n");
            long telefono = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese su numero Telefonico: \n"));
            String direccion = JOptionPane.showInputDialog(null, "Ingrese su Direccion de Vivienda: \n");
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar el Monto a Facturar: \n"));
            ///
            fact.setNoFactura(noFactura);
            fact.setNombre(nombre);
            fact.setTelefono(telefono);
            fact.setDireccion(direccion);
            fact.setMontFactura(montoFactura);
            ///
            JOptionPane.showMessageDialog(null, fact.InfoPersonal() + "\n\n"
                    + "_____________________________________\n"
                    + fact.TdsAtributos() + "\n"
                    + "_____________________________________\n"
                    + "IVA 13% :"
                    + df.format(fact.impuestoIva()) + "\n"
                    + "_____________________________________\n"
                    + "Estatus del Cliente: \n"
                    + fact.estatusCliente());


        }

    }
}
