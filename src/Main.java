public class Main {

    public static void main(String[] args){
        System.out.println(suma(1 ,2, 4) );

        Coche miCoche = new Coche();
        miCoche.incrementar_puertas();
        System.out.println(miCoche.numero_de_puertas);

    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }

}

class Coche {
    int numero_de_puertas = 2;

    public void incrementar_puertas(){
        this.numero_de_puertas++;
    }
}