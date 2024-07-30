package ListaAlternativa2;

import java.util.Scanner;

public class exercicio16 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Informe o valor de a");
		a = info.nextDouble();
		if(a < 0) {
			System.out.println("O valor de A não pode ser negatico");
		} else {
			System.out.println("Informe o valor de b");
			b = info.nextDouble();
			System.out.println("Informe o valor de c");
			c = info.nextDouble();
			delta = (b * b) - (4 * (a * c));
			if(delta < 0) {
				System.out.println("O valor do delta é negativo: " + delta);
			} else if(delta == 0) {
				x1 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);
				System.out.println("A equação possui apenas uma raiz real: " + x1);
			} else if(delta > 1) {
				x1 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);			
				x2 = ((-1 * b) - (Math.sqrt(delta))) / (2 * a);
				System.out.println("A equação possui duas raizes reais: X1: " + x1 + " X2: " + x2);
			}
		}
	}
}