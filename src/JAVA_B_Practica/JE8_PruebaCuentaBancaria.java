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

import javax.swing.*;

public class JE8_PruebaCuentaBancaria {
    public static void main(String[] args) {
        JE9_Cliente propietario = new JE9_Cliente();
        JE7_CuentaBancaria cuenta = new JE7_CuentaBancaria();

        propietario.noDui = "003388593";
        propietario.nombre = "Roztenkowski";
        propietario.telefono = 503476543;

        cuenta.propietarioCuenta = propietario;

        String montoDinero;
        montoDinero = JOptionPane.showInputDialog("Ingresar monto de dinero para abonar");
        cuenta.abonar(Double.parseDouble(montoDinero));

        montoDinero = JOptionPane.showInputDialog("Ingresar monto de dinero que desea Retirar");
        cuenta.retirar(Double.parseDouble(montoDinero));

        JOptionPane.showMessageDialog(null, "El Saldo de la cuenta es: " + cuenta.saldoCuenta);

        JOptionPane.showMessageDialog(null, "Datos del propietario de la cuenta \n" +
                cuenta.dataosPropietarioCuenta());


    }
}
