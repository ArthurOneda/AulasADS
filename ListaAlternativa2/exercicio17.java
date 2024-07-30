package ListaAlternativa2;

import java.util.Scanner;

public class exercicio17 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int ano;
		System.out.println("Informe em que ano estamos");
		ano = info.nextInt();
		if(ano % 4 == 0) {
			System.out.println("Ano é Bissexto");
		} else {
			System.out.println("Ano não é Bissexto");
		}
	}
}