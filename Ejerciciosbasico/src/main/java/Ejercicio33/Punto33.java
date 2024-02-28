/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio33;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el resultado del dado
        System.out.println("Ingrese el resultado obtenido al lanzar el dado:");
        int resultadoDado = scanner.nextInt();

        // Verificar si el resultado del dado es válido
        if (resultadoDado >= 1 && resultadoDado <= 6) {
            // Determinar la cara opuesta del dado
            String caraOpuesta = determinarCaraOpuesta(resultadoDado);
            System.out.println("La cara opuesta al resultado " + resultadoDado + " es: " + caraOpuesta);
        } else {
            System.out.println("ERROR: número incorrecto");
        }
    }

    // Método para determinar la cara opuesta del dado
    public static String determinarCaraOpuesta(int resultado) {
        String caraOpuesta = "";
        switch (resultado) {
            case 1:
                caraOpuesta = "6";
                break;
            case 2:
                caraOpuesta = "5";
                break;
            case 3:
                caraOpuesta = "4";
                break;
            case 4:
                caraOpuesta = "3";
                break;
            case 5:
                caraOpuesta = "2";
                break;
            case 6:
                caraOpuesta = "1";
                break;
        }
        return caraOpuesta;
    }
}


