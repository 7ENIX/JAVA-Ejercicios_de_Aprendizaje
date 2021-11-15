package com.company;

import java.util.Scanner;

/*
Pedir por pantalla 3 números, un año, un mes y un día, y vais a devolverlo en formato fecha, así yyyy/mm/dd.
Números de una cifra, lo ponemos con una cifra (opcional relleno con 0). El año debe ser un número entre 1000 y 3000.
El mes debe ser un mes válido. El día debe ser un día válido para el mes seleccionado. Y al final, volver a pedir
números, con opción de salir del programa.
*/

public class Ejercicio_16 {

    public static void main(String[] args) {
        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        boolean correcto;
        int dia, mes, año;
        String repetir;

        // CÓDIGO:
        System.out.println("Hola");
        do {
            correcto = true;
            System.out.println("Escribe el número de año entre el año 1.000 y el año 3.000:");
            año = Integer.parseInt(sc.nextLine());
            while (año < 1000 || año > 3000) {
                System.out.println("El año escrito no está entre el año 1.000 y el año 3.000. Escríbelo de nuevo:");
                año = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Escribe el número de mes:");
            mes = Integer.parseInt(sc.nextLine());
            while ((mes < 1) || (mes > 12)) {
                System.out.println("El mes escrito no es correcto. Escríbelo de nuevo:");
                mes = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Escribe el numero de día:");
            dia = Integer.parseInt(sc.nextLine());
            while (correcto) {
                if (dia < 1 || dia > 31) {
                    System.out.println("El dia escrito no es correcto. Escríbelo de nuevo:");
                    dia = Integer.parseInt(sc.nextLine());
                } else if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                    System.out.println("Este mes no tiene día 31. Escríbelo de nuevo:");
                    dia = Integer.parseInt(sc.nextLine());
                } else if (año % 4 != 0 && mes == 2 && dia >= 29) {
                    System.out.println("El año " + año + " no es bisiesto, por eso febrero no tiene más de 28 días. Escríbelo de nuevo:");
                    dia = Integer.parseInt(sc.nextLine());
                } else if (año % 4 == 0 && mes == 2 && dia > 29) {
                    System.out.println("Febrero no puede tener mas de 29 días. Escríbelo de nuevo:");
                    dia = Integer.parseInt(sc.nextLine());
                } else {
                    correcto = false;
                }
            }
            System.out.println("La fecha introducida es: " + dia + " // " + mes + " // " + año + ".");
            System.out.println();
            System.out.println("¿Quieres repetir? (S/N)");
            repetir = sc.nextLine();
        } while (repetir.toLowerCase().equals("s"));

        sc.close();
    }
}
