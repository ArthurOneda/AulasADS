package ListaAlternativa1;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas moedas de 1 centavo tem no cofre?");
		int qtd1c = info.nextInt();
		System.out.println("Quantas moedas de 5 centavos tem no cofre?");
		int qtd5c = info.nextInt();
		System.out.println("Quantas moedas de 10 centavos tem no cofre?");
		int qtd10c = info.nextInt();
		System.out.println("Quantas moedas de 25 centavos tem no cofre?");
		int qtd25c = info.nextInt();
		System.out.println("Quantas moedas de 50 centavos tem no cofre?");
		int qtd50c = info.nextInt();
		System.out.println("Quantas moedas de 1 real tem no cofre?");
		int qtd1r = info.nextInt();
		double valTot = (qtd1c * 0.01) + (qtd5c * 0.05) + (qtd10c * 0.10) + (qtd25c * 0.25) + (qtd50c * 0.5) + qtd1r;
		System.out.println("Ele poupou " + valTot + " reais");
	}

}
