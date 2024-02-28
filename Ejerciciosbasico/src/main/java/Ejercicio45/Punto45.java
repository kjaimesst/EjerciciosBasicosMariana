/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio45;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de números primos que desea mostrar
        System.out.println("Ingrese la cantidad de números primos que desea mostrar:");
        int cantidadPrimos = scanner.nextInt();

        int contador = 0; // Contador de números primos encontrados
        int numeroActual = 2; // Empezamos desde el primer número primo

        System.out.println("Los primeros " + cantidadPrimos + " números primos son:");
        // Mientras no hayamos encontrado la cantidad de números primos solicitados
        while (contador < cantidadPrimos) {
            if (esPrimo(numeroActual)) {
                System.out.print(numeroActual + " ");
                contador++;
            }
            numeroActual++;
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}


