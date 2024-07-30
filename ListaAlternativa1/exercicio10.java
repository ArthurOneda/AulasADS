package ListaAlternativa1;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o valor de X do 1º ponto");
		int x1 = info.nextInt();
		System.out.println("Digite o valor de X do 2º ponto");
		int x2 = info.nextInt();
		System.out.println("Digite o valor de Y do 1º ponto");
		int y1 = info.nextInt();
		System.out.println("Digite o valor de Y do 2º ponto");
		int y2 = info.nextInt();
		double xy = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		double resp = Math.sqrt(xy);
		System.out.println("A distância entre os pontos é " + resp);
	}

}
