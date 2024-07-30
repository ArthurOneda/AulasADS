package ListaAlternativa1;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas horas normais o funcionário trabalhou?");
		int qtdH = info.nextInt();
		System.out.println("Quantas horas extras o funcionário trabalhou?");
		int qtdHe = info.nextInt();
		int salB = (qtdH * 10) + (qtdHe * 15);
		int salL = salB - ((salB / 100) * 10);
		System.out.println("Salário Bruto: R$" + salB + "\nSalário Líquido: R$" + salL);
	}

}
