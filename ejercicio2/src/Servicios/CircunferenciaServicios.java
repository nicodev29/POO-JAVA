package Servicios;

import Entidades.Circunferencia;

import java.util.Scanner;

public class CircunferenciaServicios {
    Scanner leer = new Scanner(System.in);

    public Circunferencia radioCircunferencia (){

      Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio de la circunferencia: ");
        c1.setRadio(leer.nextInt());

        return c1;

    }

}
