package ListaAlternativa2;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int tipoCarne, qtdCarne, formaPagamento;
        double precoTotal = 0, valorDesconto = 0, precoFinal = 0;
        String carneEscolhida = "", formaPagamentoEscolhida = "";
        System.out.println("Informe a Quantidade de Carne em Kilos Desejada");
        qtdCarne = info.nextInt();
        System.out.println("Informe o tipo da carne \n 1- File Duplo \n 2- Alcatra \n 3- Picanha");
        tipoCarne = info.nextInt();
        System.out.println("Informe a Forma de Pagamento \n 1- Cartão Tabajara \n 2- Débito \n 3- Crédito \n 4- Dinheiro");
        formaPagamento = info.nextInt();
        if (tipoCarne == 1) {
            carneEscolhida = "File Duplo";
        } else if (tipoCarne == 2) {
            carneEscolhida = "Alcatra";
        }
        if (tipoCarne == 3) {
            carneEscolhida = "Picanha";
        }
        if (formaPagamento == 1) {
            formaPagamentoEscolhida = "Cartão Tabajara";
        } else if (formaPagamento == 2) {
            formaPagamentoEscolhida = "Débito";
        } else if (formaPagamento == 3) {
            formaPagamentoEscolhida = "Crédito";
        } else if (formaPagamento == 4) {
            formaPagamentoEscolhida = "Dinheiro";
        }
        if (tipoCarne == 1) {
            if (qtdCarne <= 5) {
                double precoKilo = 4.9;
                precoTotal = qtdCarne * precoKilo;
                if (formaPagamento == 1) {
                    valorDesconto = (precoTotal * 0.05);
                    precoFinal = precoTotal - valorDesconto;
                }
                precoFinal = precoTotal - valorDesconto;
            } else {
                double precoKilo = 5.8;
                precoTotal = qtdCarne * precoKilo;
                if (formaPagamento == 1) {
                    valorDesconto = (precoTotal * 0.05);
                    precoFinal = precoTotal - valorDesconto;
                }
                precoFinal = precoTotal - valorDesconto;
            }
        } else if (tipoCarne == 2) {
            if (qtdCarne <= 5) {
                double precoKilo = 5.9;
                precoTotal = qtdCarne * precoKilo;
                if (formaPagamento == 1) {
                    valorDesconto = (precoTotal * 0.05);
                    precoFinal = precoTotal - valorDesconto;
                }
                precoFinal = precoTotal - valorDesconto;
            } else {
                double precoKilo = 6.8;
                precoTotal = qtdCarne * precoKilo;
                if (formaPagamento == 1) {
                    valorDesconto = (precoTotal * 0.05);
                    precoFinal = precoTotal - valorDesconto;
                }
                precoFinal = precoTotal - valorDesconto;
            }
        } else if (tipoCarne == 3) {
            if (qtdCarne <= 5) {
                double precoKilo = 6.9;
                precoTotal = qtdCarne * precoKilo;
                if (formaPagamento == 1) {
                    valorDesconto = (precoTotal * 0.05);
                    precoFinal = precoTotal - valorDesconto;
                }
                precoFinal = precoTotal - valorDesconto;
            } else {
                double precoKilo = 7.8;
                precoTotal = qtdCarne * precoKilo;
                if (formaPagamento == 1) {
                    valorDesconto = (precoTotal * 0.05);
                    precoFinal = precoTotal - valorDesconto;
                }
                precoFinal = precoTotal - valorDesconto;
            }
        }
        System.out.println("Tipo de Carne: " + carneEscolhida);
        System.out.println("Quantidade de Carne: " + qtdCarne + "Kg");
        System.out.println("Preço Total: R$" + precoTotal);
        System.out.println("Forma de Pagamento: " + formaPagamentoEscolhida);
        System.out.println("Valor do Desconto: R$" + valorDesconto);
        System.out.println("Valor Final: R$" + precoFinal);
    }
}