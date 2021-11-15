package com.company;

import java.util.Scanner;

/*
Conversor de euros(€) a ... Elegir una divisa de entrada que se quiera y devolver su equivalente en euros.
Si la divisa que escogemos no existe, debemos de repetir la pregunta hasta que escojamos una que sea posible.
*/

public class Ejercicio_7 {

    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        int eleccion_divisa;
        double cantidad, resultado;
        double dollar_euro = 0.86;
        double libra_euro = 1.18;
        double yen_euro = 0.0076;

        // CÓDIGO:
        System.out.println(); // Espacio para que el programa no empiece pegado a la parte superior de la consola.
        /*
        Hacemos el bucle "do-while". Lo repetiremos hasta que pulsemos una de las opciones (1, 2 ó 3). Si la opción
        que escogemos es mayor que 3 o menor que 1 nos dará error y empezaremos el bucle otra vez. Si la opción es
        válida, saldremos del bucle y continuaremos el programa.
        */
       do {
           System.out.println("Escoge una divisa: Dolares (pulsa '1'), Libras (pulsa '2'), Yenes (pulsa '3')");
           eleccion_divisa = sc.nextInt();
           if (eleccion_divisa > 3 || eleccion_divisa < 1) {
               System.out.println("Esa opción no es válida. Por favor, escoge una opción de la pantalla");
           }
       } while (eleccion_divisa != 1 && eleccion_divisa != 2 && eleccion_divisa != 3);

        System.out.println("Escribe la cantidad que quieres convertir a euros(€):");
        cantidad = sc2.nextDouble();

        // Hacemos un Switch para filtrar las elecciones.
        switch (eleccion_divisa) {
            case 1:
                System.out.printf("La cantidad es: %5.2f euros(€).", resultado = cantidad * dollar_euro);
                break;
            case 2:
                System.out.printf("La cantidad es: %5.2f euros(€).", resultado = cantidad * libra_euro);
                break;
            case 3:
                System.out.printf("La cantidad es: %5.2f euros(€).", resultado = cantidad * yen_euro);
                break;
        }

        sc.close();
        sc2.close();
    }
}
