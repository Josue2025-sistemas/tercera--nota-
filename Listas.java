package Unidad1;

import java.util.Scanner;

public class Listas {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir la cantidad de animales
        System.out.print("¿Cuántos animales deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear un arreglo para guardar los nombres de los animales
        String[] animales = new String[cantidad];

        // Paso 2: Ingresar los nombres de los animales
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre del animal #" + (i + 1) + ": ");
            animales[i] = scanner.nextLine();
        }

        // Paso 3: Mostrar la lista de animales
        System.out.println("\nLista de animales ingresados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("- " + animales[i]);
        }

        scanner.close();
    }
    
}
