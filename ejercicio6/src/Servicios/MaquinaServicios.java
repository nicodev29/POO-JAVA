package Servicios;

import Entidades.MaquinaCafe;
import java.util.Scanner;
public class MaquinaServicios {
    Scanner datos = new Scanner(System.in);
    public MaquinaCafe definirCantidades (){

        MaquinaCafe mc = new MaquinaCafe();

        System.out.println("Ingrese la capacidad maxima de la cafetera: ");
        mc.setCapacidadMax(datos.nextInt());
        System.out.println("Ingrese la capacidad actual de la cafetera: ");
        mc.setCapacidadAct(datos.nextInt());

        return mc;
    }
}
