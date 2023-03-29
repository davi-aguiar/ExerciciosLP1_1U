/*Desenvolva uma função que recebe como parâmetro o
mês atual e retorna quantos meses faltam para o final do
ano. */
public class Exc4 {
    public static void main (String[]args ){
        int faltamXMeses = mesesRestantes(5);
        System.out.println("Faltam exatos "+ faltamXMeses+ " meses para o ano acabar");
    }
    public static int mesesRestantes( int x){

    int mesesAno = 12 - x;
    return mesesAno;
    }
}
