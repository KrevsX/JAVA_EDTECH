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

package JAVA_I_Tareas.Semana_4;

import javax.swing.*;
import java.io.*;


public class Ejercicio_1 {


    public static void main(String[] args) {
        int opcion;

        String nombre = "";
        int no_nit = 0;
        String direccion = "";
        double ingMens = 0.00;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UNA OPCION: \n"
                    + "1 - Para Agregar cliente..\n"
                    + "2 - Para Consultar Datos de los Clientes\n"
                    + "3 - Para Salir..."));

            if (opcion == 1) {


                nombre = JOptionPane.showInputDialog("Ingresar el Nombre del Cliente..");
                no_nit = Integer.parseInt(JOptionPane.showInputDialog("Ingressar el Numero de NIT del Cliente.."));
                direccion = JOptionPane.showInputDialog("Ingrese la Direccion del Cliente");
                ingMens = Double.parseDouble(JOptionPane.showInputDialog("Ingresa las Ganancias Mensuales.."));

                CreateWrite_(nombre, no_nit, direccion, ingMens);

            }
            if (opcion == 2) {

                Read_();
            }
        } while (opcion != 3);
    }

    public static void Read_() {
        boolean endOfFile = false;
        String nombre = "";
        int no_nit = 0;
        String direccion = "";
        double ingMens = 0.00;

        try {
            FileInputStream archR = new FileInputStream("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java\\PrurebaBin2.dat");
            DataInputStream arcEntrada = new DataInputStream(archR);

            StringBuilder datosClientes = new StringBuilder();

            while (!endOfFile) {

                try {

                    nombre = arcEntrada.readUTF();
                    no_nit = arcEntrada.readInt();
                    direccion = arcEntrada.readUTF();
                    ingMens = arcEntrada.readDouble();

                    datosClientes.append("NOMBRE: => ")
                            .append(nombre)
                            .append("   -   ")
                            .append("NUMERO DE NIT: => " + no_nit)
                            .append("   -   ")
                            .append("DIRECCION: => " + direccion)
                            .append("   -   ")
                            .append("INGRESOS MENSUALES: => " + ingMens + "\n");


                } catch (IOException e) {
                    endOfFile = true;
                }
            }
            JOptionPane.showMessageDialog(null, datosClientes.toString());
            arcEntrada.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, " ERROR AL LEER EL ARCCHIVO SELECCIONADO");
            e.printStackTrace();
            e.getStackTrace();
        }
    }

    public static void CreateWrite_(String nombre, int no_nit, String direccion, double ingMensual) {
        try {
            FileOutputStream cArch = new FileOutputStream("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java\\PrurebaBin2.dat", true);
            DataOutputStream arcSalida = new DataOutputStream(cArch);

            arcSalida.writeUTF(nombre);
            arcSalida.writeInt(no_nit);
            arcSalida.writeUTF(direccion);
            arcSalida.writeDouble(ingMensual);
            arcSalida.close();

            JOptionPane.showMessageDialog(null, "LOS DATOS SE HAN GUARDADO EXITOSAMENTE...");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR LOS DATOS");
            e.getMessage();
        }
    }
}
