package ListaAlternativa2;

import java.util.Scanner;

public class exercicio14 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		String conceito;
		String status;
		System.out.println("Informe a nota 1");
		nota1 = info.nextDouble();
		System.out.println("Informe a nota 2");
		nota2 = info.nextDouble();
		media = (nota1 + nota2) / 2;
		if(media <= 4) {
			conceito = "E";
			status = "Reprovado";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 6) {
			conceito = "D";
			status = "Reprovado";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 7.5) {
			conceito = "C";
			status = "APROVADO";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else if(media <= 9) {
			conceito = "B";
			status = "APROVADO";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		} else {
			conceito = "A";
			status = "APROVADO";
			System.out.println("\n Nota 1: " + nota1 + "\n Nota 2: " + nota2 + "\n Média: " + media + "\n Conceito: " + conceito + "\n Status: " + status);
		}

	}
}