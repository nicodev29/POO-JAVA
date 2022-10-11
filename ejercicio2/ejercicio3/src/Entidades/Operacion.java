package Entidades;

public class Operacion {

    private int numero1;
    private int numero2;


    public Operacion() {
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public Operacion(int numero1) {this.numero1 = numero1;}

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }


    public int sumar(){

    return (this.getNumero1()+this.getNumero2());

    }

    public int restar (){

    return (this.getNumero1()-this.getNumero2());

    }

    public double multiplicar (){

        if (this.getNumero1() == 0 || this.getNumero2() == 0 ){
            System.out.println("Error en la operacion, ingreso cero.");
            return (0);
        } else {
            return (this.getNumero1()*this.getNumero2());
        }

    }

    public double dividir (){

        if (this.getNumero1() == 0 || this.getNumero2() == 0 ){
            System.out.println("Error en la operacion, ingreso cero.");
            return (0);
        } else {
            return (this.getNumero1()/this.getNumero2());
        }

    }


}
