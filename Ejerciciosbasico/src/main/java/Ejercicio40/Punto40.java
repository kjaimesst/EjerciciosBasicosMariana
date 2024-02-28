/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio40;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los dos números
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        // Verificar cuál es el número menor y mayor
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        // Imprimir todos los números pares entre el menor y el mayor
        System.out.println("Los números pares entre " + menor + " y " + mayor + " son:");
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }


}
