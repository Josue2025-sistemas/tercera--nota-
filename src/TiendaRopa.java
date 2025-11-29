package Unidad1;

public class TiendaRopa {

    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuentos
        double descuentoGeneral = 0.15;
        double descuentoAdicionalCamiseta = 0.05;

        // Aplicar descuento general del 15%
        double camisetaConDescuento = precioCamiseta * (1 - descuentoGeneral);
        double pantalonConDescuento = precioPantalon * (1 - descuentoGeneral);

        // Segunda camiseta con 5% adicional sobre el precio ya descontado
        double segundaCamisetaConDescuento = camisetaConDescuento * (1 - descuentoAdicionalCamiseta);

        // Calcular el total
        double total = camisetaConDescuento + pantalonConDescuento + segundaCamisetaConDescuento;

        // Mostrar resultados
        System.out.printf("Precio de la primera camiseta con descuento: $%.2f\n", camisetaConDescuento);
        System.out.printf("Precio del pantalón con descuento: $%.2f\n", pantalonConDescuento);
        System.out.printf("Precio de la segunda camiseta con doble descuento: $%.2f\n", segundaCamisetaConDescuento);
        System.out.printf("Precio total a pagar: $%.2f\n", total);
    }
    
}
