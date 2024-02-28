/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio18;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto18 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre y los apellidos
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su primer apellido:");
        String apellido1 = scanner.nextLine();
        System.out.println("Ingrese su segundo apellido:");
        String apellido2 = scanner.nextLine();

        // Obtener las iniciales
        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

        // Mostrar las iniciales
        System.out.println("Las iniciales son: " + inicialNombre + "." + inicialApellido1 + "." + inicialApellido2 + ".");
    }
}
