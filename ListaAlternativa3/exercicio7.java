package ListaAlternativa3;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10");
		int num = info.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x  " + i + " = " + (i * num));
		}
		info.close();
	}

}
