/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio32;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la duración de la llamada en minutos
        System.out.println("Ingrese la duración de la llamada en minutos:");
        int duracionLlamada = scanner.nextInt();

        // Pedir al usuario que ingrese el día de la semana (1 para domingo, 2 para lunes, ..., 7 para sábado)
        System.out.println("Ingrese el día de la semana (1 para domingo, 2 para lunes, ..., 7 para sábado):");
        int diaSemana = scanner.nextInt();

        // Pedir al usuario que ingrese el turno de la llamada (1 para mañana, 2 para tarde)
        System.out.println("Ingrese el turno de la llamada (1 para mañana, 2 para tarde):");
        int turnoLlamada = scanner.nextInt();

        // Calcular el costo de la llamada sin impuestos
        double costoLlamada = calcularCostoLlamada(duracionLlamada);

        // Calcular el impuesto según el día de la semana y el turno
        double impuesto = calcularImpuesto(diaSemana, turnoLlamada, costoLlamada);

        // Calcular el costo total de la llamada incluyendo impuestos
        double costoTotal = costoLlamada + impuesto;

        // Mostrar el costo de la llamada, el impuesto y el costo total
        System.out.println("El costo de la llamada es: " + costoLlamada + " euros.");
        System.out.println("El impuesto aplicado es: " + impuesto + " euros.");
        System.out.println("El costo total de la llamada es: " + costoTotal + " euros.");
    }

    // Método para calcular el costo de la llamada sin impuestos
    public static double calcularCostoLlamada(int duracionLlamada) {
        double costo;

        if (duracionLlamada <= 5) {
            costo = 1.0;
        } else if (duracionLlamada <= 8) {
            costo = 1.0 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costo = 1.0 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            costo = 1.0 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }

        return costo;
    }

    // Método para calcular el impuesto según el día de la semana y el turno
    public static double calcularImpuesto(int diaSemana, int turnoLlamada, double costoLlamada) {
        double impuesto = 0.0;

        if (diaSemana == 1) { // Si es domingo
            impuesto = costoLlamada * 0.03;
        } else if (turnoLlamada == 1) { // Si es en la mañana
            impuesto = costoLlamada * 0.15;
        } else { // Si es en la tarde
            impuesto = costoLlamada * 0.10;
        }

        return impuesto;
    }
}
  

