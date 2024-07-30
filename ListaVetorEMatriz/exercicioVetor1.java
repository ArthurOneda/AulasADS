package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioVetor1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite um número");
			num[i] = info.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + " se encontra na " + i + "º posição do vetor");
			}
		}
		info.close();
	}

}
