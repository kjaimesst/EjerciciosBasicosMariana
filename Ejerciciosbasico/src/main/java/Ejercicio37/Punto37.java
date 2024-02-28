/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio37;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 10;
        int intentoActual = 0;
        int numeroUsuario;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes 10 intentos para adivinar el número del 1 al 100.");

        while (intentoActual < intentos) {
            System.out.println("Intento #" + (intentoActual + 1));
            System.out.println("Ingresa un número:");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + (intentoActual + 1) + " intentos!");
                return;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }

            intentoActual++;
        }

        System.out.println("¡Lo siento! Has agotado tus 10 intentos.");
        System.out.println("El número a adivinar era: " + numeroAleatorio);
    }
}

