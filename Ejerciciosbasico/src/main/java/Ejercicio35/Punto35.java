/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio35;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entre 1 y 12
        System.out.println("Ingrese un número entre 1 y 12:");
        int numeroMes = scanner.nextInt();

        // Determinar el número de días del mes correspondiente
        int diasMes;
        switch (numeroMes) {
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                diasMes = 31;
                break;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                diasMes = 30;
                break;
            case 2:  // Febrero
                diasMes = 28; // Consideramos que no es un año bisiesto
                break;
            default:
                diasMes = -1; // Indicador de número inválido de mes
                break;
        }

        // Mostrar el número de días del mes correspondiente o un mensaje de error
        if (diasMes != -1) {
            System.out.println("El mes " + numeroMes + " tiene " + diasMes + " días.");
        } else {
            System.out.println("Número de mes inválido.");
        }
    }
}
 

