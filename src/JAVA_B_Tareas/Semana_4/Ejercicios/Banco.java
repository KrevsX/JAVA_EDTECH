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

package JAVA_B_Tareas.Semana_4.Ejercicios;

public class Banco {
    String nombCliente;
    double montoInv;
    double intnual;
    int plazoInv;

    public Banco(String nombCliente, double montoInv, double intnual, int plazoInv) {
        this.nombCliente = nombCliente;
        this.montoInv = montoInv;
        this.intnual = intnual;
        this.plazoInv = plazoInv;
    }

    public double calculoGanancia() {
        double intMensual = intnual / 12;
        return montoInv * (intMensual * plazoInv);
    }

    public double ResultadoFinal(double montoInv) {
        return montoInv + calculoGanancia();
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombCliente='" + nombCliente + '\'' +
                ", montoInv=" + montoInv +
                ", intnual=" + intnual +
                ", plazoInv=" + plazoInv +
                '}';
    }

    public String Info() {
        String info = "";
        info += "   Nombre Cliente: " + nombCliente + "\n";
        info += "Monto Invertido: " + montoInv + " $" + "\n";
        info += "      Interes Anual: " + intnual * 100 + " %" + "\n";
        info += "                 Plazo a: " + plazoInv + " Meses" + "\n";
        info += """
                ______________________________________

                """;
        info += " Ganancia Obtenida:  " + calculoGanancia() + " $" + " +" + "\n";
        info += "    Monto Invertido: " + montoInv + " $" + "\n";
        info += "______________________________________" + "\n";
        info += "        Total a Recibir: " + ResultadoFinal(montoInv) + " $" + "\n";
/*
        double ganancia = calculoGanancia();
        System.out.println("   Nombre Cliente : " + nombCliente);
        System.out.println("   Monto Invertido: " + montoInv);
        System.out.println("   Interes Anual  : " + intnual);
        System.out.println("         Plazo a  : " + plazoInv + " Meses");
        System.out.println("--------------------------------");
        System.out.println("Ganancia a Obtener: " + ganancia);
*/

        return info.toUpperCase();

    }
}
