package ListaAlternativa3;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int num, dent = 0, fora = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			num = info.nextInt();
			if (num >= 10 && num <= 20) {
				dent++;
			} else {
				fora++;
			}
		}
		System.out.println("Foram digitados " + dent + " números entre 10 e 20 e " + fora + " números fora desse intervalo");
		info.close();
	}

}
