package ListaAlternativa2;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double salario;
		double valorAumento;
		double percAumento;
		double salarioFinal;
		System.out.println("Informe o seu salário");
		salario = info.nextDouble();
		if(salario <= 280) {
			percAumento = 0.2;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);	
		} else if(salario <= 700) {
			percAumento = 0.15;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);	
		} else if(salario <= 1500) {
			percAumento = 0.10;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);	
		} else {
			percAumento = 0.05;
			valorAumento = salario * percAumento;
			salarioFinal = salario + valorAumento;
			System.out.println("\n Salário antes do reajuste: R$" + salario + "\n Percentual de Aumento: " + (percAumento * 100) + "% \n Valor do Aumento: R$" + valorAumento + "\n Novo Salário: R$" + salarioFinal);
		}
	}
}