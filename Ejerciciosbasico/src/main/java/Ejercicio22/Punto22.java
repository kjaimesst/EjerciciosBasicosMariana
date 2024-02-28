/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio22;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto22 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}
