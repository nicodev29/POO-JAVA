import java.util.Scanner;

public class MainExtraCinco {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        System.out.println("Adivinando el mes secreto.");

        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[(int)(Math.random()*12)];
        String mesUser;

        do {
            System.out.println("Ingrese un mes en minusculas: ");
            mesUser = leer.nextLine();

            if (mesUser.equals(mesSecreto)) {
                System.out.println("Adivinaste el mes: " + mesSecreto);
            } else {
                System.out.println("No adivinaste, intenta nuevamente");
            }

        } while (!mesUser.equals(mesSecreto));

    }
}

