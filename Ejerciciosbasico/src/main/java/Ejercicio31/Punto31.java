/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio31;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número de alumnos
        System.out.println("Ingrese el número de alumnos:");
        int numeroAlumnos = scanner.nextInt();

        // Determinar el costo por alumno y el pago a la compañía de autobuses
        double costoPorAlumno;
        double pagoCompañiaAutobuses;

        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65;
        } else if (numeroAlumnos >= 50) {
            costoPorAlumno = 70;
        } else if (numeroAlumnos >= 30) {
            costoPorAlumno = 95;
        } else {
            costoPorAlumno = 4000.0 / numeroAlumnos;
        }

        // Calcular el costo total para la compañía de autobuses
        pagoCompañiaAutobuses = costoPorAlumno * numeroAlumnos;

        // Mostrar el costo por alumno y el pago a la compañía de autobuses
        System.out.println("El costo por alumno es de: " + costoPorAlumno + " euros.");
        System.out.println("El pago a la compañía de autobuses es de: " + pagoCompañiaAutobuses + " euros.");
    }
}

