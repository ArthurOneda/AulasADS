package ListaAlternativa4;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas idade você deseja digitar");
		int qtdE = info.nextInt(), num, qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0;
		for (int i = 0; i < qtdE; i++) {
			System.out.println("Digite uma idade");
			num = info.nextInt();
			if (num >= 0 && num < 18) {
				qtd1++;
			} else if (num >= 18 && num < 36) {
				qtd2++;
			} else if (num >= 36 && num < 51) {
				qtd3++;
			} else if (num >= 51 && num <= 65) {
				qtd4++;
			} else {
				qtd5++;
			}
		}
		System.out.println("Porcentagem de pessoas com idade entre 0-17: " + ((qtd1 * 100) / qtdE) + "%\nPorcentagem de pessoas com idade entre 18-35: " + ((qtd2 * 100) / qtdE) + "%\nPorcentagem de pessoas com idade entre 36-50: " + ((qtd3 * 100) / qtdE) + "%\nPorcentagem de pessoas com idade entre 51-65: " + ((qtd4 * 100) / qtdE) + "%\nPorcentagem de pessoas com idade maior que 65: " + ((qtd5 * 100) / qtdE) + "%");
		info.close();
	}

}
