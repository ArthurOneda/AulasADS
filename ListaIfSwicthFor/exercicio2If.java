package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio2If {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o conceito do aluno");
		char con = info.next().toUpperCase().charAt(0);
		if (con == 'A') {
			System.out.println("Exelente");
		} else if (con == 'B') {
			System.out.println("Ótimo");
		} else if (con == 'C') {
			System.out.println("Bom");
		} else if (con == 'D') {
			System.out.println("Regular");
		} else if (con == 'E') {
			System.out.println("Ruim");
		} else if (con == 'F') {
			System.out.println("Nos vemos de novo ano que vem...");
		} else {
			System.out.println("Conceito inexistente");
		}
		info.close();
	}

}
