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

public class Factura {

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
}
