/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio17;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Punto17 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora de salida (HH MM Ss): ");
        int HH = scanner.nextInt();
        int MM = scanner.nextInt();
        int Ss = scanner.nextInt();

        System.out.println("Ingrese el tiempo de viaje en segundos (T): ");
        int T = scanner.nextInt();

        // Convertir la hora de salida a segundos
        int TiempoSalidaSegundos = HH * 3600 + MM * 60 + Ss;

        // Calcular el tiempo de llegada en segundos
        int TiempoLlegadaSegundos = TiempoSalidaSegundos + T;

        // Convertir el tiempo de llegada en segundos a formato HH:MM:Ss
        int HoraLlegada = TiempoLlegadaSegundos / 3600;
        int MinutoLlegada = (TiempoLlegadaSegundos % 3600) / 60;
        int SegundoLlegada = (TiempoLlegadaSegundos % 3600) % 60;

        // Imprimir la hora de llegada a la ciudad B
        System.out.println("Hora de llegada a la ciudad B: " + HoraLlegada + ":" + MinutoLlegada + ":" + SegundoLlegada);

        scanner.close();
    }
}
