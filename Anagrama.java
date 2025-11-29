package Unidad1;

import java.util.Arrays;

public class Anagrama {

    public static boolean esAnagrama(String palabra1, String palabra2) {

        // Convertir ambas palabras a minúsculas
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Si son exactamente iguales, NO son anagramas
        if (palabra1.equals(palabra2)) {
            return false;
        }

        // Convertir a arreglos de caracteres
        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();

        // Si tienen diferente longitud, no pueden ser anagramas
        if (arr1.length != arr2.length) {
            return false;
        }

        // Ordenar los arreglos
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparar arreglos
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(esAnagrama("Roma", "Amor"));      // true
        System.out.println(esAnagrama("Hola", "Halo"));      // false
        System.out.println(esAnagrama("ana", "ana"));        // false (regla del enunciado)
    }
}
