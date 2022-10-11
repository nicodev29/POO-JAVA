package Entidades;

public class Circunferencia {

    private double radio;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {this.radio = radio;}

    @Override
    public String toString() {
        return "Circunferencia{" +
                "radio=" + radio +
                '}';
    }

  public float area (){
        return (float) (Math.pow(this.radio,2)*3.14);
  }

  public float perimetro (){
        return (float) (Math.pow(3.14,2)*this.radio);
  }

}

