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

package JAVA_EjerciciosPracticos.ClasesExternas;

import java.util.Scanner;

public class UiMenu {

    public static String[] MONTHS = {
            "Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"
    };

    public static void showMenu() {
        System.out.println("Bievenido...");
        System.out.println("Selecciona una Opcion...");

        int response;
        do {

            System.out.println("1. Doctor..");
            System.out.println("2. Paticiente..");
            System.out.println("0. Salir..");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1 -> System.out.println("Doctor..");
                case 2 -> showPaticiente();
                case 0 -> System.out.println("Gracias por Visitarnos...");
                default -> System.out.println("Seleccione una Opcion Validad....");
            }
        } while (response != 0);
    }

    public static void showPaticiente() {
        int response;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente..");
            System.out.println("1. Agendar Cita...");
            System.out.println("2. Mis Citas...");
            System.out.println("0. Regresar al menu anterior..");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":: Agrenda un Cita ::");
                    for (int i = 1; i <= 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);

                    }
                    break;
                case 2:
                    System.out.println(":: Mis Citas ::");
                    break;
                case 0:
                    showMenu();
                    break;
            }

        } while (response != 0);
    }
}
