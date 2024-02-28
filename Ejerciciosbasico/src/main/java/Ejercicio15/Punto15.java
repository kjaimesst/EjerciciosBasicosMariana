/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto15 {
 public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los valores de las variables A y B
        System.out.print("Ingresa el valor de la variable A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingresa el valor de la variable B: ");
        double B = scanner.nextDouble();

        // Mostrar los valores originales de las variables A y B
        System.out.println("Valores originales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Intercambiar los valores de las variables A y B usando una variable temporal
        double temp = A;
        A = B;
        B = temp;

        // Mostrar los valores finales de las variables A y B después del intercambio
        System.out.println("\nValores después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Cerrar el Scanner
        scanner.close();
    }
}


