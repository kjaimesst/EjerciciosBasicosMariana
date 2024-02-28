/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio47;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los números
        int[] numeros = new int[10];

        // Pedir al usuario que ingrese los números
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en orden inverso
        System.out.println("Los números en orden inverso son:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

    

