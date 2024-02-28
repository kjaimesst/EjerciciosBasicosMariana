/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Saludar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        
        // Leer el nombre ingresado por el usuario
        String nombre = scanner.nextLine();
        
        // Saludar al usuario
        System.out.println("Hola, " + nombre + "! Bienvenido.");
        
        // Cerrar el Scanner
        scanner.close();
    }
}

