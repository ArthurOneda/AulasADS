package ListaAlternativa2;

import java.util.Scanner;

public class exercicio15 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Informe o valor do lado do triângulo 1");
		int lado1 = info.nextInt();
		System.out.println("Informe o valor do lado do triângulo 2");
		int lado2 = info.nextInt();
		System.out.println("Informe o valor do lado do triângulo 3");
		int lado3 = info.nextInt();
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero");
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado1 || lado2 == lado3 || lado3 == lado1 || lado3 == lado1) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}
	}
}