package ListaAlternativa3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Digite um número");
			num = info.nextInt();
		} while (num == 0);
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		info.close();
	}

}
