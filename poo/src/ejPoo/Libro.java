package ejPoo;

import java.util.Scanner;

public class Libro {
    Scanner leer = new Scanner(System.in);
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    public Libro () {

    }

    public void cargarDatos () {

        System.out.println("Ingrese los datos del libro: ");
        System.out.println("ISBN: ");
        ISBN = leer.nextInt();
        System.out.println("Titulo: ");
        leer.nextLine();
        Titulo = leer.nextLine();
        System.out.println("Autor: ");
        Autor = leer.nextLine();
        System.out.println("Numero de paginas: ");
        NumeroDePaginas = leer.nextInt();

    }

    public void mostrarDatos () {

        System.out.println("ISBN: " + ISBN);
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Numero de paginas: " + NumeroDePaginas);
    }

}

