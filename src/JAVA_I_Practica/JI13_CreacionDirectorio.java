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

import java.io.File;

public class JI13_CreacionDirectorio {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\RAVENX\\Desktop\\Practice-OUT\\Practice-Java");
        if (folder.exists()) {
            System.out.println("La Carpeta Ya Exite......");
        } else {
            System.out.println("La Carpeta No Exite......\n" +
                    "Y ha sido creada con Exito.... ");
            folder.mkdirs();
        }
    }
}
