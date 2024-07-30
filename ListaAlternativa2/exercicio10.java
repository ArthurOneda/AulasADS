package ListaAlternativa2;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite:\nM - Matutino\nV - Vespertino\nN - Noturno");
		char op = info.next().charAt(0);
		switch (op) {
		case 'M':
			System.out.println("Bom Dia");
			break;
		case 'V':
			System.out.println("Boa Tarde");
			break;
		case 'N':
			System.out.println("Boa Noite");
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
	}

}
