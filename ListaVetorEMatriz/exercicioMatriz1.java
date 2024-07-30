package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioMatriz1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int[][] num = new int[5][5];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("Digite um número ");
				num[i][j] = info.nextInt();
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if ((i + j) % 2 == 1) {
					System.out.println(num[i][j]);
				}
			}
		}
		info.close();
	}

}
