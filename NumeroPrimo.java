package Unidad1;

public class NumeroPrimo {
      public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;  // 0, 1 y negativos NO son primos
        }

        // Solo revisamos divisores desde 2 hasta la mitad del número
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;  // Si es divisible por otro número → no es primo
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int numero = 29;  // <-- Aquí puedes cambiar el número a verificar

        // Verificar si un número es primo
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }

        System.out.println("\nNúmeros primos entre 1 y 100:");

        // Imprimir todos los números primos entre 1 y 100
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
