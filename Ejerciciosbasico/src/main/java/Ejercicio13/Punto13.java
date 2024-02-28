/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto13 {
  public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Calcular la raíz cuadrada y cúbica del número
        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        // Mostrar el resultado al usuario
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        System.out.println("La raíz cúbica de " + numero + " es: " + raizCubica);

        // Cerrar el Scanner
        scanner.close();
    }
}
