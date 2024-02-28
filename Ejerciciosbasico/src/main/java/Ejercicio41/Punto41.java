/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio41;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limiteInferior, limiteSuperior;
        // Pedir al usuario que ingrese los límites del intervalo
        do {
            System.out.println("Ingrese el límite inferior del intervalo:");
            limiteInferior = scanner.nextInt();

            System.out.println("Ingrese el límite superior del intervalo:");
            limiteSuperior = scanner.nextInt();

            if (limiteInferior >= limiteSuperior) {
                System.out.println("El límite inferior debe ser menor que el límite superior. Inténtelo de nuevo.");
            }
        } while (limiteInferior >= limiteSuperior);

        // Contadores
        int sumaDentroIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean hayLimiteEnIntervalo = false;

        // Pedir al usuario que ingrese números hasta que ingrese 0
        System.out.println("Ingrese números (0 para finalizar):");
        int numero;
        do {
            numero = scanner.nextInt();

            if (numero != 0) {
                // Verificar si el número está dentro del intervalo
                if (numero > limiteInferior && numero < limiteSuperior) {
                    sumaDentroIntervalo += numero;
                } else {
                    numerosFueraIntervalo++;
                }

                // Verificar si el número es igual a algún límite del intervalo
                if (numero == limiteInferior || numero == limiteSuperior) {
                    hayLimiteEnIntervalo = true;
                }
            }
        } while (numero != 0);

        // Mostrar información
        System.out.println("La suma de los números dentro del intervalo es: " + sumaDentroIntervalo);
        System.out.println("Cantidad de números fuera del intervalo: " + numerosFueraIntervalo);
        if (hayLimiteEnIntervalo) {
            System.out.println("Se ha introducido al menos un número igual a uno de los límites del intervalo.");
        } else {
            System.out.println("No se ha introducido ningún número igual a uno de los límites del intervalo.");
        }
    }
}
