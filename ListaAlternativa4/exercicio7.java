package ListaAlternativa4;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos números você deseja digitar");
		int qtdE = info.nextInt(), num, somaT = 0;
		for (int i = 0; i < qtdE; i++) {
			System.out.println("Digite um número");
			num = info.nextInt();
			somaT += num;
		}
		System.out.println("Soma Total: " + somaT);
		info.close();
	}

}
