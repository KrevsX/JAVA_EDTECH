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

public class InfoPersonal {
    private final String noDui;
    private final String nombre;
    private final double salario;
    private final String telefono;

    public InfoPersonal(String dui, String nombre, double salario, String telefono) {
        this.noDui = dui;
        this.nombre = nombre;
        this.salario = salario;
        this.telefono = telefono;
    }

    public String getNoDui() {
        return noDui;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;

    }

    public String getTelefono() {
        return telefono;
    }

}
