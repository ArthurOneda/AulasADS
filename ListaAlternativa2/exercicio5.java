package ListaAlternativa2;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a 1º nota");
		double n1 = info.nextDouble();
		System.out.println("Digite a 2º nota");
		double n2 = info.nextDouble();
		double media = (n1 + n2) / 2;
		if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}

}
