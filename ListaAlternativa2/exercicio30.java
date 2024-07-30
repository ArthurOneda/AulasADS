package ListaAlternativa2;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        String nomeProduto;
        int qtdNoEstoque, qtdComprada;
        System.out.println("Informe o item que você quer comprar");
        nomeProduto = info.next();
        System.out.println("Quanto(a)s " + nomeProduto + " existem no Estoque?");
        qtdNoEstoque = info.nextInt();
        if (qtdNoEstoque == 0) {
            System.out.println("Compra Recusada Produto Esgotado");
        } else {
            System.out.println("Informe a quantidade de " + nomeProduto + " que você deseja comprar");
            qtdComprada = info.nextInt();
            if (qtdComprada > qtdNoEstoque) {
                System.out.println("Compra Recusada por falta no Estoque");
            } else {
                    if(qtdNoEstoque < 10){
                        qtdNoEstoque -= qtdComprada;
                        System.out.println("ALERTA POUCO PRODUTO NO ESTOQUE");
                        System.out.println("Compra Realiza com Sucesso");
                        System.out.println("Quantidade em Estoque " + qtdNoEstoque);
                    } else{
                        qtdNoEstoque -= qtdComprada;
                        System.out.println("Compra Realiza com Sucesso");
                        System.out.println("Quantidade em Estoque " + qtdNoEstoque);
                    }
            }
        }
    }
}