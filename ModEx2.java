/*Desenvolva uma função que recebe dois números inteiros
como parâmetro, e retorna o resto da divisão do primeiro
parâmetro pelo segundo. */

public class ModEx2 {
    public static void main (String [] args){
        int resultado = divisao(8,2);
        System.out.print("O resultado: " + resultado);
    }
    public static int divisao (int a, int b){
        int dividir = a % b ;
        return dividir ;
    }
}
