package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioMatriz2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int[][] num = new int[5][5];
		int col;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = i + j;
			}
		}
		System.out.println("Qual coluna você deseja consultar? ");
		col = info.nextInt();
		for (int i = 0; i < num[col].length; i++) {
			System.out.println(num[col][i]);
		}
		info.close();
	}

}
