/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto14 {
 public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número de dos cifras
        System.out.print("Ingresa un número de dos cifras: ");
        int numero = scanner.nextInt();

        // Verificar que el número tenga dos cifras
        if (numero >= 10 && numero <= 99) {
            // Separar las cifras del número
            int cifra1 = numero / 10;
            int cifra2 = numero % 10;

            // Construir el número invertido intercambiando las cifras
            int numeroInvertido = cifra2 * 10 + cifra1;

            // Mostrar el número invertido por pantalla
            System.out.println("El número invertido es: " + numeroInvertido);
        } else {
            System.out.println("El número ingresado no tiene dos cifras.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
