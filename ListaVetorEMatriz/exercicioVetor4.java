package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioVetor4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int[] A = new int[8];
		int[] B = new int[8];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um número");
			A[i] = info.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = A[i] * 3;
			System.out.println(B[i]);
		}
		info.close();
	}

}
