package ListaAlternativa1;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos dias a empresa está sem acidentes");
		double dias = info.nextDouble();
		double meses = dias / 30;
		double anos = dias / (30 * 12);
		System.out.println("A empresa está a " + dias + " dias sem um acidente\nA empresa está a " + meses + " meses sem um acidente\nAempresa está a " + anos + " anos sem um acidente");
	}

}
