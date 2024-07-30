package ListaIf;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o valor da compra");
		double compra = info.nextDouble();
		System.out.println("Digite sua idade");
		int idade = info.nextInt();
		if (idade > 0 && idade < 18) {
			compra -= (compra / 100) * 10;
		} else if (idade > 65) {
			compra -= (compra / 100) * 15;
		} else {
			
		}
		System.out.println("O valor final da compra é " + compra);
		info.close();
	}

}
