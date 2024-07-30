package ListaAlternativa2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o preço do " + (i + 1) + "º produto");
			num[i] = info.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[0] + " reais é o perço do produto mais barato");
	}

}
