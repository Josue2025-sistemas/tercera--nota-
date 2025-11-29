package Unidad1;

import java.util.Scanner;

public class MatrizSumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Leer datos de la matriz
        System.out.println("Introduce los valores de la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Suma de cada fila
        System.out.println("\n---- Suma de cada fila ----");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        // Suma de cada columna
        System.out.println("\n---- Suma de cada columna ----");
        for (int j = 0; j < 5; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 5; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaCol);
        }

        sc.close();
    }
}

