package ListaAlternativa1;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o salário atual do funcionário?");
		double salI = info.nextDouble();
		double salA = salI + ((salI / 100) * 15);
		double salD = salA - ((salA / 100) * 8);
		System.out.println("Salário Inicial: R$" + salI);
		System.out.println("Salário com Aumento: R$" + salA);
		System.out.println("Salário Final: R$" + salD);
	}

}
