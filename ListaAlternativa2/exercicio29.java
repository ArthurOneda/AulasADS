package ListaAlternativa2;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double valorEmprestimo, rendaMensal;
        int qtdPontos;
        System.out.println("Informe o valor do emprestimo");
        valorEmprestimo = info.nextDouble();
        if(valorEmprestimo <= 10000){
            System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
        } else if(valorEmprestimo <= 50000){
            System.out.println("Informe a sua Pontuação de Crédito");
            qtdPontos = info.nextInt();
            if(qtdPontos >= 10000){
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
            } else {
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado pela falta de Pontuação");
            }
        } else if(valorEmprestimo > 50000) {
            System.out.println("Informe a sua Pontuação de Crédito");
            qtdPontos = info.nextInt();
            if(qtdPontos >= 10000){
                System.out.println("Informe a sua Renda Mensal");
                rendaMensal = info.nextDouble();
                if(rendaMensal > 5000){
                    System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
                }  else {
                    System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado por Renda Mensal Insuficiente");
                }
            } else {
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado pela falta de Pontuação");
            }
        }
    }
}