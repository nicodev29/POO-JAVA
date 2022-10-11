package Entidades;

import java.util.Scanner;

public class CuentaBancaria {

    Scanner sc = new Scanner(System.in);
    private int numeroCuenta;
    private int saldoActual;
    private long dniCliente;


    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int saldoActual, long dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dniCliente = dniCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldoActual=" + saldoActual +
                ", dniCliente=" + dniCliente +
                '}';
    }

    public double ingresoSaldo () {

        System.out.println("Ingrese una cantidad de dinero: ");
        int ingresar = sc.nextInt();
        int actual = (this.saldoActual+ingresar);

        System.out.println("Su saldo ahora es: " + actual);
        return (actual);
    }

    public double retiroDinero () {

        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        int retirar = sc.nextInt();

        int retiroActual = saldoActual-retirar;

        if (retirar > saldoActual){
            System.out.println("No tiene la suma solicitada");
            saldoActual = 0;
            System.out.println("Su saldo ahora es: " + saldoActual);
        }


        System.out.println("Su saldo actual ahora es: " + retiroActual);
       return (retiroActual);
    }

    public int extraccionRapida () {

        System.out.println("Ingrese el monto a extraer: ");
        int opRapida = sc.nextInt();

        if (opRapida > (saldoActual*0.2)) {
            System.out.println("La extraccion debe ser de un monto menor");
        } else {
            System.out.println("Usted hizo una extraccion de: " + opRapida);
            System.out.println("Su saldo actual ahora es: " + (saldoActual-opRapida));
        }

        return 0;
    }

    public int consultaSaldo (){

        System.out.println("Su saldo es: " + getSaldoActual());
        return 0;
    }


    public int consultaDatos (){

        System.out.println("Sus datos son");
        System.out.println("DNI: " + getDniCliente());
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
        return 0;
    }

}




