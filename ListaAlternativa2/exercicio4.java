package ListaAlternativa2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite uma letra");
		char letra = info.next().charAt(0);
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra é uma vogal");
		} else {
			System.out.println("A letra é uma consoante");
		}
	}

}
