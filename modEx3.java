/*Desenvolva uma função que recebe o ano de nascimento
do usuário e retorna a sua idade. Faça o cálculo usando o
ano atual. */
public class modEx3 {
    public static void main(String[]args){
        int idade = anoNasc(2002);
        System.out.print("Sua idade é: " + idade);
    }
    public static int anoNasc(int x ){
        int nascimento = 2023 - x;
        return nascimento;
    }

}
