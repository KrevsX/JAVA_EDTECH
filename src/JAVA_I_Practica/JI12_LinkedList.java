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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JI12_LinkedList {
    public static void main(String[] args) {

        List lstMatriculas = new LinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese Primera matricula");
        String nombre1 = sc.nextLine().toUpperCase();
        System.out.println("Ingrese Segunda Matricula");
        String nombre2 = sc.nextLine().toUpperCase();
        System.out.println("Ingrese Tercera Matricula");
        String nombre3 = sc.nextLine().toUpperCase();

        lstMatriculas.add(0, nombre1);
        lstMatriculas.add(1, nombre2);
        lstMatriculas.add(2, nombre3);

        imprimirLinkedList(lstMatriculas);
    }

    public static void imprimirLinkedList(List listaMat) {
        Iterator iter = listaMat.iterator();
        while (iter.hasNext()) {
            System.out.println("Matricula #: " + iter.next());
        }
    }
}
