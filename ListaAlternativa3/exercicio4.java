package ListaAlternativa3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		info.close();
	}

}
