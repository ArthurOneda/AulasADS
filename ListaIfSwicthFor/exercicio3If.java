package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio3If {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o código do produto");
		int num = info.nextInt();
		if (num == 1) {
			System.out.println("Alimento não-perecível");
		} else if (num == 2) {
			System.out.println("Alimento perecível");
		} else if (num == 3) {
			System.out.println("Vestuário");
		} else if (num == 4) {
			System.out.println("Limpeza");
		} else {
			System.out.println("Código Inválido");
		}
		info.close();
	}

}
