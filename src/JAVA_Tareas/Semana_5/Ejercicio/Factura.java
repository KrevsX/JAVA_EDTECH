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
    boolean estatus;


    public double impuestoIva() {

        return (montFactura * 0.13);
    }

    public long getNoFactura() {
        return noFactura;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMontFactura() {
        return montFactura;
    }

    public void setMontFactura(double montFactura) {
        this.montFactura = montFactura;
    }

    public void estatusCliente() {
        if (this.montFactura > 0) {

            this.estatus = true;

            System.out.println("________\n" + "ACTIVO ✔\n" + "________");

        } else {

            System.out.println("__________\n" + "INACTIVO ❌\n" + "__________");

        }
    }
}
