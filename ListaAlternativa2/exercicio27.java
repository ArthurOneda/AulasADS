package ListaAlternativa2;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double precoMorango = 2.5, precoMaca = 1.8, qtdMorango, qtdMaca;
        System.out.println("Informe a Quantidade em Kilos de Morango");
        qtdMorango = info.nextDouble();
        System.out.println("Informe a Quantidade em Kilos de Maca");
        qtdMaca = info.nextDouble();
        double pesoTotal = qtdMorango + qtdMaca;
        double precoFinal = (qtdMorango * precoMorango) + (qtdMaca * precoMaca);
        if(pesoTotal >= 8 || precoFinal >= 25){
            precoFinal = precoFinal - (precoFinal * 0.1);
        }
        System.out.println("Preço Final: R$" + precoFinal);
    }
}