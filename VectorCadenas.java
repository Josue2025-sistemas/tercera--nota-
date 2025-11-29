package Unidad1;
import java.util.Scanner;

public class VectorCadenas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] vector = new String[5];
        String[] vectorInverso = new String[5];

        // Leer valores por teclado
        System.out.println("Introduce 5 cadenas de texto:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vector[i] = sc.nextLine();
        }

        // Copiar los elementos en orden inverso
        for (int i = 0; i < vector.length; i++) {
            vectorInverso[i] = vector[vector.length - 1 - i];
        }

        // Mostrar vector inverso
        System.out.println("\nVector en orden inverso:");
        for (String cadena : vectorInverso) {
            System.out.println(cadena);
        }

        sc.close();
    }
}
