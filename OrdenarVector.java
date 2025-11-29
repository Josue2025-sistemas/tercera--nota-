package Unidad1;

import java.util.Arrays;
import java.util.Random;

public class OrdenarVector {
    public static void main(String[] args) {
        
        int[] vector = new int[10];
        Random rand = new Random();

        // Inicializar con valores aleatorios (1 a 100, por ejemplo)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100) + 1;
        }

        // Mostrar vector original
        System.out.println("Vector original:");
        System.out.println(Arrays.toString(vector));

        // Ordenar de menor a mayor
        Arrays.sort(vector);

        // Mostrar vector ordenado
        System.out.println("\nVector ordenado de menor a mayor:");
        System.out.println(Arrays.toString(vector));
    }
}

