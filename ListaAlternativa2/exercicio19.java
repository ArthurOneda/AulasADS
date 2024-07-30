package ListaAlternativa2;

import java.util.Scanner;

public class exercicio19 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número");
		int num = info.nextInt();
		char cent, deze, uni;
		String numero = num + "";
		if (num >= 100) {
			cent = numero.charAt(0);
			deze = numero.charAt(1);
			uni = numero.charAt(2);
			System.out.println("Centenas: " + cent + "\nDezenas: " + deze + "\nUnidades: " + uni);
		} else if (num >= 10 && num < 100) {
			deze = numero.charAt(0);
			uni = numero.charAt(1);
			System.out.println("Dezenas: " + deze + "\nUnidades: " + uni);
		} else {
			uni = numero.charAt(0);
			System.out.println("Unidades: " + uni);
		}
	}
}