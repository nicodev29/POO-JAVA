package ServiciosRaices;

import Entidades.Raices;

import java.util.Scanner;

public class ServiciosRaices {

    Scanner leer = new Scanner(System.in);
    Raices r1 = new Raices();
    public Raices datos () {

        System.out.println("Ingrese los 3 coeficientes: ");
        System.out.println("A:");
        r1.setA(leer.nextDouble());
        System.out.println("B:");
        r1.setB(leer.nextDouble());
        System.out.println("C");
        r1.setC(leer.nextDouble());

        return r1;
    }
    public Raices Discriminante (){

        double dis = (float) (r1.b* r1.b) -4* r1.a* r1.c;
        System.out.println("El discriminante es: " + dis);
        return r1;
    }
    public Raices tieneRaiz (){

        double dis = (r1.b* r1.b) -4* r1.a* r1.c;

        if (dis == 0 ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        return r1;
    }

    public Raices obtenerRaices (){

        return r1;
    }

}
