package ListaAlternativa1;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o raio da caixa d'água?");
		double raio = info.nextDouble();
		System.out.println("Qual a altura da caixa d'água?");
		double h = info.nextDouble();
		double areaBase = (raio * raio) * Math.PI;
		double areaTot = areaBase * h;
		System.out.println("A área da caixa d'água é " + areaTot);
	}

}
