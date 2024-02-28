/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio43;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el monto inicial y la tasa de crecimiento mensual
        System.out.println("Ingrese el monto inicial a pagar el primer mes:");
        double montoInicial = scanner.nextDouble();

        System.out.println("Ingrese la tasa de crecimiento mensual (en porcentaje):");
        double tasaCrecimiento = scanner.nextDouble();

        // Verificar si la tasa de crecimiento es válida (debe ser mayor que 0 y menor o igual que 100)
        if (tasaCrecimiento <= 0 || tasaCrecimiento > 100) {
            System.out.println("La tasa de crecimiento debe ser un número mayor que 0 y menor o igual que 100.");
            return;
        }

        // Calcular el monto a pagar cada mes y el total pagado después de 20 meses
        double montoMensual = montoInicial;
        double totalPagado = 0;
        for (int i = 1; i <= 20; i++) {
            totalPagado += montoMensual;
            System.out.println("Mes " + i + ": " + montoMensual + " €");
            montoMensual *= (1 + tasaCrecimiento / 100);
        }

        // Mostrar el total pagado después de los 20 meses
        System.out.println("Total pagado después de los 20 meses: " + totalPagado + " €");
    }
}


