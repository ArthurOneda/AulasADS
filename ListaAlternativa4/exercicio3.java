package ListaAlternativa4;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		for (int i = 1; i <= 10; i++) {
			int result = i * num;
			if (result % 2 == 0) {
				System.out.println(i + " x " + num + " = " + result);
			}
		}
		info.close();
	}

}
