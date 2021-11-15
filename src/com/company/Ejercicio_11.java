package com.company;

import java.util.Scanner;

/*
En MegaPlaza se hacen los siguientes descuentos:
10% a los clientes cuya compra supere los 100 €.
20% a los clientes cuya compra supere los 200 €.
¿Cuál será la cantidad que pagara una persona por su compra?.
Ejemplo: Introduce el importe de tu compra: 100 ---> El cliente deberá pagar 90 €.
*/

public class Ejercicio_11 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        double precio;

        // CÓDIGO:
        System.out.println();
        System.out.println("¿Cuál es el importe de tu compra?");
        precio = sc.nextDouble();

        if (precio < 100) // Aquí no hay descuento. :(
            System.out.printf("El importe final de tu compra es de: %5.2f€ ", precio);

        if (precio >= 100) // Multiplicamos por 0,9 porque así conseguimos un descuento del 10%.
            System.out.printf("El importe final de tu compra es de: %5.2f€ ", precio = precio * 0.9);

        if (precio >= 200) // Multiplicamos por 0,8 porque así conseguimos un descuento del 20%.
            System.out.printf("El importe final de tu compra es de: %5.2f€ ", precio = precio * 0.8);

        sc.close();
    }
}
