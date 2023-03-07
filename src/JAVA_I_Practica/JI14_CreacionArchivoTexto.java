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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class JI14_CreacionArchivoTexto {
    public static void main(String[] args) {
        JI14_CreacionArchivoTexto createArchivo = new JI14_CreacionArchivoTexto();
        String opcion = "A";
        String carnet = "";
        String nombre = "";
        String departamento = "";
        String continuar = "";

        while (opcion.equals("A")) {
            opcion = JOptionPane.showInputDialog("Opcion A = Agregar  / Opcion C = Consultar").toUpperCase();

            if (opcion.equals("A")) {
                carnet = JOptionPane.showInputDialog("Digite Carnet del empleado...").toUpperCase();
                nombre = JOptionPane.showInputDialog("Digite Nombre del Empleado...").toUpperCase();
                departamento = JOptionPane.showInputDialog("Digite departamento del Empleado...").toUpperCase();
                continuar = JOptionPane.showInputDialog("Continuar Si = S  / No = N").toUpperCase();
                createArchivo.crearArchivo(carnet + "||" + nombre + "||" + departamento);
            }
            if (opcion.equals("C")) {
                createArchivo.leerArchivo();
            }
            if (continuar.equals("N")) {
                break;
            }
        }
    }

    public void crearArchivo(String texto) {
        try {
            /**@File El objeto File se encar de crear o abrir acceso a un archivo
             * que se especifica en su constructor
             * @FileWriter Escribira en el archivo en este caso es uno con formato
             * .TXT
             * con el metodo .WRITE Escribiremos en el archivo .txt ccreado..
             *
             * .CLOSE para cerrar la coneccion creada....
             * */
            File archivo = new File("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java\\ArchivoTexto.txt");

            FileWriter escrobir = new FileWriter(archivo, true);
            escrobir.write(texto + "\r\n");

            escrobir.close();

        } catch (Exception e) {
            System.out.println("Error Al Escribir.........");
        }
    }

    public void leerArchivo() {
        String texto = "";

        try {
            FileReader lector = new FileReader("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java\\ArchivoTexto.txt");

            BufferedReader contenido = new BufferedReader(lector);

            String datosEmpleados = "";

            while ((texto = contenido.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(texto, "||");
                int i = 1;
                String carnet = "";
                String nombre = "";
                String departamento = "";

                while (tokens.hasMoreElements()) {
                    if (i == 1) {
                        carnet = tokens.nextToken();
                        i++;
                    }
                    if (i == 2) {
                        nombre = tokens.nextToken();
                        i++;
                    }
                    if (i == 3) {
                        departamento = tokens.nextToken();
                        i++;
                    }
                }
                datosEmpleados += "Carnet: " + carnet + "  Nombre: " + nombre + "  Departamente: " + departamento + "\n";
            }
            JOptionPane.showMessageDialog(null, datosEmpleados);
        } catch (Exception e) {

        }

    }

}
