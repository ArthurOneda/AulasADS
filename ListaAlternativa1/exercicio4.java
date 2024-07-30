package ListaAlternativa1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = info.next();
		System.out.println("Quantos anos você tem?");
		int ano = info.nextInt();
		int dia = ano * 365;
		System.out.println(nome + " você já viveu " + dia + " dias");
	}

}
