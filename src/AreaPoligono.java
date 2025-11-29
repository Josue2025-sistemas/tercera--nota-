package Unidad1;

public class AreaPoligono {
    public static double calcularArea(String poligono, double dim1, double dim2) {
        poligono = poligono.toLowerCase(); // ignorar mayúsculas/minúsculas

        switch (poligono) {

            case "triangulo":
                // dim1 = base, dim2 = altura
                return (dim1 * dim2) / 2;

            case "cuadrado":
                // dim1 = lado (dim2 se ignora)
                return dim1 * dim1;

            case "rectangulo":
                // dim1 = base, dim2 = altura
                return dim1 * dim2;

            default:
                System.out.println("Polígono no reconocido.");
                return -1; // error
        }
    }

    public static void main(String[] args) {

        System.out.println("Área del triángulo: " + calcularArea("triangulo", 10, 5));
        System.out.println("Área del cuadrado: " + calcularArea("cuadrado", 4, 0));
        System.out.println("Área del rectángulo: " + calcularArea("rectangulo", 8, 3));
    }
}
