package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio1If {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite uma letra");
		char letra = info.next().charAt(0);
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra é vogal");
		} else {
			System.out.println("A letra é consoante");
		}
		info.close();
	}

}
