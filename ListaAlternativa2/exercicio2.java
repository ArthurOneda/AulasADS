package ListaAlternativa2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = info.nextInt();
		if (num >= 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}
	}

}
