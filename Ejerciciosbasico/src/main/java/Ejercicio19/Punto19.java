/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio19;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de respuestas correctas, incorrectas y no contestadas
        System.out.println("Ingrese el número de respuestas correctas:");
        int respuestasCorrectas = scanner.nextInt();

        System.out.println("Ingrese el número de respuestas incorrectas:");
        int respuestasIncorrectas = scanner.nextInt();

        System.out.println("Ingrese el número de respuestas no contestadas:");
        int respuestasNoContestadas = scanner.nextInt();

        // Calcular la nota final
        int notaFinal = respuestasCorrectas * 5 - respuestasIncorrectas;

        // Mostrar la nota final
        System.out.println("La nota final del estudiante es: " + notaFinal);
    }
}
