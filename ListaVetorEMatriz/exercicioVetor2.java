package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioVetor2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		String[] nome = new String[5];
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite um nome");
			nome[i] = info.next();
		}
		for (int i = 4; i > nome.length && i >= 0; i--) {
			System.out.println(nome[i]);
		}
		info.close();
	}

}
