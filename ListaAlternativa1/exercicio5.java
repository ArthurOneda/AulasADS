package ListaAlternativa1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual é o preço do litro da gasolina?");
		double valGas = info.nextDouble();
		System.out.println("Qual foi o valor total pago na gasolina?");
		double valTotal = info.nextDouble();
		double qtdL = valTotal / valGas;
		System.out.println("Você abasteceu " + qtdL + " Litros");
	}

}
