import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;

public class Ejercicio2 {
    public static void main(String[] args) {

        CircunferenciaServicios cs = new CircunferenciaServicios();
        Circunferencia c1 = cs.radioCircunferencia();

        System.out.println("El area es: " + c1.area());
        System.out.println("El perimetro es: " + c1.perimetro());

    }
}
