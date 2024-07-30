package ListaIf;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite seu salário");
		double salario = info.nextDouble();
		System.out.println("Digite quantos anos de empresa você tem");
		int tempEmpresa = info.nextInt();
		if (tempEmpresa >= 5 && tempEmpresa < 10) {
			salario += (salario / 100) * 10;
		} else if (tempEmpresa >= 10 && tempEmpresa < 15) {
			salario += (salario / 100) * 15;
		} else if (tempEmpresa >= 15) {
			salario += (salario / 100) * 19;
		} else {
			
		}
		System.out.println("Seu novo salário é " + salario);
		info.close();
	}

}
