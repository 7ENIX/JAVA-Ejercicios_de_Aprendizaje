package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Pedir un numero al usuario y decirle si es capicúa. */

public class Ejercicio_46 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner (System.in);
        List<String> arrayListNumero = new ArrayList<>();
        List<String> arrayListNumeroInvertido = new ArrayList<>();

        // CÓDIGO:
        System.out.print("Escribe un número: ");
        String numero = sc.nextLine();

        // Creamos el arrayList del número introducido:
        for (int i = 0; i < numero.length(); i++) {
            arrayListNumero.add(String.valueOf(numero.charAt(i)));
        }
        // Creamos el arrayList del número introducido, pero esta vez invertido:
        for (int i = arrayListNumero.size()-1; i >= 0; i--) {
            arrayListNumeroInvertido.add(arrayListNumero.get(i));
        }
        // Comparamos los Arrays:
        if (arrayListNumero.equals(arrayListNumeroInvertido)) {
            System.out.println("El número " + numero + " sí es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }
    }
}
