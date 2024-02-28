/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio26;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto26 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la edad, la nota y el sexo
        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la nota:");
        double nota = scanner.nextDouble();

        System.out.println("Ingrese el sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        // Verificar la aceptación de la solicitud
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("La solicitud es POSIBLE.");
            } else if (sexo == 'F') {
                System.out.println("La solicitud es ACEPTADA.");
            } else {
                System.out.println("La solicitud NO ES ACEPTADA.");
            }
        } else {
            System.out.println("La solicitud NO ES ACEPTADA.");
        }
    }
}