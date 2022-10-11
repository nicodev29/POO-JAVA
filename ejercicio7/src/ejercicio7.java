import Entidades.Persona;
import Servicios.PersonaServicios;

public class ejercicio7 {
    public static void main(String[] args) {

        int cont = 0,bajo = 0,ideal = 0,alto = 0;

        PersonaServicios ps = new PersonaServicios();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();


        System.out.println("Persona 1");
        p1.crearPersona();
        p1.calcularImc();
        p1.calcularEdad();
        if (p1.edad >= 18){
            cont=cont+1;
        }
        if (p1.calcularImc() == -1 ){
            System.out.println("Estas debajo de tu peso");
        } else if (p1.calcularImc() == 0) {
            System.out.println("Estas en tu peso ideal");} else if (p1.calcularImc() == 1) {
            System.out.println("Estas con sobrepeso, cuidado!!");
        }
        if (p1.calcularImc() == -1){
            bajo =bajo +1;
        } else if (p1.calcularImc() == 0) {
            ideal = ideal+1;
        } else if (p1.calcularImc() == 1) {
            alto = alto+1;
        }


        System.out.println();
        System.out.println("Persona 2");
        p2.crearPersona();
        p2.calcularImc();
        p2.calcularEdad();
        if (p2.edad >= 18){
            cont=cont+1;
        }
        if (p2.calcularImc() == -1 ){
            System.out.println("Estas debajo de tu peso");
        } else if (p2.calcularImc() == 0) {
            System.out.println("Estas en tu peso ideal");
        } else if (p2.calcularImc() == 1) {
            System.out.println("Estas con sobrepeso, cuidado!!");
        }
        if (p2.calcularImc() == -1){
            bajo =bajo +1;
        } else if (p2.calcularImc() == 0) {
            ideal = ideal+1;
        } else if (p2.calcularImc() == 1) {
            alto = alto+1;
        }


        System.out.println();
        System.out.println("Persona 3");
        p3.crearPersona();
        p3.calcularImc();
        p3.calcularEdad();
        if (p3.edad >= 18){
            cont=cont+1;
        }
        if (p3.calcularImc() == -1 ){
            System.out.println("Estas debajo de tu peso");
        } else if (p3.calcularImc() == 0) {
            System.out.println("Estas en tu peso ideal");
        } else if (p3.calcularImc() == 1) {
            System.out.println("Estas con sobrepeso, cuidado!!");
        }
        if (p3.calcularImc() == -1){
            bajo =bajo +1;
        } else if (p3.calcularImc() == 0) {
            ideal = ideal+1;
        } else if (p3.calcularImc() == 1) {
            alto = alto+1;
        }

        System.out.println();
        System.out.println("Persona 4");
        p4.crearPersona();
        p4.calcularImc();
        p4.calcularEdad();
        if (p4.edad >= 18){
            cont=cont+1;
        }
        if (p4.calcularImc() == -1 ){
            System.out.println("Estas debajo de tu peso");
        } else if (p4.calcularImc() == 0) {
            System.out.println("Estas en tu peso ideal");
        } else if (p4.calcularImc() == 1) {
            System.out.println("Estas con sobrepeso, cuidado!!");
        }
        if (p4.calcularImc() == -1){
            bajo =bajo +1;
        } else if (p4.calcularImc() == 0) {
            ideal = ideal+1;
        } else if (p4.calcularImc() == 1) {
            alto = alto+1;
        }


        if (cont == 4){
            System.out.println("El 100% de las personas son mayores");
        } else if (cont ==3) {
            System.out.println("El 75% de las personas son mayores");
        } else if (cont ==2) {
            System.out.println("El 50% de las personas son mayores");
        }else if (cont == 1){
            System.out.println("El 25% de las personas son mayores");
        }else {
            System.out.println("Ninguna persona es mayor");
        }
        if (ideal == 4){
            System.out.println("Todas las personas estan en el peso ideal");
        } else if (ideal == 3) {
            System.out.println("El 75% de las personas estan en el peso ideal");
        } else if (ideal == 2 ) {
            System.out.println("El 50% de las personas estan en el peso ideal");
        } else if (ideal == 1) {
            System.out.println("El 25% de las personas estan en el peso ideal");
        } else {
            System.out.println("Nadie esta en su peso ideal");
        }


    }
}
