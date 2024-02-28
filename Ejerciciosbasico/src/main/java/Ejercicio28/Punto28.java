/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio28;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto28 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el sueldo base y el monto de cada venta
        System.out.println("Ingrese el sueldo base del vendedor:");
        double sueldoBase = scanner.nextDouble();

        System.out.println("Ingrese el monto de la primera venta:");
        double venta1 = scanner.nextDouble();

        System.out.println("Ingrese el monto de la segunda venta:");
        double venta2 = scanner.nextDouble();

        System.out.println("Ingrese el monto de la tercera venta:");
        double venta3 = scanner.nextDouble();

        // Calcular la comisión por cada venta y la comisión total
        double comision1 = venta1 * 0.10;
        double comision2 = venta2 * 0.10;
        double comision3 = venta3 * 0.10;
        double comisionTotal = comision1 + comision2 + comision3;

        // Calcular el total recibido en el mes
        double totalMes = sueldoBase + comisionTotal;

        // Mostrar los resultados
        System.out.println("La comisión por la primera venta es: " + comision1);
        System.out.println("La comisión por la segunda venta es: " + comision2);
        System.out.println("La comisión por la tercera venta es: " + comision3);
        System.out.println("El total que recibirá en comisiones en el mes es: " + comisionTotal);
        System.out.println("El total que recibirá en el mes (incluyendo sueldo base y comisiones) es: " + totalMes);
    }
}


