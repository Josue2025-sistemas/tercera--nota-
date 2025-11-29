package Unidad1;

import java.util.Scanner;

public class MesesVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vector con nombres de los meses
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        // Vector con los días de cada mes (febrero = 28 días)
        int[] diasMeses = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        // Pedir número de mes
        System.out.print("Introduce un número de mes (1-12): ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Número de mes no válido.");
        } else {
            System.out.println("Mes: " + nombresMeses[mes - 1]);
            System.out.println("Días: " + diasMeses[mes - 1]);
        }

        sc.close();
    }
}

