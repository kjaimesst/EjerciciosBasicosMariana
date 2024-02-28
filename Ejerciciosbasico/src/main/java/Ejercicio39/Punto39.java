/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio39;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese caracteres
        System.out.println("Ingrese caracteres (presione espacio para salir):");
        while (true) {
            // Leer el próximo carácter ingresado por el usuario
            char caracter = scanner.next().charAt(0);

            // Verificar si el carácter es un espacio para salir del bucle
            if (caracter == ' ') {
                break;
            }

            // Verificar si el carácter es una vocal
            if (esVocal(caracter)) {
                System.out.println(caracter + " es una VOCAL");
            } else {
                System.out.println(caracter + " NO es una VOCAL");
            }
        }
    }

    // Método para verificar si un carácter es una vocal
    public static boolean esVocal(char c) {
        // Convertir el carácter a minúscula para facilitar la comparación
        c = Character.toLowerCase(c);
        // Verificar si el carácter es una vocal
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

