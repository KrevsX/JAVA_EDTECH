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

package JAVA_I_Practica;

import javax.swing.*;
import java.io.*;

public class JI16_CreacionArchivoBinario {
    public static void main(String[] args) {
        JI16_CreacionArchivoBinario creacionArchivoBinario = new JI16_CreacionArchivoBinario();

        String opcion = "A";
        String nombre = "";
        int edad = 0;
        double salario = 0.00;

        String continuar = "S";

        while (opcion.equals("A")) {
            opcion = JOptionPane.showInputDialog("Opcion A = Agrergar // Consultar = C").toUpperCase();
            if (opcion.equals("A")) {
                nombre = JOptionPane.showInputDialog("Ingrese el Nombre del empleado: ").toUpperCase();
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ").toUpperCase());
                salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));

                creacionArchivoBinario.escribirArchivoBinario(nombre, edad, salario);

            }
            if (opcion.equals("C")) {
                creacionArchivoBinario.leerArchivoBinario();
            }
            if (continuar.equals("N")) {
                break;
            }
        }
    }

    private void escribirArchivoBinario(String nombre, int edad, double salario) {
        try {
            FileOutputStream fstream = new FileOutputStream("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java\\ArchivoBin.dat", true);
            DataOutputStream archivoSalida = new DataOutputStream(fstream);

            System.out.println("Escribiendo Archivo Binario......");

            archivoSalida.writeUTF(nombre);
            archivoSalida.writeInt(edad);
            archivoSalida.writeDouble(salario);
            archivoSalida.close();
            System.out.println("Se han Escrito datos en el Archivo Binario....");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo...");
            e.getMessage();
        }
    }

    private void leerArchivoBinario() {
        String nombre = "";
        int edad = 0;
        double salario = 0.00;
        boolean endOfFile = false;

        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java\\PrurebaBin2.dat");
            DataInputStream archivoEntrada = new DataInputStream(fstream);

            System.out.println("Lectura de  datos en el archivo binario/.....");
            String datosEmpleado = "";

            while (!endOfFile) {
                try {
                    nombre = archivoEntrada.readUTF();
                    edad = archivoEntrada.readInt();
                    salario = archivoEntrada.readDouble();

                    datosEmpleado += "Nombre: " + nombre + "eadad: " + edad + "salario: " + salario + "\n";
                } catch (IOException e) {
                    endOfFile = true;
                }
            }
            JOptionPane.showMessageDialog(null, datosEmpleado);
            archivoEntrada.close();
        } catch (IOException e) {
            System.out.println("Error al Leer el archivo...".toUpperCase());

            e.printStackTrace();
            e.getStackTrace();
        }
        System.out.println("SE HAN LEIDO LOS ARCHIVOS BINARIOS...");
    }
}
