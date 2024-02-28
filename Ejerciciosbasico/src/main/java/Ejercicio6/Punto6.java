/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los tres números
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcular la media de los tres números
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado al usuario
        System.out.println("La media de los tres números es: " + media);

        // Cerrar el Scanner
        scanner.close();
    }
}
    

