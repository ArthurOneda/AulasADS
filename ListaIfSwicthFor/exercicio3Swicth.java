package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio3Swicth {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o código do produto");
		int num = info.nextInt();
		switch (num) {
		case 1:
			System.out.println("Alimento não-perecível");
			break;
		case 2:
			System.out.println("Alimento perecível");
			break;
		case 3:
			System.out.println("Vestuário");
			break;
		case 4:
			System.out.println("Limpeza");
			break;
		default:
			System.out.println("Código Inválido");
			break;
		}
		info.close();
	}

}
