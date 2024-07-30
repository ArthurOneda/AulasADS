package ListaOficial;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a quantidade de eleitores");
		int numE = info.nextInt();
		System.out.println("Digite a quantidade de eleitores que votaram em branco");
		int vtB = info.nextInt();
		System.out.println("Digite a quantidade de eleitores que anularam o voto");
		int vtN = info.nextInt();
		System.out.println("Digite a quantidade de eleitores que tiveram seus votos validados");
		int vtV = info.nextInt();
		double percB = (vtB * 100) / numE;
		double percN = (vtN * 100) / numE;
		double percV = (vtV * 100) / numE;
		System.out.println("O percentual de eleitores que votaram em branco foi de " + percB
				+ "\nO percentual de eleitores que anularam o voto foi de " + percN
				+ "\nO percentual de eleitores que tiverm seus votos validados foi de " + percV);
		info.close();
	}

}
