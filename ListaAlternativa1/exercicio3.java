package ListaAlternativa1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos pães foram vendidos?");
		int qtdPaes = info.nextInt();
		System.out.println("Quantas broas foram vendidas?");
		int qtdBroa = info.nextInt();
		double valPao = qtdPaes * 0.12;
		double valBroa = qtdBroa * 1.50;
		double valTotal = valBroa + valPao;
		double valPoup = (valTotal / 100) * 10;
		System.out.println("O valor total de vendas foi de R$" + valTotal + " e o valor adicionado a poupança foi de R$" + valPoup);
	}

}
