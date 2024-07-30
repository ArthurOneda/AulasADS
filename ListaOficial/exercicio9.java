package ListaOficial;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a 1º nota");
		double n1 = info.nextDouble();
		System.out.println("Digite a 2º nota");
		double n2 = info.nextDouble();
		System.out.println("Digite a 3º nota");
		double n3 = info.nextDouble();
		double mdF = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		System.out.println("A média final é " + mdF);
		info.close();
	}

}
