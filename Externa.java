package Unidad1;

public class Externa {
      private String mensaje = "¡Hola desde la clase externa!";

    public class Interna {
        public void mostrarMensaje() {
            System.out.println(mensaje);  // Accede a la variable de la clase externa
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
