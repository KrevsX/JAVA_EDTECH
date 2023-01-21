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

public class JE7_CuentaBancaria {

    long  numeroCuenta;
    JE9_Cliente propietarioCuenta;
    double saldoCuenta;


    public void abonar(double cantidad){
        saldoCuenta += cantidad;
    }
    public void retirar(double cantidad){
        if (cantidad>saldoCuenta){
            System.out.println("Saldo Insuficiente");
        }else{
            saldoCuenta-= cantidad;
        }
    }

    public String dataosPropietarioCuenta(){
        String informacion ="";
        informacion += "Dui: " + propietarioCuenta.noDui+"\n";
        informacion += "Nombre: " + propietarioCuenta.nombre+"\n";
        informacion += "Telefono: " + propietarioCuenta.telefono+"\n";
        return informacion;
    }
}
