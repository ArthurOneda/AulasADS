package ListaOficial;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		System.out.println("O antecessor de " + num + " é " + (num - 1));
		info.close();
	}

}
