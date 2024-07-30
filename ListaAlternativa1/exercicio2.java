package ListaAlternativa1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos cavalos foram comprados?");
		int qtdCavalos = info.nextInt();
		int qtdFerr = qtdCavalos * 4;
		System.out.println("Serão utilizadas " + qtdFerr + " ferraduras");
	}

}
