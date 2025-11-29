package Unidad1;

public class Isograma {
    public static boolean isIsogram(String str) {
        // Si el string es null o vacío, es un isograma
        if (str == null || str.isEmpty()) {
            return true;
        }

        // Convertir a minúsculas y remover acentos
        str = removeAccents(str.toLowerCase());

        // Si tiene espacios → más de una palabra → no es isograma
        if (str.contains(" ")) {
            return false;
        }

        // Limpiar el string: dejar solo letras a-z
        str = str.replaceAll("[^a-z]", "");

        // Verificar letras repetidas con indexOf/lastIndexOf
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Si el índice de la primera aparición es distinto al de la última → repetida
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                return false;
            }
        }

        return true;
    }

    // Método para remover acentos manualmente
    private static String removeAccents(String str) {
        return str.replaceAll("[áàäâã]", "a")
                  .replaceAll("[éèëê]", "e")
                  .replaceAll("[íìïî]", "i")
                  .replaceAll("[óòöôõ]", "o")
                  .replaceAll("[úùüû]", "u")
                  .replaceAll("[ýÿ]", "y")
                  .replaceAll("[ñ]", "n");
    }

    // PRUEBAS
    public static void main(String[] args) {

        System.out.println(isIsogram("Murciélago")); // true
        System.out.println(isIsogram("reto"));       // false
        System.out.println(isIsogram("Casa"));       // false
        System.out.println(isIsogram("PeRrO"));      // false
        System.out.println(isIsogram("GaTo"));       // true
        System.out.println(isIsogram(""));           // true
        System.out.println(isIsogram("dos palabras")); // false
    }
}
