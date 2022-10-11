package Servicios;

import Entidades.Rectangulo;

import java.util.Scanner;

public class ServiciosRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo moldearRectangulos () {

        Rectangulo r1 = new Rectangulo();

        System.out.println("Ingrese la base del rectangulo: ");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo: ");
        r1.setAltura(leer.nextInt());

        return r1;
    }

}
