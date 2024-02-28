/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto10 {
public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las calificaciones parciales
        System.out.print("Ingresa la calificación del primer parcial: ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del segundo parcial: ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingresa la calificación del tercer parcial: ");
        double parcial3 = scanner.nextDouble();

        // Pedir al usuario que ingrese la calificación del examen final
        System.out.print("Ingresa la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        // Pedir al usuario que ingrese la calificación del trabajo final
        System.out.print("Ingresa la calificación del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        // Calcular el promedio de las calificaciones parciales
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;

        // Calcular la calificación final según los porcentajes dados
        double calificacionFinal = promedioParciales * 0.55 + examenFinal * 0.30 + trabajoFinal * 0.15;

        // Mostrar el resultado al usuario
        System.out.println("La calificación final en la materia de Algoritmos es: " + calificacionFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}

