package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio1Swicth {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite uma letra");
		char letra = info.next().charAt(0);
		switch (letra) {
		case 'a':
			System.out.println("A letra é vogal");
			break;
		case 'e':
			System.out.println("A letra é vogal");
			break;
		case 'i':
			System.out.println("A letra é vogal");
			break;
		case 'o':
			System.out.println("A letra é vogal");
			break;
		case 'u':
			System.out.println("A letra é vogal");
			break;
		default:
			System.out.println("A letra é consoante");
			break;
		}
		info.close();
	}

}
