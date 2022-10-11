import Entidades.cadena;
import Servicios.ServiciosCadena;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ServiciosCadena sc = new ServiciosCadena();
        cadena c1 = new cadena();
        System.out.println("Ingresa una frase");
        c1.setFrase(leer.nextLine());


        int longitud = c1.getFrase().length();
        int vocales = c1.mostrarVocales();

        System.out.println("La longitud de la palabra es: " + longitud);
        System.out.println("La cantidad de vocales en la frase son: " + vocales);
        System.out.println(c1.invertirFrase());
        System.out.println("Ingresa una letra para ver si esta repetida: ");
        c1.vecesRepetido(leer.nextLine());
        System.out.println("Ingresa una frase para comparar la longitud con la primera: ");
        c1.comparaLongitud(leer.nextLine());

        System.out.println("Ingresa una frase para unirla con la anterior: ");
        c1.unirFrase(leer.nextLine());


        System.out.println("Ingresa la letra que quieras reemplazar por la > a < en la primera frase");
        c1.reemplazarLetra(leer.nextLine());

        System.out.println("Ingresa una letra para ver si esta dentro de la frase");
        c1.contiene(leer.nextLine());


    }
}
