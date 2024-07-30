package ListaAlternativa3;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num, soma = 0;
		double media;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			num = info.nextInt();
			soma += num;
		}
		media = soma / 10;
		System.out.println("A média é " + media);
		info.close();
	}

}
