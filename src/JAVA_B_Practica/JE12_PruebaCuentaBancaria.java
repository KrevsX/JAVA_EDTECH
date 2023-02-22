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

public class JE12_PruebaCuentaBancaria {
    public static void main(String[] args) {
        JE11_CuentaBancaria cuenta = new JE11_CuentaBancaria();


        cuenta.setAbonoCuenta(100);
        cuenta.setCargoCuenta(25);
        cuenta.setSaldoCuenta();

        cuenta.setNoDui(388383443);
        cuenta.setNombre("Van Winkle");
        cuenta.setTelefono("23423434");

        System.out.println("Abono  : " + cuenta.getAbonoCuenta());
        System.out.println("Cargo  : " + cuenta.getCargoCuenta());
        System.out.println("Estado Cuenta: : " + cuenta.getSaldoCuenta());

        System.out.println("Numero Dui: " + cuenta.getNoDui());
        System.out.println("Nombres   : " + cuenta.getNombre());
        System.out.println("Telefono  : " + cuenta.getTelefono());
    }
}
