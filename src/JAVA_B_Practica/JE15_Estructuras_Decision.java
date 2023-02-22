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

package JAVA_B_Practica;

import javax.swing.*;

public class JE15_Estructuras_Decision {
    //Estructuras de Decision...

    public static void main(String[] args) {


        InstruccionIfSencilla();

        InstruccionIfElse();

        InstruccionIfElseAnidada();

        InstruccionSwitchChar();

        InstruccionSwitchInt();

        InstruccionIfString();
    }

    public static void InstruccionIfSencilla() {
        String Valor = JOptionPane.showInputDialog("Digitar numero del empleado: ");
        IfSencillo(Double.parseDouble(Valor));
    }

    public static void IfSencillo(double salario) {
        if (salario > 210) {

            JOptionPane.showMessageDialog(null, "El Empleado Gana mas del minimo....");
        }

    }

    public static void InstruccionIfElse() {
        String Valor = JOptionPane.showInputDialog("Digitar numero del empleado: ");
        IfElse(Double.parseDouble(Valor));
    }

    public static void IfElse(double salario) {
        if (salario > 210) {

            JOptionPane.showMessageDialog(null, "El Empleado Gana mas del minimo....");
        } else {
            JOptionPane.showMessageDialog(null, "EL Empleado gana menos del Salario minimo....");
        }

    }

    public static void InstruccionIfElseAnidada() {
        String Valor = JOptionPane.showInputDialog("Digitar numero del empleado: ");
        IfElseAnidado(Double.parseDouble(Valor));
    }

    public static void IfElseAnidado(double salario) {
        if (salario > 210) {

            JOptionPane.showMessageDialog(null, "El Empleado Gana mas del minimo....");
        } else if (salario > 0) {
            JOptionPane.showMessageDialog(null, "EL Empleado gana menos del Salario minimo....");
        } else {
            JOptionPane.showMessageDialog(null, "EL DATO INGRESADO NO ES VALIDO....");
        }

    }

    public static void InstruccionSwitchChar() {
        String Valor = JOptionPane.showInputDialog("Digite su estado Civil: ");
        SwitchChar(Valor.toUpperCase().charAt(0));
    }

    public static void SwitchChar(char estadoCivil) {
        switch (estadoCivil) {
            case 'S':
                JOptionPane.showMessageDialog(null, "Es Soltero");
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "Es Casado");
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "Es Divorciado");
                break;
            case 'A':
                JOptionPane.showMessageDialog(null, "Es Acompanado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "EL ESTADO CIVIL ES INVALIDO!!...");

        }


    }

    public static void InstruccionSwitchInt() {
        String Valor = JOptionPane.showInputDialog("INGRESE EL DIA DE LA SEMANA DEL 1- 7 : ");
        SwitchInt(Integer.parseInt(Valor));
    }

    public static void SwitchInt(int diaSemana) {
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Es LUNES");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Es MARTES");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es MIERCOLES");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es JUEVES");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es VIERNES");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Es SABADO");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Es DOMINGO");
                break;
            default:
                JOptionPane.showMessageDialog(null, "EL DIA INGRSADO ES INVALIDO!!...");

        }


    }

    public static void InstruccionIfString() {
        String valorString = JOptionPane.showInputDialog("Digite el sexo M=Masculino, F=Femenino: ");
        IfString(valorString.toUpperCase());
    }

    private static void IfString(String sexo) {
        if (sexo.equals("M")) {
            JOptionPane.showMessageDialog(null, "SEXO MASCULINO...");

        } else if (sexo.equals("F")) {
            JOptionPane.showMessageDialog(null, "SEXO FEMENINO...");

        } else {
            JOptionPane.showMessageDialog(null, "SEXO NO VALIDO...");
        }
    }
}
