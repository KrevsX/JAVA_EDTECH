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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JI9_ArrayList {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("d");
        lst.add("e");

        imprimirLista(lst);
    }

    public static void imprimirLista(List<String> ndata) {
        for (Iterator<String> lstIter = ndata.iterator(); lstIter.hasNext(); ) {
            System.out.println("Nombres....: " + lstIter.next());
        }
        // Esta otra funcion FOREACH esta mas simplificada..

        /*
        for (String ndatum : ndata) {
            System.out.println("Nombres....: " + ndatum);
        }

        */
    }
}
