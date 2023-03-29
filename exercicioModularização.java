
public class exercicioModularização{ 

    public static void main( String [] args ){
        double calcularMedia = mediaAluno(8,0,10);
        System.out.print("Sua nota é: " + calcularMedia);

    }
   public static double mediaAluno (double a, double b, double c){

    double media = (a + b + c) /3 ;

    return media;

    }

}