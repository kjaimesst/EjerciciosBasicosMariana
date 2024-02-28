/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio25;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base y el exponente
        System.out.println("Ingrese la base:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese el exponente:");
        int exponente = scanner.nextInt();

        // Calcular la potencia
        double resultado;

        if (exponente > 0) {
            resultado = calcularPotenciaPositiva(base, exponente);
        } else if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = calcularPotenciaNegativa(base, -exponente);
        }

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
    }

    // Método para calcular la potencia con exponente positivo
    public static double calcularPotenciaPositiva(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // Método para calcular la potencia con exponente negativo
    public static double calcularPotenciaNegativa(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return 1 / resultado;
    }
}



