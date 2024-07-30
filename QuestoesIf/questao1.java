package QuestoesIf;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = info.next();
		System.out.println("Está chovendo hoje?");
		boolean clima = info.next().toLowerCase().equals("sim");
		System.out.println("Tem prova hoje?");
		boolean prova = info.next().toLowerCase().equals("sim");
		System.out.println("Olá " + nome);
		if (clima) {
			System.out.println("Hoje está chovendo, melhor levar o guarda-chuva");
		} else {
			System.out.println("Aproveite o dia de sol");
		}
		if (prova) {
			System.out.println("Espero que tenha estuda	do para a avaliação");
		} else {
			System.out.println("Hoje será uma noite tranquila sem provas");
		}
	}

}
