package Servicios;

import Entidades.Operacion;

import java.util.Scanner;

public class ServiciosOperacion {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion () {

        Operacion op1 = new Operacion();

        System.out.println("Ingrese el primer numero: ");
        op1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        op1.setNumero2(leer.nextInt());
        return op1;
    }
}
