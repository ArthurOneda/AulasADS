package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioVetor3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número");
			num[i] = info.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				System.out.println(num[i]);
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		info.close();
	}

}
