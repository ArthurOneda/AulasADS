package ListaAlternativa2;

import java.util.Scanner;

public class exercicio22 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = info.nextInt();
		if(valor % 2 == 0) {
			System.out.println("Número Informado é Par");
		} else {
			System.out.println("Número Informado é Impar");
		}
	}
}