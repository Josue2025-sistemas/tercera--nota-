package Unidad1;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosEdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        // Leer datos
        while (true) {
            System.out.print("Introduce el nombre del alumno (o * para terminar): ");
            String nombre = sc.nextLine();

            if (nombre.equals("*")) {
                break; // fin del ingreso
            }

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine(); // limpiar el salto de línea

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\n--- Alumnos mayores de edad (18 o más) ---");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }

        // Encontrar la mayor edad
        if (!edades.isEmpty()) {
            int maxEdad = edades.get(0);
            for (int edad : edades) {
                if (edad > maxEdad) {
                    maxEdad = edad;
                }
            }

            System.out.println("\n--- Alumnos con mayor edad (" + maxEdad + " años) ---");

            for (int i = 0; i < nombres.size(); i++) {
                if (edades.get(i) == maxEdad) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                }
            }
        } else {
            System.out.println("\nNo se introdujeron alumnos.");
        }

        sc.close();
    }
}
