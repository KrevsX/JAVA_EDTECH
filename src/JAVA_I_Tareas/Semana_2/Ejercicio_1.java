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

package JAVA_I_Tareas.Semana_2;

import javax.swing.*;
import java.util.HashMap;

import static JAVA_I_Tareas.Semana_2.Menu.MenuOpcionesMultiples;

public class Ejercicio_1 {
    public static HashMap<String, InfoPersonal> infoAgenda = new HashMap<>();

    public static void main(String[] args) {


        MenuOpcionesMultiples();

    }


    public static void AgregarPersona(HashMap<String, InfoPersonal> infoAgenda) {

        String dui = JOptionPane.showInputDialog("Ingrese su numero de DUI: ");
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre: ");
        String telefono = JOptionPane.showInputDialog("Ingrese su telefono: ");

        boolean validacion = false;
        double salario = 0;
        while (!validacion) {
            try {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));
                validacion = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }

        infoAgenda.put(dui, new InfoPersonal(dui, nombre, salario, telefono));

    }

    public static void ConsultarPersonas(HashMap<String, InfoPersonal> infoAgenda) {

        String dui = JOptionPane.showInputDialog("Ingrese su numero de DUI: ");
        if (infoAgenda.containsKey(dui)) {
            InfoPersonal per = infoAgenda.get(dui);
            JOptionPane.showMessageDialog(null,
                    "==> Datos correspondientes de la Persona <==\n\n".toUpperCase()
                            + "Numero de DUI: " + "   " + per.getNoDui()
                            + "\n             Nombre: " + "   " + per.getNombre().toUpperCase()
                            + "\n            Telefono: " + "   " + per.getTelefono()
                            + "\n               Sueldo: " + "   " + per.getSalario());
        } else {
            JOptionPane.showMessageDialog(null, "El #DUI Ingresado: "
                    + dui
                    + "\n no existe en los datos".toUpperCase());
        }
    }


    public static void EliminarPersonas(HashMap<String, InfoPersonal> infoAgenda) {
        String dui = JOptionPane.showInputDialog("Ingrese su numero de DUI: ");
        if (infoAgenda.containsKey(dui)) {
            infoAgenda.remove(dui);
            JOptionPane.showMessageDialog(null, "La persona con #DUI Correspondiente: "
                    + dui
                    + "\n ha sido eliminado".toUpperCase());
        } else {
            JOptionPane.showMessageDialog(null, "El #DUI Ingresado: "
                    + dui
                    + "\n no existe".toUpperCase());
        }

    }

    public static void MostrarPersonas(HashMap<String, InfoPersonal> infoAgenda) {

    }


}
