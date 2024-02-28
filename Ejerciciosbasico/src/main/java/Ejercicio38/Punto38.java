/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio38;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números a introducir
        System.out.println("Ingrese la cantidad de números que desea introducir:");
        int cantidadNumeros = scanner.nextInt();

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        // Pedir al usuario que ingrese los números y contar su categoría
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números mayores que 0: " + mayoresCero);
        System.out.println("Cantidad de números menores que 0: " + menoresCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesCero);
    }
}

