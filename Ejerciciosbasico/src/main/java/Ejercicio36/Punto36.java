/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio36;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el peso del paquete en kg
        System.out.println("Ingrese el peso del paquete en kilogramos:");
        double pesoPaquete = scanner.nextDouble();

        // Pedir al usuario que ingrese la zona de destino
        System.out.println("Ingrese la zona de destino:");
        System.out.println("1 - América del Norte");
        System.out.println("2 - América Central");
        System.out.println("3 - América del Sur");
        System.out.println("4 - Europa");
        System.out.println("5 - Asia");
        int zonaDestino = scanner.nextInt();

        // Verificar si el peso del paquete excede los 5 kg
        if (pesoPaquete > 5) {
            System.out.println("El paquete no puede ser transportado debido a que excede los 5 kg.");
        } else {
            // Calcular el costo de la entrega según la zona de destino
            double costoEnvio;
            switch (zonaDestino) {
                case 1:
                    costoEnvio = pesoPaquete * 24.00;
                    break;
                case 2:
                    costoEnvio = pesoPaquete * 20.00;
                    break;
                case 3:
                    costoEnvio = pesoPaquete * 21.00;
                    break;
                case 4:
                    costoEnvio = pesoPaquete * 10.00;
                    break;
                case 5:
                    costoEnvio = pesoPaquete * 18.00;
                    break;
                default:
                    System.out.println("Zona de destino inválida.");
                    return;
            }

            // Mostrar el costo de la entrega
            System.out.println("El costo de envío del paquete es: " + costoEnvio + " euros.");
        }
    }
}


