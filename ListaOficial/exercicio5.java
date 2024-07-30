package ListaOficial;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o salário do funcionário");
		double salI = info.nextDouble();
		System.out.println("Digite a porcentagem do reajuste");
		int perc = info.nextInt();
		double salF = salI + ((salI / 100) * perc);
		System.out.println("O novo salário é de " + salF);
		info.close();
	}

}
