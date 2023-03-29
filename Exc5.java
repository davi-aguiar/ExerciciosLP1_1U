/*Desenvolva uma função que recebe como parâmetros o
dia do mês, o mês e o ano e retorna quantos dias faltam
para o final do mês. Lembrem que os meses que têm 28,
29, 30 ou 31 dias. */
public class Exc5 {
    public static void main( String [] args ){
        int faltamDias = diasFinalAno(1, 12, 2023);
        System.out.print(faltamDias+ "dias para o fim do mês");

    }
public static int diasFinalAno(int dia, int mes, int ano){
    int dias = 0;
   
    if(mes == 2 )
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) { // Ano bissexto
        dias = 29 - dia;
    } else{
        dias = 28 - dia;
    }
    else if(mes == 4 ||mes == 6 || mes == 9 || mes ==11){
        dias = 30 - dia;
    }else {
        dias = 31 - dia;
      }        

    int  diasF = dias - dia;

    return diasF;

    }
}

