public class Main {
    public static void main(String[] args) {

        double [] arrayA = new double[50];
        double [] arrayB = new double[20];

        for (int i = 0 ; i < arrayA.length ; i ++ ){
            arrayA[i] = Math.random()*50+1;
        }

        for (int i = 0 ; i < arrayA.length ; i ++ ){
           for (int j = 0 ; j < arrayA.length; j ++) {
               if (arrayA[i] < arrayA[j]){
                    double aux = arrayA[i];
                    arrayA[i] = arrayA[j];
                    arrayA[j]=aux;
               }
           }
        }

        System.out.println("Arreglo A ordenado con numeros aleatorios");
        System.out.println("");

        for (int i = 0; i < arrayA.length ; i ++){
            System.out.println(arrayA[i]);
        }

        for (int i = 0 ; i < 10 ;i ++){
            arrayB[i] = arrayA[i];
        }

        for (int i = 10 ; i < 20 ; i ++){
            arrayB[i] = 0.5;
        }

        System.out.println("El Segundo arreglo se ve de la siguiente manera: ");
        System.out.println("");

        for (int i = 0 ; i < arrayB.length ; i ++){
            System.out.println(arrayB[i]);
        }

    }
}
