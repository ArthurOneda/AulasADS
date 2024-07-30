package ListaFor;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos números deseja digitar?");
		int tam = info.nextInt(), qtdI = 0, qtdP = 0, soma = 0;
		for (int i = 0; i < tam; i++) {
			System.out.println("Digite um número");
			int num = info.nextInt();
			if (num >= 0) {
				qtdP++;
			}
			if (num % 2 == 1) {
				qtdI++;
			}
			soma += num;
		}
		double media = soma / tam;
		info.close();
		System.out.println("Números Ímpares: " + qtdI + "\nNúmeros Positivos: " + qtdP + "\nMédia: " + media);
	}

}
