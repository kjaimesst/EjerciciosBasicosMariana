/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio21;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto21 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        // Comparar los números
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}