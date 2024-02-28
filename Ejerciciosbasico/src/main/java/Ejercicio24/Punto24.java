/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio24;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto24 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cadena
        System.out.println("Ingrese una letra:");
        String cadena = scanner.nextLine();

        // Verificar si la cadena tiene longitud 1 y es una letra mayúscula
        if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
            System.out.println("La cadena ingresada es una letra mayúscula.");
        } else {
            System.out.println("La cadena ingresada no es una letra mayúscula o tiene más de un carácter.");
        }
    }
}
