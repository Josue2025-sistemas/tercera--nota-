package Unidad1;

import java.util.Random;

public class VectorNumeros {
    public static void main(String[] args) {

        int[] vector_numeros = new int[10];
        Random rand = new Random();

        // Inicializar el vector con valores aleatorios del 1 al 10
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1; 
        }

        // Mostrar cada elemento con su cuadrado y su cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < vector_numeros.length; i++) {
            int num = vector_numeros[i];
            System.out.println(num + "\t\t" + (num * num) + "\t\t" + (num * num * num));
        }
    }
}

