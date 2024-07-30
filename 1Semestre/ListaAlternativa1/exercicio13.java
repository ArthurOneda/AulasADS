package ListaAlternativa1;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número de 3 dígitos");
		String num = info.next();
		char cent = num.charAt(0);
		char deze = num.charAt(1);
		char unid = num.charAt(2);
		System.out.println("Centena: " + cent);
		System.out.println("Dezena: " + deze);
		System.out.println("Unidade: " + unid);
	}

}
