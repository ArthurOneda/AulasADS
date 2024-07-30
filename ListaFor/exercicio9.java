package ListaFor;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num[] = new int[6];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número");
			num[i] = info.nextInt();
		}
		Arrays.sort(num);
		System.out.println("O maior valor é " + num[5] + "\nO menor valor é " + num[0]);
		info.close();
	}

}
