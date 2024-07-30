package ListaIf;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite seu salário");
		double salario = info.nextDouble();
		if (salario <= 1500) {
			salario += (salario / 100) * 10;
		} else {
			salario += (salario / 100) * 5;
		}
		System.out.println("Seu novo salário é " + salario);
		info.close();
	}

}
