package ListaAlternativa2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a inicial do seu sexo:");
		char sexo = info.next().charAt(0);
		if (sexo == 'M') {
			System.out.println("M - Masculino");
		} else if (sexo == 'F') {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo inválido");
		}
	}

}
