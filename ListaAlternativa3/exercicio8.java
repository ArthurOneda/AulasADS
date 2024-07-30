package ListaAlternativa3;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num, neg = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			num = info.nextInt();
			if (num < 0) {
				neg++;
			}
		}
		System.out.println("Foram digitados " + neg + " números negativos");
		info.close();
	}

}
