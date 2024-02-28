/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto11 {
public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los dos números
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la distancia entre los dos números (diferencia absoluta)
        double distancia = Math.abs(numero1 - numero2);

        // Mostrar el resultado al usuario
        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);

        // Cerrar el Scanner
        scanner.close();
    }
}
