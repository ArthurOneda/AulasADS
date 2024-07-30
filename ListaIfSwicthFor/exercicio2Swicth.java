package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio2Swicth {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o conceito do aluno");
		char con = info.next().toUpperCase().charAt(0);
		switch (con) {
		case 'A':
			System.out.println("Exelente");
			break;
		case 'B':
			System.out.println("Ótimo");
			break;
		case 'C':
			System.out.println("Bom");
			break;
		case 'D':
			System.out.println("Regular");
			break;
		case 'E':
			System.out.println("Ruim");
			break;
		case 'F':
			System.out.println("Nos vemos de novo ano que vem...");
			break;
		default:
			System.out.println("Conceito inexistente");
			break;
		}
		info.close();
	}

}
