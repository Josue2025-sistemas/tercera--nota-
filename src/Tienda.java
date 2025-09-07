package Unidad1;

public class Tienda {

      public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        
        double descuento15 = 0.15;
        double precioCamisetaDescuento = precioCamiseta * (1 - descuento15);
        double precioPantalonDescuento = precioPantalon * (1 - descuento15);

        
        double descuentoAdicional = 0.05;
        double precioSegundaCamiseta = precioCamisetaDescuento * (1 - descuentoAdicional);

        
        double total = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamiseta;

        System.out.printf("Precio de la primera camiseta con 15%% de descuento: $%.2f%n", precioCamisetaDescuento);
        System.out.printf("Precio del pantalón con 15%% de descuento: $%.2f%n", precioPantalonDescuento);
        System.out.printf("Precio de la segunda camiseta con 15%% + 5%% de descuento: $%.2f%n", precioSegundaCamiseta);
        System.out.printf("Precio total a pagar: $%.2f%n", total);
    }


    
}
