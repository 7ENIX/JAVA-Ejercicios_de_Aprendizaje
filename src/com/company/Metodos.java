package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
En esta clase se agrupan una serie de métodos que estuve practicando cuando estaba aprendiendo a programar.
Todos ellos son descritos y codificados después de método main, en el cual se ejecutan todos ellos.
 */
public class Metodos {
    public static void main(String[] args) {

        // VARIABLES:
        int numero1 = 2;
        int numero2 = 7;
        int numero3 = 9;
        int[] arrayNumeros = {numero1, numero2, numero3, 12, 4};
        int numeroAleatorio = numeroAleatorioEntre1Y100();
        String fecha = "30/09/1991";
        String texto = "Hola, me llamo Zenix y estudié programación. Me gusta mucho programar y hacer aplicaciones.";

        // LLAMADA A LOS MÉTODOS DESARROLLADOS DEBAJO:
        System.out.println("Metodo 'maximoDeDos': " + maximoDeDos(numero1, numero2));
        System.out.println("Metodo 'maximoDeTres': " + maximoDeTres(numero1, numero2, numero3));
        System.out.println("Metodo 'maximoNumeroDeArray': " + maximoNumeroDeArray(arrayNumeros));
        System.out.print("Metodo 'intervaloEntreDosNumerosEnteros': ");
        intervaloEntreDosNumerosEnteros(numero1, numero3);
        System.out.println("\nMetodo 'intervaloEntreDosNumerosEnArrayList': " +
                intervaloEntreDosNumerosEnArrayList(numero1, numero2));
        System.out.println("Metodo 'intervaloDefinidoEntreDosNumerosEnArrayList': " +
                intervaloDefinidoEntreDosNumerosEnArrayList(20, 2, 2));
        System.out.println("Metodo 'numeroAleatorioEntre1Y100': " + numeroAleatorio);
        System.out.print("Metodo 'sustituirNumeroEnArray': ");
        sustituirNumeroEnArray(numero1, arrayNumeros);
        System.out.println("Metodo 'cambioFormatoFecha': " + cambioFormatoFecha(fecha));
        System.out.println("Metodo 'porcentajePalabrasMenos5Caracteres': El " + porcentajePalabrasMenos5Caracteres(texto)
                + "% de las palabras del texto tienen menos de 5 caracteres.");
    }

    /* \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ MÉTODOS //////////////////////////////////////// */

    /* Método que tenga como parámetros 2 números y que devuelva el máximo de ellos. */
    public static int maximoDeDos(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
        //Este método también se resuelve simplemente con: return Math.max(numero1, numero2);
    }

    /* Método que calcule y devuelva el máximo de 3 números que tiene como parámetros. */
    public static int maximoDeTres(int numero1, int numero2, int numero3) {
        int maximoDeTres = 0;
        if (numero1 > numero2 && numero1 > numero3) {
            maximoDeTres = numero1;
        }
        if (numero2 > numero1 && numero2 > numero3) {
            maximoDeTres = numero2;
        }
        if (numero3 > numero1 && numero3 > numero2) {
            maximoDeTres = numero3;
        }
        return maximoDeTres;
    }

    /* Método que calcule y devuelva el máximo número contenido en un array de 5 números enteros. */
    public static int maximoNumeroDeArray(int[] arrayNumeros) {
        int maximoNumeroDeArray = 0;
        for (int arrayNumero : arrayNumeros) { //Utilizamos un forEach para realizar el recorrido del array.
            if (arrayNumero > maximoNumeroDeArray) {
                maximoNumeroDeArray = arrayNumero;
            }
        }
        return maximoNumeroDeArray;
    }

    /* Método al que se le pasan 2 enteros y muestra todos los números comprendidos entre ellos, ellos inclusive. */
    public static void intervaloEntreDosNumerosEnteros(int numero1, int numero2) {
        for (int i = numero1; i <= numero2; i++) {
            System.out.print(i + ", ");
        }
    }

    /* Método al que se le pasan 2 enteros por parámetros y devuelve un arrayList con los números comprendidos
       entre ellos, estos inclusive. */
    public static ArrayList<Integer> intervaloEntreDosNumerosEnArrayList(int numero1, int numero2) {
        ArrayList<Integer> arrayListIntervalo = new ArrayList<>();
        for (int i = numero1; i <= numero2; i++) {
            arrayListIntervalo.add(i);
        }
        return arrayListIntervalo;
    }

    /* Método al que se le pasan 3 enteros(principio, fin, e intervalo) y devuelve un array relleno con los
       números comprendidos entre ellos, ellos inclusive, con el intervalo que se indique. */
    public static ArrayList<Integer> intervaloDefinidoEntreDosNumerosEnArrayList(int numeroInicio, int numeroFin, int intervalo) {
        ArrayList<Integer> arrayListIntervaloDefinido = new ArrayList<>();
        int numeroAux = 0;

        //En caso de que el primer número sea mayor que el segundo debemos de intercambiar sus valores.
        if (numeroInicio > numeroFin) {
            numeroAux = numeroInicio;
            numeroInicio = numeroFin;
            numeroFin = numeroAux;
        }
        for (int i = numeroInicio; i < numeroFin; i += intervalo) {
            arrayListIntervaloDefinido.add(i);
        }
        arrayListIntervaloDefinido.add(numeroFin);
        return arrayListIntervaloDefinido;
    }

    /* Método que devuelve un numero aleatorio del 1 al 100. */
    public static int numeroAleatorioEntre1Y100() {
        return (int) (Math.random() * 100 + 1);
    }

    /* Método que recibe un numero y un array como parámetros. Deberá introducir en la posición del array que
       le indica el número otro valor que recibirá del método anterior (numeroAleatorioEntre1Y100).*/
    public static void sustituirNumeroEnArray(int numero, int[] array) {
        int numeroAleatorio = numeroAleatorioEntre1Y100();
        array[numero] = numeroAleatorio;
        System.out.println(numeroAleatorio);
        System.out.println(Arrays.toString(array));
    }

    /* Método que al recibir como dato una cadena de caracteres que represente una fecha en formato (dd/mm/aaaa),
       devuelva otra cadena con la misma fecha pero con formato (dd de nombre del mes de aaaa).
       Ejemplo: Si se ingresa la cadena: 20/11/2006 la otra cadena será: 20 de Noviembre de 2006. */
    public static String cambioFormatoFecha(String fecha) {
        String mes = fecha.split("/")[1];
        switch (mes) {
            case "01":
                mes = "Enero";
                break;
            case "02":
                mes = "Febrero";
                break;
            case "03":
                mes = "Marzo";
                break;
            case "04":
                mes = "Abril";
                break;
            case "05":
                mes = "Mayo";
                break;
            case "06":
                mes = "Junio";
                break;
            case "07":
                mes = "Julio";
                break;
            case "08":
                mes = "Agosto";
                break;
            case "09":
                mes = "Septiembre";
                break;
            case "10":
                mes = "Octubre";
                break;
            case "11":
                mes = "Noviembre";
                break;
            case "12":
                mes = "Diciembre";
                break;
        }
        return fecha.replace(fecha.split("/")[1], mes).replace("/", " de ");
    }

    /* Método que recibe un texto y devuelve el porcentaje de palabras de ese texto que tienen menos
       de 5 caracteres. */
    public static int porcentajePalabrasMenos5Caracteres(String texto) {
        /* Vamos a utilizar StringTokenizer, que nos dice cuántas palabras hay en nuestro texto. */
        StringTokenizer palabras = new StringTokenizer(texto);
        int numeroTotalPalabras = palabras.countTokens();
        int palabrasMenos5Caracteres = 0;
        int numeroCaracteres = 0;

        for (int i = 0; i < texto.length(); i++) {
            /* Si el carácter en el que estamos no es un espacio, coma o punto, contará como letra de una palabra. */
            if (texto.charAt(i) != ' ' && texto.charAt(i) != ',' && texto.charAt(i) != '.' ) {
                numeroCaracteres++;
            }
            /* Si el carácter en el que estamos es un espacio, coma o punto reiniciaremos el contador de caracteres
               a 0. Además comprobaremos el número de caracteres sumados hasta ahora y, si es mayor que cero y menor
               que 5 el contador de palabras con menos de 5 caracteres aumentará en 1. */
            if (texto.charAt(i) == ' ' || texto.charAt(i) == ',' || texto.charAt(i) == '.' ) {
                if (numeroCaracteres > 0 && numeroCaracteres < 5) {
                    palabrasMenos5Caracteres++;
                }
                numeroCaracteres = 0;
            }
        }

        int porcentaje = (int)  (palabrasMenos5Caracteres * 100) / numeroTotalPalabras;
        return porcentaje;
    }
}