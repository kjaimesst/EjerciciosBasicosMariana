/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio42;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base y el exponente
        System.out.println("Ingrese la base (número real):");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el exponente (número entero positivo):");
        int exponente = scanner.nextInt();

        // Verificar si el exponente es positivo
        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
            return;
        }

        // Calcular la potencia utilizando un bucle
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        // Mostrar el resultado de la potencia
        System.out.println("El resultado de " + base + " elevado a la potencia " + exponente + " es: " + resultado);
    }
}

