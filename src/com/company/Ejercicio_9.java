package com.company;

import java.util.Scanner;

/*
Calculadora de los litros de combustible que hemos de ponerle a un vehículo dados los kilómetros del viaje y el
consumo del vehículo. Pediremos ambos datos por pantalla. Devolverá los litros que hacen falta y añadirá información
del coste en euros calculada si el litro de combustible está a 1,099€.
*/

public class Ejercicio_9 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        double coste_euros_litro = 1.099;
        double distancia, consumo_100km, litros_viaje, coste_euros_viaje;

        // CÓDIGO:
        System.out.println();
        System.out.println("Cuántos kilómetros tiene el viaje?");
        distancia = sc.nextDouble();
        System.out.println("Cuánto consume el coche por cada 100 km?");
        consumo_100km = sc.nextDouble();

        litros_viaje = (distancia * consumo_100km) / 100;
        coste_euros_viaje = litros_viaje * coste_euros_litro;

        System.out.println("Necesitas: " + litros_viaje + " litros para realizar este viaje.");
        System.out.printf("Esto supone %5.2f€ de gasto en combustible.", + coste_euros_viaje);

        sc.close();
    }
}