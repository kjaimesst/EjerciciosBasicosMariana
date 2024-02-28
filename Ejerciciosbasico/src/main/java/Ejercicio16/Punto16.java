/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio16;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto16 {
 public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la distancia entre los vehículos (km)
        System.out.print("Ingresa la distancia entre los vehículos (km): ");
        double distancia = scanner.nextDouble();

        // Pedir al usuario que ingrese la velocidad del vehículo más lento (km/h)
        System.out.print("Ingresa la velocidad del vehículo más lento (km/h): ");
        double velocidadLenta = scanner.nextDouble();

        // Pedir al usuario que ingrese la velocidad del vehículo más rápido (km/h)
        System.out.print("Ingresa la velocidad del vehículo más rápido (km/h): ");
        double velocidadRapida = scanner.nextDouble();

        // Calcular la diferencia de velocidad entre los vehículos
        double diferenciaVelocidad = velocidadRapida - velocidadLenta;

        // Calcular el tiempo que tomará al vehículo más rápido alcanzar al vehículo más lento (en horas)
        double tiempoHoras = distancia / diferenciaVelocidad;

        // Convertir el tiempo de horas a minutos
        double tiempoMinutos = tiempoHoras * 60;

        // Mostrar el resultado al usuario
        System.out.println("El vehículo más rápido alcanzará al vehículo más lento en aproximadamente " + tiempoMinutos + " minutos.");

        // Cerrar el Scanner
        scanner.close();
    }
}



