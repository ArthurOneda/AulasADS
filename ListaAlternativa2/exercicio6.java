package ListaAlternativa2;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int n1 = info.nextInt();
		System.out.println("Digite outro número");
		int n2 = info.nextInt();
		System.out.println("Digite outro número");
		int n3 = info.nextInt();
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " é o maior número");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " é o maior número");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " é o maior número");
		} else {
			System.out.println("Os números são iguais");
		}
	}

}
