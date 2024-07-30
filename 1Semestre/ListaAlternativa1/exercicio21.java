package ListaAlternativa1;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas garrafas de 350ml foram compradas?");
		int qtdP = info.nextInt();
		System.out.println("Quantas garrafas de 600ml foram compradas?");
		int qtdM = info.nextInt();
		System.out.println("Quantas garrafas de 2L foram compradas?");
		int qtdG = info.nextInt();
		double totL = (qtdP * 0.35) + (qtdM * 0.6) + (qtdG * 2);
		System.out.println("Foram comprados " + totL + " litros de refrigerante");
	}

}
