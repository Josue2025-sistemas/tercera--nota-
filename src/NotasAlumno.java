package Unidad1;

import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] notas = new double[5];
        double suma = 0;
        double max = 0;
        double min = 10;

        // Leer notas
        for (int i = 0; i < notas.length; i++) {
            double nota;

            // Validación de que esté entre 0 y 10
            do {
                System.out.print("Introduce la nota " + (i + 1) + " (0 a 10): ");
                nota = sc.nextDouble();
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
            suma += nota;

            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        // Mostrar todas las notas
        System.out.println("\nNotas introducidas:");
        for (double n : notas) {
            System.out.println(n);
        }

        // Mostrar resultados
        double media = suma / notas.length;

        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        sc.close();
    }
}
