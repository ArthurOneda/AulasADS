package ListaAlternativa1;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas camisas P foram vendidas?");
		int camP = info.nextInt();
		System.out.println("Quantas camisas M foram vendidas?");
		int camM = info.nextInt();
		System.out.println("Quantas camisas G foram vendidas?");
		int camG = info.nextInt();
		int valTotal = (camP * 10) + (camM * 12) + (camG * 15);
		System.out.println("O valor total arrecadado com as vendas foi de R$" + valTotal);
	}

}
