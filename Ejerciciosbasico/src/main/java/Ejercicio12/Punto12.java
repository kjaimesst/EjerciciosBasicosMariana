/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto12 {
public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las coordenadas del primer punto (x1, y1)
        System.out.println("Ingresa las coordenadas del primer punto (x1, y1):");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        // Pedir al usuario que ingrese las coordenadas del segundo punto (x2, y2)
        System.out.println("Ingresa las coordenadas del segundo punto (x2, y2):");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia entre los dos puntos usando la fórmula de distancia euclidiana
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Mostrar el resultado al usuario
        System.out.println("La distancia entre los dos puntos es: " + distancia);

        // Cerrar el Scanner
        scanner.close();
    }
}


