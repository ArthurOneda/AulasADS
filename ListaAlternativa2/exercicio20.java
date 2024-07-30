package ListaAlternativa2;

import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Informe a nota 1");
		nota1 = info.nextDouble();
		System.out.println("Informe a nota 2");
		nota2 = info.nextDouble();
		System.out.println("Informe a nota 3");
		nota3 = info.nextDouble();
		media = (nota1 + nota2 + nota3) / 3;
		if(media == 10) {
			System.out.println("\n Aprovado com Distinção \n Média Final: " + media);
		} else if(media >= 7) {
			System.out.println("\n Aprovado \n Média Final: " + media);
		} else {
			System.out.println("\n Reprovado \n Média Final: " + media);
		}
	}
}