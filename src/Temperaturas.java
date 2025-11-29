package Unidad1;

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] tempMin = new double[5];
        double[] tempMax = new double[5];

        // Leer temperaturas
        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1));

            System.out.print("Temperatura mínima: ");
            tempMin[i] = sc.nextDouble();

            System.out.print("Temperatura máxima: ");
            tempMax[i] = sc.nextDouble();

            System.out.println();
        }

        // 1) Temperatura media de cada día
        System.out.println("---- Temperatura media de cada día ----");
        for (int i = 0; i < 5; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2.0;
            System.out.println("Día " + (i + 1) + ": media = " + media);
        }

        // 2) Días con menos temperatura mínima
        double menorMin = tempMin[0];
        for (int i = 1; i < 5; i++) {
            if (tempMin[i] < menorMin) {
                menorMin = tempMin[i];
            }
        }

        System.out.println("\n---- Días con menor temperatura mínima (" + menorMin + ") ----");
        for (int i = 0; i < 5; i++) {
            if (tempMin[i] == menorMin) {
                System.out.println("Día " + (i + 1));
            }
        }

        // 3) Buscar días con una temperatura máxima dada
        System.out.print("\nIntroduce una temperatura máxima a buscar: ");
        double buscada = sc.nextDouble();

        boolean encontrado = false;
        System.out.println("\n---- Días con temperatura máxima igual a " + buscada + " ----");

        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == buscada) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún día con esa temperatura máxima.");
        }

        sc.close();
    }
}
