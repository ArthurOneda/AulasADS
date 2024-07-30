package ListaAlternativa1;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos frangos tem na granja?");
		int qtdF = info.nextInt();
		double valAC = qtdF * 4.00;
		double valAL = (qtdF * 3.50) * 2;
		double valT = valAC + valAL;
		System.out.println("Serão gastos " + valT + " reais para identificar todos os frangos");
	}

}
