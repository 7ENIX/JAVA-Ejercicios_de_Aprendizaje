package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*
Rellenar un array unidimensional de 50 posiciones con números aleatorios entre el 1 y el 100 y mostrarlo por
pantalla. Tras esto, se le preguntará al usuario en cuántos arrays quiere dividirlo y habrá que guardarlo en
un array bidimensional cuya primera dimensión será el número que hay dicho el usuario y la segunda será lo
suficientemente grande para que quepan todos los números.
Ejemplo:
Si el usuario dice que quiere subdividirlo en 5 arrays habrá que crear un array bidimensional de 5x10. Si dice
en 7 será de 7x8, etc...
*/
public class Ejercicio_59 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int[] array = new int[50];
        int[][] subarrays;
        int numeroSubarrays = 0;

        int resultado;
        int contador = 0;

        // Rellenamos el array con 50 números aleatorios entre el número 1 y el 100.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        // Imprimimos el array.
        System.out.println(Arrays.toString(array));

        // Leémos en cuántos subarrays queremos dividir el array principal.
        System.out.print("¿En cuántos subarrays quieres dividir el array principal?: ");
        numeroSubarrays = sc.nextInt();

        resultado = 50 / numeroSubarrays;
        subarrays = new int[numeroSubarrays][resultado];


        sc.close();
    }
}
