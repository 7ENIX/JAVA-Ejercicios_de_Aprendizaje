package com.company;
/*
Hallar el producto de los 5 primeros números primos.
 */
public class Ejercicio_31 {
    public static void main(String[] args) {

        int numero = 1;
        int contador = 0;
        int productoPrimos = 1;

        while(contador < 5){
            for (int i = 1; i < 100; i++) {
//                int numeroRandom = ((int)(Math.random() * 100 + 1));
                if (numero % i == 0 && numero % numero == 0) {
                    productoPrimos = productoPrimos * numero;
                    numero++;
                    contador++;
                }
            }
        }
        System.out.println("\n El producto es: " + productoPrimos);
    }
}

