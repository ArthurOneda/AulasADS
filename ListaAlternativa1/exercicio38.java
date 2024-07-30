package ListaAlternativa1;

import java.util.Scanner;

public class exercicio38 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = info.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = info.nextInt();
        int idadeAtual = anoAtual - anoNascimento;
        int idadeMes = idadeAtual * 12;
        int idadeDias = idadeMes * 365;
        int idadeSemanas = idadeAtual*12*4;
        System.out.println("A idade atual é: " + idadeAtual + " anos");
        System.out.println("A idade em meses é: " + idadeMes + " meses");
        System.out.println("A idade em semanas é: " + idadeSemanas + " semanas");
        System.out.println("A idade em dias é: " + idadeDias + " dias");
    }
}
