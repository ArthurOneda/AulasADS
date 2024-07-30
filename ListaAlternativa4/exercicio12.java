package ListaAlternativa4;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite nove valores");
		int num[] = new int[9], difI, difD;
		boolean valid = false;
		for (int i = 0; i < 9; i++) {
			num[i] = info.nextInt();
		}
		difI = num[1] - num[0];
		for (int i = 1; i < 9; i++) {
			difD = num[i] - num[i - 1];
			if (difD != difI) {
				valid = true;
			}
		}
		if (valid) {
			System.out.println("Não é uma progressão aritmética");
		} else {
			System.out.println("É uma progressão aritmética");
		}
		info.close();
	}

}
