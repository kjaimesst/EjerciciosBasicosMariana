/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio27;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto27 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario los datos de la primera circunferencia
        System.out.println("Ingrese las coordenadas del centro de la primera circunferencia (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese el radio de la primera circunferencia (r1):");
        double r1 = scanner.nextDouble();

       // Pedir al usuario los datos de la segunda circunferencia
        System.out.println("Ingrese las coordenadas del centro de la segunda circunferencia (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Ingrese el radio de la segunda circunferencia (r2):");
        double r2 = scanner.nextDouble();

        // Calcular la distancia entre los centros de las circunferencias
        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Clasificar las circunferencias según la distancia entre sus centros y los radios
        if (distanciaCentros > r1 + r2) {
            System.out.println("Las circunferencias son exteriores.");
        } else if (distanciaCentros == r1 + r2) {
            System.out.println("Las circunferencias son tangentes exteriores.");
        } else if (distanciaCentros < Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son interiores.");
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            System.out.println("Las circunferencias son tangentes interiores.");
        } else {
            System.out.println("Las circunferencias son secantes.");
        }
    }
}