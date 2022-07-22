package com.company;

import java.util.Arrays;
import java.util.Scanner;

/* Introducir las notas de 3 asignaturas y X alumnos.
    1- Pedir por teclado el numero de alumnos. (X)
    2- Habrá 3 asignaturas.
    Crear 3 arrays de X posiciones e introducir los datos:
    Ejemplo: introduce la nota del alumno 2 y la asignatura 1: 8
             introduce la nota del alumno 2 y la asignatura 2: 7
Al finalizar se mostrarán todos los datos, además de la media por alumno,
la media por asignatura, el número de suspensos por asignatura
y el número de suspensos por alumnos. */
public class Ejercicio_53 {
    public static void main(String[] args) {

        // VARIABLES:
        Scanner sc = new Scanner(System.in);
        int alumnos = 0;
        int suspensosM = 0, suspensosF = 0, suspensosE = 0;
        float mediaMatematicas = 0, mediaFisica = 0, mediaEconomia = 0;

        // CÓDIGO:
        System.out.print("¿Cuántos alumnos hay en clase?:");
        alumnos = sc.nextInt();

        // Creamos los 3 arrays ahora, definiendo su longitud por el número de alumnos.
        float[] matematicas = new float[alumnos];
        float[] fisica = new float[alumnos];
        float[] economia = new float[alumnos];

        // Pedimos las notas de los alumnos y rellenamos las asignaturas con dichas notas.
        for (int i = 0; i < alumnos; i++) {
            System.out.print("Dime la nota del alumno " + (i + 1) + " en matemáticas: ");
            float nota = sc.nextFloat();
            matematicas[i] = nota;
            if (nota < 5) {
                suspensosM++;
            }
        }
        for (int i = 0; i < alumnos; i++) {
            System.out.print("Dime la nota del alumno " + (i + 1) + " en física:  ");
            float nota = sc.nextFloat();
            fisica[i] = nota;
            if (nota < 5) {
                suspensosF++;
            }
        }
        for (int i = 0; i < alumnos; i++) {
            System.out.print("Dime la nota del alumno " + (i + 1) + " en economía: ");
            float nota = sc.nextFloat();
            economia[i] = nota;
            if (nota < 5) {
                suspensosE++;
            }
        }

        // Mostramos las asignaturas con sus notas:
        System.out.println("\nLas notas de matemáticas son: " + Arrays.toString(matematicas) + " con " + suspensosM + " supensos.");
        System.out.println("Las notas de física son: " + Arrays.toString(fisica) + " con " + suspensosF + " supensos.");
        System.out.println("Las notas de economía son: " + Arrays.toString(economia) + " con " + suspensosE + " supensos.");

        // Calculamos la nota total de cada asignatura para luego calcular la media:
        for (int i = 0; i < matematicas.length; i++) {
            mediaMatematicas = mediaMatematicas + matematicas[i];
        }
        for (int i = 0; i < fisica.length; i++) {
            mediaFisica = mediaFisica + fisica[i];
        }
        for (int i = 0; i < economia.length; i++) {
            mediaEconomia = mediaEconomia + economia[i];
        }

        // Mostramos la media de cada una de las asignaturas:
        System.out.println("La media de las notas de matemáticas es: " + (mediaMatematicas = mediaMatematicas / alumnos));
        System.out.println("La media de las notas de física es: " + (mediaFisica = mediaFisica / alumnos));
        System.out.println("La media de las notas de economía es: " + (mediaEconomia = mediaEconomia / alumnos));

        // Calculamos al media de las notas de cada alumno y la imprimimos:
        for (int i = 0; i < fisica.length; i++) {
            float media = fisica[i] + matematicas[i] + economia[i];
            System.out.println("La nota media del alumno " + (i + 1) + " es: " + media / 3);
        }

        // Calculamos el número de suspensos por alumno:
        for (int i = 0; i < matematicas.length; i++) {
            int suspensos = 0;

            if (matematicas[i] < 5) {
                suspensos++;
            }
            if (fisica[i] < 5) {
                suspensos++;
            }
            if (economia[i] < 5) {
                suspensos++;
            }
            System.out.println("El número de suspensos del alumno " + (i + 1) + " es: " + suspensos);
        }
        sc.close();
    }
}
