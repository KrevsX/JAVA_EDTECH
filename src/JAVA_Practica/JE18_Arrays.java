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

package JAVA_Practica;

public class JE18_Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String[] days = new String[7];

        String[][] cities = new String[4][2];


/*
        //EJMPLO DE ARRAYS DE  3 Y 4 DIMENCIONES..

        int[][][] numbers = new int[2][2][2];

        int[][][][] numbers4 = new int[2][2][2][2];
*/

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cup Cake";
        androidVersions[3] = "Donut";

        //para visualizar el tamano del array 
        for (String day : days) {
            System.out.println(day);
        }

        //mostrar los datos del array
        for (int i = 0; i <= 3; i++) {
            System.out.println("....." + androidVersions[i]);
        }

        //con ciclo foreach para mostrar el mismo resultado
        // Importante saber el tipo de dato a recorrer...
        //el Ejempl es en base a String
        for (String androidVersion : androidVersions) {
            System.out.println("////" + androidVersion);
        }

        //con ciclo for podemos representar lo mismo mostrado abajo ...
        //simplificando codigo...

/*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
*/

        System.out.println();
        System.out.println();

        cities[0][0] = "colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        //forech para evaluar arrays de 2 dimenciones
        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println("////" + name);

            }
        }


        //para evaluar el tamano de un array de 2 dimenciones...
        // i para las lineas
        // j para las columnas
        for (String[] city : cities) {
            for (String s : city) {
                System.out.println("....." + s);
            }
        }
        
/*
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
*/

        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey/....";

        //imprimir todos los datos del array de 4 dimenciones
        // con foreach
        for (String[][][] animal : animals) {
            for (String[][] chara : animal) {
                for (String[] chara2 : chara) {
                    for (String valor : chara2) {
                        System.out.println("//////////" + valor);
                    }
                }
            }
        }

        //localizar con un bucle for
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println("..." + animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
