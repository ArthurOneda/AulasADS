package ListaAlternativa4;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o número inicial");
		int num = info.nextInt();
		System.out.println("Qual a razão da PA");
		int raz = info.nextInt();
		System.out.println("Quantos elementos você deseja imprimir");
		int qtdE = info.nextInt();
		for (int i = 0; i < qtdE; i++) {
			System.out.println(num);
			num += raz;
		}
		info.close();
	}

}
