package Unidad1;

public class Fibonacci {
     public static void main(String[] args) {

        long a = 0;   // primer número
        long b = 1;   // segundo número

        for (int i = 1; i <= 50; i++) {

            System.out.print(a);

            if (i < 50) {
                System.out.print(", ");
            }

            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
