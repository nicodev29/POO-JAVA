package Entidades;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);

    private String nombre;
    public int edad;
    public double peso;
    public double altura;
    public String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, int peso, int altura, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public void getNombre(String s) {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso(double i) {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura(double i) {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void getSexo(String s) {
        String sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void crearPersona (){

        System.out.println("Ingrese sus datos");
        System.out.println("Nombre:");
        setNombre(leer.nextLine());
        System.out.println("Edad: ");
        setEdad(leer.nextInt());
        System.out.println("Peso: ");
        setPeso(leer.nextDouble());
        System.out.println("Altura en cm: ");
        setAltura(leer.nextDouble());
        System.out.println("Sexo: Masculino - Femenino - Otro");
        leer.nextLine();
        setSexo(leer.nextLine());

        System.out.println("Desea añadir algo mas? Escribelo aqui");
        String resp = leer.nextLine();

        System.out.println("Agregaste: " +  resp );

    }

    public double calcularImc (){

        float altura2 = (float) (altura/100);
        float imc;
        imc = (float) (peso/(Math.pow(altura2,2)));

        if (imc < 20){
            return -1;
        } else if (imc >= 20 && imc <= 25 ) {
            return 0;
        } else {
            return 1;
        }
    }

    public int calcularEdad (){

        if (edad >= 18){
            System.out.println(nombre + " es mayor de edad");
        }else {
            System.out.println(nombre + " no es mayor de edad");
        }
       return 0;
    }

}
