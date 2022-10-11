package ejPoo;

public class Biblioteca {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        System.out.println("Informacion del libro 1");

        libro1.cargarDatos();
        libro1.mostrarDatos();

        System.out.println("Informacion del libro 2");
        Libro libro2 = new Libro();

        libro2.cargarDatos();
        libro2.mostrarDatos();


    }
}
