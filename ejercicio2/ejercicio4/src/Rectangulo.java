import Servicios.ServiciosRectangulo;

public class Rectangulo {
    public static void main(String[] args) {

        ServiciosRectangulo sr = new ServiciosRectangulo();
        Entidades.Rectangulo r1 = sr.moldearRectangulos();


        System.out.println("El perimetro del triangulo es: " + r1.perimetro());
        System.out.println("La superficie del triangulo es: " + r1.superficie());
        r1.dibRectangulo();

    }
}
