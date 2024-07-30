package ListaAlternativa2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o 1º numero:");
		int num1 = info.nextInt();
		System.out.println("Digite o 2º numero:");
		int num2 = info.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " é o maior número");
		} else if (num2 > num1) {
			System.out.println(num2 + " é o maior número");
		} else {
			System.out.println("Os números são iguais");
		}
	}

}
