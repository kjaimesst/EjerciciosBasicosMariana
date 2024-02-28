/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio49;
import java.util.Random;


/**
 *
 * @author mac
 */
public class Punto49 {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Crear un array bidimensional de 4 filas por 5 columnas
        int[][] numeros = new int[4][5];

        // Generar números aleatorios y almacenarlos en el array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = random.nextInt(900) + 100; // Números aleatorios entre 100 y 999
            }
        }

        // Calcular las sumas parciales de filas y columnas
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += numeros[i][j];
                sumaColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        // Mostrar los números y las sumas parciales
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("| " + sumaFilas[i]);
        }

        for (int j = 0; j < 5; j++) {
            System.out.print("----\t");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print(sumaColumnas[j] + "\t");
        }
        System.out.println("| " + sumaTotal);
    }
}
