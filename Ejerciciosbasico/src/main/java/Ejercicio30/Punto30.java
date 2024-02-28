/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio30;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el tipo de uva (A o B) y el tamaño (1 o 2)
        System.out.println("Ingrese el tipo de uva (A o B):");
        char tipo = scanner.next().charAt(0);

        System.out.println("Ingrese el tamaño de uva (1 o 2):");
        int tamaño = scanner.nextInt();

        // Establecer el precio inicial por kilo de uva según el tipo y tamaño
        double precioInicial;
        if (tipo == 'A') {
            precioInicial = (tamaño == 1) ? 0.80 : 0.90; // Tipo A, tamaño 1: 0.80€, tamaño 2: 0.90€
        } else if (tipo == 'B') {
            precioInicial = (tamaño == 1) ? 0.70 : 0.80; // Tipo B, tamaño 1: 0.70€, tamaño 2: 0.80€
        } else {
            System.out.println("Tipo de uva no válido.");
            return;
        }

        // Aplicar ajustes al precio inicial según el tipo y tamaño de la uva
        if (tipo == 'A') {
            precioInicial += (tamaño == 1) ? 0.20 : 0.30; // Ajuste para tipo A
        } else if (tipo == 'B') {
            precioInicial -= (tamaño == 1) ? 0.30 : 0.50; // Ajuste para tipo B
        }

        // Calcular el precio final por kilo de uva
        double precioFinal = precioInicial;

        // Mostrar el precio final por kilo de uva
        System.out.println("El precio final por kilo de uva es: " + precioFinal + " euros.");
    }
}

