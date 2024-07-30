package ListaAlternativa4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}
		info.close();
	}

}
