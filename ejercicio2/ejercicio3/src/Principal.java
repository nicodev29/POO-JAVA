import Entidades.Operacion;
import Servicios.ServiciosOperacion;

public class Principal {

    public static void main(String[] args) {

        ServiciosOperacion so = new ServiciosOperacion();
        Operacion o1 = so.crearOperacion();

        System.out.println("La suma de los numeros ingresados es: " + o1.sumar());
        System.out.println("La resta de los numeros ingresados es: " + o1.restar());
        System.out.println("Multiplicacion: " + o1.multiplicar());
        System.out.println("Division: " + o1.dividir());
    }
}
