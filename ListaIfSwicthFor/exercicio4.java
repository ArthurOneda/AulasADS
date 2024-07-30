package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual é o número do mês que deseja conferir");
		int num = info.nextInt();
		if (num == 2) {
			System.out.println("Esse mês tem 28 dias");
		} else if (num == 4 || num == 6 || num == 9 || num == 11) {
			System.out.println("Esse mês tem 30 dias");
		} else if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
			System.out.println("Esse mês tem 31 dias");
		} else {
			System.out.println("Número inválido");
		}
		info.close();
	}

}
