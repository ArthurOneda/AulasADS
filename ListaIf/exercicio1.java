package ListaIf;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número entre 0 e 200");
		int num = info.nextInt();
		if (num >= 0 && num <= 200) {
			System.out.println("O número é " + num + " e acrescentando 30% ele é " + (num + ((num/100)*30)));
		}
		info.close();
	}

}
