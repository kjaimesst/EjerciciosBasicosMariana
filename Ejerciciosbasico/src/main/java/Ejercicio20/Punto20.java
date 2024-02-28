/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio20;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto20 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de cada tipo de moneda
        System.out.println("Ingrese la cantidad de monedas de 2 euros:");
        int monedas2Euros = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 1 euro:");
        int monedas1Euro = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 50 céntimos:");
        int monedas50Centimos = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 20 céntimos:");
        int monedas20Centimos = scanner.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 10 céntimos:");
        int monedas10Centimos = scanner.nextInt();

        // Calcular el total de dinero
        int totalEuros = monedas2Euros * 2 + monedas1Euro * 1;
        int totalCentimos = monedas50Centimos * 50 + monedas20Centimos * 20 + monedas10Centimos * 10;

        // Convertir céntimos a euros si es necesario
        int eurosExtra = totalCentimos / 100;
        totalEuros += eurosExtra;
        totalCentimos %= 100;

        // Mostrar el total de dinero
        System.out.println("Tienes un total de " + totalEuros + " euros y " + totalCentimos + " céntimos.");
    }
}
