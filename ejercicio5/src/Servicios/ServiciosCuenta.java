package Servicios;

import Entidades.CuentaBancaria;

import java.util.Scanner;

public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria PedirDatos (){
        CuentaBancaria cb1 = new CuentaBancaria();

        System.out.println("Ingrese los datos del cliente");

        System.out.println("Numero de cuenta: ");
        cb1.setNumeroCuenta(leer.nextInt());

        System.out.println("DNI del cliente: ");
        cb1.setDniCliente(leer.nextLong());

        System.out.println("Saldo actual: ");
        cb1.setSaldoActual(leer.nextInt());

        return cb1;
    }

}
