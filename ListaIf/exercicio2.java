package ListaIf;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = info.nextInt();
		if (idade >= 0 && idade <= 12) {
			System.out.println("Criança");
		} else if (idade >= 13 && idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto");
		} else if (idade >= 60) {
			System.out.println("Idoso");
		} else {
			System.out.println("Idade inválida");
		}
		info.close();
	}

}
