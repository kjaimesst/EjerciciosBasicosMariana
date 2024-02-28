/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio34;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el día de la semana
        System.out.println("Ingrese el número del día de la semana (del 1 al 7):");
        int numeroDia = scanner.nextInt();

        // Determinar el nombre del día correspondiente
        String nombreDia;
        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "ERROR: número incorrecto";
                break;
        }

        // Mostrar el día correspondiente o el mensaje de error
        System.out.println("El día correspondiente al número " + numeroDia + " es: " + nombreDia);
    }
}


