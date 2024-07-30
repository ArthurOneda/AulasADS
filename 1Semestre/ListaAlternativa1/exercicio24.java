package ListaAlternativa1;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos litros do refresco serão produzidos?");
		double rfsc = info.nextDouble();
		double qtdA = (rfsc / 10) * 8;
		double qtdS = (rfsc / 10) * 2;
		System.out.println("Serão necessários " + qtdA + " litors de água e " + qtdS + " litros de suco para fazer o refresco");
	}

}
