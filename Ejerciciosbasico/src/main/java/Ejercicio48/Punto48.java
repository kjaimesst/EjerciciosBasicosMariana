/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio48;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los números
        int[] numeros = new int[10];

        // Pedir al usuario que ingrese los números
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Encontrar el máximo y el mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar los números junto con "máximo" y "mínimo"
        System.out.println("Números introducidos junto con 'máximo' y 'mínimo':");

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == maximo) {
                System.out.println(numeros[i] + " máximo");
            } else if (numeros[i] == minimo) {
                System.out.println(numeros[i] + " mínimo");
            } else {
                System.out.println(numeros[i]);
            }
        }
    }
}


