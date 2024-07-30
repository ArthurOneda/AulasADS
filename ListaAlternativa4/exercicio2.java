package ListaAlternativa4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um número para realizar a tabuada");
		int num = info.nextInt();
		System.out.println("Digite o início");
		int in = info.nextInt();
		System.out.println("Digite o final");
		int fim = info.nextInt();
		for (int i = in; i <= fim; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}
		info.close();
	}

}
