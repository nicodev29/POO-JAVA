package Entidades;

import java.util.Scanner;

public class cadena {

    Scanner cadena = new Scanner(System.in);
    public String frase;

    public cadena() {
    }

    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    @Override
    public String toString() {
        return "cadena{" +
                "frase='" + frase + '\'' +
                '}';
    }

    public int mostrarVocales (){
        int cont = 0;

        for (int i = 0 ; i < getFrase().length() ; i++) {
            if
            (getFrase().charAt(i)  ==  'a' ||
                    getFrase().charAt(i)    ==  'e' ||
                    getFrase().charAt(i)    ==  'i' ||
                    getFrase().charAt(i)    ==  'o' ||
                    getFrase().charAt(i)    ==  'u' )
            {
                cont++;
            }
        }
        return cont;
    }

    public String invertirFrase () {
        String a = "";
        int cont = 0;
        char[] invertido = getFrase().toCharArray();

        for (cont = frase.length() -1 ; cont >= 0; cont--) {
            System.out.print(invertido[cont]);
        }
        return "";
    }

    public String vecesRepetido (String letra){

        int cont = 0;
        int pos = 0;


        pos = getFrase().indexOf(letra);

        while (pos != -1 ){
            cont++;
            pos = getFrase().indexOf(letra, pos+1);
        }

        System.out.println("La " + letra + " se repitio " + cont + " veces");
        return "";
    }

    public String comparaLongitud (String frase2){

    if (getFrase().length() > frase2.length() ){
        System.out.println("La longitud de la primera frase es mas grande");
    }else {
        System.out.println("La longitud de la segunda frase es mas grande");
    }
        return "";
    }

    public String unirFrase (String frase3){

        String nuevaFrase = getFrase() + frase3;
        System.out.println("La nueva frase es" );
        System.out.println(nuevaFrase);
        return nuevaFrase;
    }

    public String reemplazarLetra (String letra2){

        String nuevaFrase2;
        nuevaFrase2 = getFrase().replace("a",letra2);
        System.out.println("La frase nueva ahora se ve asi " + nuevaFrase2);
        return "";
    }

    public String contiene (String letra3){

        if (getFrase().equals(letra3)){
            System.out.println("La frase contiene la letra ingresada: " + letra3);
        }else {
            System.out.println("La letra que ingresaste no esta en la frase");
        }

        return "";
    }

}


