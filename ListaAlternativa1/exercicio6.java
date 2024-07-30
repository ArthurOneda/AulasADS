package ListaAlternativa1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o valor do prato");
		double valPrato = info.nextDouble();
		double peso = valPrato / 12;
		System.out.println("O prato tem " + peso + " quilos");
	}

}
