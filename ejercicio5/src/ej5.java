import Entidades.CuentaBancaria;
import Servicios.ServiciosCuenta;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

        Scanner opciones = new Scanner(System.in);

        ServiciosCuenta sc = new ServiciosCuenta();
        CuentaBancaria cb = sc.PedirDatos();

        System.out.println("Que desea hacer?");
        System.out.println("1. Ingresar saldo 2. Retirar dinero 3. Extraccion rapida 4. Consultar saldo 5. Consultar datos");

        int resp = opciones.nextInt();

        switch (resp){
            case 1: cb.ingresoSaldo();
                break;
            case 2: cb.retiroDinero();
                break;
            case 3: cb.extraccionRapida();
                break;
            case 4: cb.consultaSaldo();
                break;
            case 5: cb.consultaDatos();
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }

    }
}
