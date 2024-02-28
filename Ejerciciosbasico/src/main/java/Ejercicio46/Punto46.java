/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio46;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de filas de la pirámide
        System.out.println("Ingrese el número de filas de la pirámide:");
        int n = scanner.nextInt();

        // Imprimir la pirámide de números
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios en blanco para alinear los números
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los números ascendentes en cada fila
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Imprimir los números descendentes en cada fila, excluyendo el último número
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            // Ir a la siguiente fila
            System.out.println();
        }
    }
}

