package ListaAlternativa1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro lado");
		double lado1 = info.nextDouble();
		System.out.println("Digite o valor do segundo lado");
		double lado2 = info.nextDouble();
		double area = lado1 * lado2;
		System.out.println("A área do retângulo é " + area);
	}

}
