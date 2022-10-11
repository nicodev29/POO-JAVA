import java.util.Scanner;

public class Juego {

    private String [] palabra;
    private int letras_encontradas;
    private int jugadas_maximas;
    private Scanner leer = new Scanner(System.in);

    public Juego() {
    }

    public Juego(String[] palabra, int letras_encontradas, int jugadas_maximas, Scanner leer) {
        this.palabra = palabra;
        this.letras_encontradas = letras_encontradas;
        this.jugadas_maximas = palabra.length;
        this.leer = leer;
    }

    public void crearJuego (){

        System.out.println("Ingrese una palabra:");
        String palabra_ingresada = leer.nextLine();
        palabra = new String[palabra_ingresada.length()];
        letras_encontradas=0;
        System.out.println("Ingrese la cantidad maxima de intentos: ");
        jugadas_maximas = leer.nextInt();
        for (int i = 0 ; i < palabra_ingresada.length() ; i ++ ){
            palabra[i] = palabra_ingresada.substring(i, i+1);
        }
    }

    public void longitud (){
        System.out.println("La longitud de la palabra es: " + palabra.length);
    }

    public void buscar (char letra){

        boolean letra_encontrada = false;

        for (int i = 0 ; i < palabra.length ; i ++ ){
            if (palabra[i].equals(String.valueOf(letra))){
                letra_encontrada = true;
                break;
            }
        }
        if (letra_encontrada){
            System.out.println("La letra se encuentra en la palabra");
        } else {
            System.out.println("No se encuentra le letra");
        }
    }

    public boolean encontradas (char letra) {
        int cantidad_letras_encontradas = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(String.valueOf(letra))) {
                cantidad_letras_encontradas++;
            }
        }
        if (cantidad_letras_encontradas == 0) {
            jugadas_maximas -= 1;
        }
        letras_encontradas += cantidad_letras_encontradas;
        System.out.println("Letras totales encontradas: " + letras_encontradas + " Letras faltantes: "
                + (palabra.length - letras_encontradas));

        return cantidad_letras_encontradas > 0;
    }

    public void intento() {
        System.out.println("Quedan " + jugadas_maximas + " intentos");
    }

    public void juego (){

        crearJuego();
        longitud();
        do {

            System.out.println("Ingrese una letra: ");
            char letra = leer.next().charAt(0);
            buscar(letra);
            encontradas(letra);
            intento();
            System.out.println("----------------------------");
        }while (jugadas_maximas > 0 && letras_encontradas < palabra.length);

        if (letras_encontradas == palabra.length) {
            System.out.println("Ganaste");
        }else {
            System.out.println("Perdiste");
        }
    }
}

