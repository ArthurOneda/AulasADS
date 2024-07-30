package ListaOficial;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o preço de fábrica do carro");
		int valFabrica = info.nextInt();
		double percD = (valFabrica / 100) * 28;
		double percI = (valFabrica / 100) * 45;
		double precoFinal = valFabrica + percD + percI;
		System.out.println("O preço final do carro é " + precoFinal);
		info.close();
	}

}
