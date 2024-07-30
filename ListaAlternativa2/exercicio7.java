package ListaAlternativa2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número");
			num[i] = info.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[0] + " é o menor número");
		System.out.println(num[2] + " é o maior número");
	}

}
