package ListaAlternativa1;

import java.util.Scanner;

public class exercicio29 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o valor do produto: ");
        double valorProduto = info.nextDouble();
        double valorFinal = valorProduto - ((valorProduto * 10) / 100);
        System.out.println("O valor do produto com desconto é: R$" + valorFinal);
    }
}
