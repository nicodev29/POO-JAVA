package Servicios;

import Entidades.Cancion;

import java.util.Scanner;

public class ServiciosCancion {

    Scanner leer = new Scanner(System.in);


    Cancion can = new Cancion();

    public Cancion ingresarDatos (){

        System.out.println("Ingresa el nombre de la cancion: ");
        can.setTitulo(leer.nextLine());

        System.out.println("Ingresa el autor de la cancion: ");
        can.setAutor(leer.nextLine());

        System.out.println("Los datos ingresados son");
        System.out.println("Nombre de la cancion: " + can.titulo);
        System.out.println("Autor de la cancion: " + can.autor);

        return can;
    }

}
