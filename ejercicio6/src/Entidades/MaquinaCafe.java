package Entidades;

import java.util.Scanner;

public class MaquinaCafe {

    Scanner leer = new Scanner(System.in);
    private int capacidadMax;
    private int capacidadAct;

    public MaquinaCafe() {
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCapacidadAct(int capacidadAct) {
        this.capacidadAct = capacidadAct;
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "capacidadMax=" + capacidadMax +
                ", capacidadAct=" + capacidadAct +
                '}';
    }

    public void llenarCafetera() {

        System.out.println("Desea llenar la capacidad al maximo? ");
        String resp = leer.nextLine();

        if (resp.equals("si")) {
            capacidadAct = capacidadMax;
            System.out.println("Llenando cafetera");
            System.out.println("Capacidad: " + capacidadMax);
        }

    }

    public void vaciarCafetera() {

        System.out.println("Desea vaciar la cafetera? ");
        String resp = leer.nextLine();

        if (resp.equals("si")) {
            capacidadAct = 0;
            System.out.println("Vaciando cafetera");
            System.out.println("Capacidad: " + capacidadAct);
        }

    }

    public void agregarCafe(){

        System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
        int cafAgregado = leer.nextInt();
        capacidadAct = capacidadAct+cafAgregado;

        if (capacidadAct > capacidadMax){
            capacidadAct = capacidadMax;
            System.out.println("No se puede agregar mas cafe que la capacidad maxima");
        }
        System.out.println("La capacidad actual ahora es: " + capacidadAct);
    }

    public void ServirCafe(){

        System.out.println("Ingrese la cantidad de cafes a servir: ");
        int tazaVacia = leer.nextInt();

        if (tazaVacia > capacidadAct ){
            tazaVacia = capacidadAct;
            System.out.println("La capacidad actual no alcanza para la cantidad solicitada.");
            System.out.println("Se haran: " + tazaVacia + " cafes");
        }else {
            capacidadAct = capacidadAct - tazaVacia;
            System.out.println("Se haran: " + tazaVacia + " cafes");
            System.out.println("Quedan disponibles: " + capacidadAct + " cafes para servir");
        }
    }
}