package Servicios;

import Entidades.Matematica;

import java.text.Format;
import java.util.Scanner;

public class ServiciosMatematica {
    Matematica mat = new Matematica();
    Scanner leer = new Scanner(System.in);
    public Matematica devolverMayor (){

        System.out.println("Ingrese un numero: ");
        mat.setNum1(leer.nextDouble());
        System.out.println("Ingrese otro numero: ");
        mat.setNum2(leer.nextDouble());


        if (mat.getNum1() > mat.getNum2()){
            System.out.println("El mayor es: " + mat.getNum1());
        }else {
            System.out.println("El mayor es: " + mat.getNum2());
        }

        return mat;
    }
    public Matematica calcularPotencial (){


        System.out.println("Ingrese un numero: ");
        mat.setNum1(leer.nextDouble());
        System.out.println("Ingrese otro numero: ");
        mat.setNum2(leer.nextDouble());


        if (mat.getNum1() > mat.getNum2()){
            int a = (int) Math.floor(Math.pow(mat.getNum1(), mat.getNum2()));

            System.out.println("El numero elevado es: " + a);
        }else {
            int b = (int) Math.floor(Math.pow(mat.getNum2(), mat.getNum1()));
            System.out.println("El numero elevado es: " + b);
        }

        return mat;
    }
    public Matematica calcularRaiz (){

        System.out.println("Ingresa un numero:");
            double a = mat.setNum1(leer.nextDouble());
        System.out.println("Ingresa otro numero:");
            double b = mat.setNum2(leer.nextDouble());


         if (mat.getNum1() < mat.getNum2()){
             a = (int) Math.floor(Math.sqrt(a)) ;
            System.out.println("La raiz cuadrada del menor es: " + a);
        }else {
             b = (int) Math.floor(Math.sqrt(b));
            System.out.println("La raiz cuadrada del menor es: " + b);
        }
        return mat;
    }

}
