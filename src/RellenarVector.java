package Unidad1;

import java.util.Scanner;

public class RellenarVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int cantidad = 0;  // cantidad de números válidos introducidos

        System.out.println("Introduce números positivos (negativo para finalizar):");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                break;  // termina si el número es negativo
            }

            vector[i] = num;
            cantidad++;  // contamos cuántos se introducen
        }

        // Mostrar solo los elementos introducidos
        System.out.println("\nValores introducidos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(vector[i]);
        }

        sc.close();
    }
}
