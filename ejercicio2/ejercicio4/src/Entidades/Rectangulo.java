package Entidades;

public class Rectangulo {

    private float base;
    private float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;

    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double superficie() {
        return (this.getBase() * this.getAltura());

    }

    public double perimetro() {
        return (this.getBase() + this.getAltura() * 2);
    }

    public int dibRectangulo(){

        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= altura; j++) {
                if(j==1||j==altura||i==1||i==base){
                    System.out.print("*");

                } else{
                    System.out.print(" ");
                }
            } System.out.println();
        }
        return 0;
    }
}


