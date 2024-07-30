package ListaAlternativa1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a 1º nota?");
		double n1 = info.nextDouble();
		System.out.println("Digite a 2º nota?");
		double n2 = info.nextDouble();
		System.out.println("Digite a 3º nota?");
		double n3 = info.nextDouble();
		double media = ((n1 * 1) + (n2 * 2) + (n3 * 3)) / 6;
		System.out.println("A média ponderada é " + media);
	}

}
