package com.company;

import java.util.Scanner;

/*
Calculadora de precio con o sin IVA. Mostraremos un menú de dos opciones, una de ellas para poner un precio sin IVA
y que devuelva la cantidad a pagar con impuestos. La otra devuelve el precio de un producto sin IVA, introduciendo
el precio que se ha pagado con IVA nos debe devolver el precio real del producto sin impuestos. (IVA = 21%).
*/

public class Ejercicio_10 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String eleccion;
        double preciocon, preciosin;

        // CÓDIGO:
        System.out.println();
        do {
            System.out.println("Quieres calcular el precio 'CON IVA' (pulsa 'C') o 'SIN IVA' (pulsa 'S')");
            eleccion = sc.nextLine();
            if (!eleccion.equals("c") && !eleccion.equals("C") && !eleccion.equals("s") && !eleccion.equals("S"))
                System.out.println("Por favor, introduce una opción válida.");
                System.out.println();
        } while (!eleccion.equals("c") && !eleccion.equals("C") && !eleccion.equals("s") && !eleccion.equals("S"));

        eleccion = eleccion.toLowerCase(); // Pasamos la elección correcta a minúsculas para usarlas en el switch.

        switch (eleccion) {

            case "c":
                System.out.println("Introduce el precio sin IVA del producto:");
                preciocon = sc2.nextDouble();
                preciosin =  (preciocon / 100) * 121;
                System.out.printf("El precio sin IVA es de: %5.2f€", preciosin);
                break;

            case "s":
                System.out.println("Introduce el precio con IVA del producto:");
                preciosin = sc2.nextDouble();
                preciocon = (preciosin / 121) * 100;
                System.out.printf("El precio con IVA es de: %5.2f€ ", preciocon);
                break;
        }

        sc.close();
        sc2.close();
    }
}