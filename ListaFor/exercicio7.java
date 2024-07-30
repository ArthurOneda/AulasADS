package ListaFor;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos números você irá informar");
		int tam = info.nextInt(), qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0;
		for (int i = 0; i < tam; i++) {
			System.out.println("Digite um número");
			int num = info.nextInt();
			if (num >= 0 && num <= 25) {
				qtd1++;
			} else if (num >= 26 && num <= 50) {
				qtd2++;
			} else if (num >= 51 && num <= 75) {
				qtd3++;
			} else if (num >= 76 && num <= 100) {
				qtd4++;
			}
		}
		info.close();
		System.out.println("Quantidade de números entre 0 e 25: " + qtd1 + "\nQuantidade de números entre 26 e 50: " + qtd2 + "\nQuantidade de números entre 51 e 75: " + qtd3 + "\nQuantidade de números entre 76 e 100: " + qtd4);
	}

}
