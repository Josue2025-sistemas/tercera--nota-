package Unidad1;

public class BancoPrest {
    
     public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanas = 4;

        
        double totalRetirado = retiroSemanal * semanas;

        double saldoFinal = saldoInicial - totalRetirado;

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Total retirado en " + semanas + " semanas: $" + totalRetirado);
        System.out.println("Saldo final en la cuenta: $" + saldoFinal);
    }
}
