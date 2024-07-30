package ListaAlternativa2;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[3];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número");
			num[i] = info.nextInt();
		}
		Arrays.sort(num);
		for (int j = (num.length - 1); j >= 0; j--) {
			System.out.println(num[j]);
		}
	}

}
