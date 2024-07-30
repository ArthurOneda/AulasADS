package ListaIf;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o seu salário");
		double salario = info.nextDouble();
		System.out.println("Digite o valor do empréstimo");
		double empres = info.nextDouble();
		System.out.println("E em quantas parcelas");
		int qtdParc = info.nextInt();
		double valParc = empres / qtdParc;
		if (((salario / 100) * 30) < valParc) {
			System.out.println("Crédito negado");
		} else {
			System.out.println("Crédito Aprovado\nValor Empréstimo: " + empres + "\nQuantidade de Parcelas: " + qtdParc + "\nValor da Parcela: " + valParc);
		}
		info.close();
	}

}
