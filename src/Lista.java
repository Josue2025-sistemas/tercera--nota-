package Unidad1;
 
import java.util.Scanner;

public class Lista {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos animales deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] animales = new String[cantidad];

        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre del animal #" + (i + 1) + ": ");
            animales[i] = scanner.nextLine();
            }

        System.out.println("\nLista de animales ingresados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("- " + animales[i]);
        }
 }
    
}
