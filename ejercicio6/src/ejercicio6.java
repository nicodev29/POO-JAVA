import Entidades.MaquinaCafe;
import Servicios.MaquinaServicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner opc = new Scanner(System.in);

        MaquinaServicios ms = new MaquinaServicios();
        MaquinaCafe mc = ms.definirCantidades();

        System.out.println("Que desea hacer? ");
        System.out.println("1. Llenar cafetera 2. Vaciar cafetera 3. Agregar cafe 4. Servir cafe");

        int resp = opc.nextInt();

        switch (resp) {
            case 1 -> mc.llenarCafetera();
            case 2 -> mc.vaciarCafetera();
            case 3 -> mc.agregarCafe();
            case 4 -> mc.ServirCafe();

        }
    }
}
