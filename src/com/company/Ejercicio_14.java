package com.company;

import java.util.Scanner;

/*
Se quiere calcular el precio que un usuario debe pagar por un vuelo dependiendo de varias opciones:
- Si elige asiento se incrementa el precio del vuelo en 10 €.
- Si lleva equipaje se incrementa el precio del vuelo en 50 €.
- Si quiere comida durante el vuelo se incrementa el precio en 20 €.
- Si tiene menos de 14 años el precio del vuelo es la mitad y la facturación de maleta se cobra a 20 €
- Si es mayor de 60 años o tiene la tarjeta de viajero frecuente la comida es gratis.
El programa debe preguntar todas estas cosas al usuario, incluyendo el precio inicial del vuelo y calcular el
precio final. El usuario introducirá un 0 o un 1 dependiendo de la opción seleccionada.
*/

public class Ejercicio_14 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Double precio_vuelo;
        int edad;
        String asiento, equipaje, comida, tarjeta, repetir;

        // CÓDIGO:
        System.out.println("Bienvenido al cálculo de tu viaje:");
        do {
            System.out.println();
            System.out.println("¿Cuál es el precio del billete de vuelo?");
            precio_vuelo = sc.nextDouble();
            System.out.println("¿Desea escoger el asiento? (S/N)");
            asiento = sc2.nextLine();
            System.out.println("¿LLeva equipaje de mano? (S/N)");
            equipaje = sc2.nextLine();
            System.out.println("¿Desea comer un menú durante el viaje? (S/N)");
            comida = sc2.nextLine();
            System.out.println("¿Cuál es su edad?");
            edad = sc.nextInt();
            System.out.println("¿Dispones de la tarjeta 'viajero frecuente'? (S/N)");
            tarjeta = sc2.nextLine();
            // La conversión a minúscula la hacemos en el 'if' para ahorrar líneas de código.
            if (edad < 14) {
                precio_vuelo /= 2;
                if (equipaje.toLowerCase().equals("s")) {
                    precio_vuelo += 20;
                }
            }
            if (comida.toLowerCase().equals("s") && (edad < 60 || tarjeta.toLowerCase().equals("n"))) {
                precio_vuelo += 20;
            }
            if (asiento.toLowerCase().equals("s")) {
                precio_vuelo += 10;
            }
            if (equipaje.toLowerCase().equals("s")) {
                precio_vuelo += 50;
            }
            System.out.printf("El precio final de su viaje es de: %5.2f €", precio_vuelo);
            System.out.println();
            System.out.println("¿Quiere calcular otro viaje? (S/N)");
            repetir = sc2.nextLine();
        } while (repetir.toLowerCase().equals("s"));
        System.out.println("Que tenga un feliz vuelo.");

        sc.close();
        sc2.close();
        }
    }
