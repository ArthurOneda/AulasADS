package ListaAlternativa1;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o raio da pizza?");
		double raio = info.nextDouble();
		double area = (raio * raio) * Math.PI;
		System.out.println("A área da pizza é " + area);
	}

}
