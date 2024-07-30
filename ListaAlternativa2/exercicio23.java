package ListaAlternativa2;

import java.util.Scanner;

public class exercicio23 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		double num = info.nextDouble();
		if (num == Math.round(num)) {
			System.out.println("O número é inteiro");
		} else {
			System.out.println("O número é decimal");
		}
	}
}