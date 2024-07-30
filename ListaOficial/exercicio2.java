package ListaOficial;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o tamanho da base do retângulo");
		double base = info.nextDouble();
		System.out.println("Digite a altura do retângulo");
		double h = info.nextDouble();
		double area = base * h;
		System.out.println("A área do retângulo é " + area);
		info.close();
	}

}
