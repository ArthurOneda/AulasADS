package ListaAlternativa2;

import java.util.Scanner;

public class exercicio12 {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		double qtdHoras;
		double valorHoras;
		double percIR;
		double valorIR;
		double percINSS = 0.10;
		double valorINSS;
		double percFGTS = 0.11;
		double valorFGTS;
		double totalDescontos;
		double salarioLiquido;
		double salarioBruto;
		System.out.println("Informe a quantidade de horas trabalhadas");
		qtdHoras = info.nextDouble();
		System.out.println("Informe o valor das horas");
		valorHoras = info.nextDouble();
		salarioBruto = qtdHoras * valorHoras;
		if(salarioBruto <= 900) {
			percIR = 0;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
					   		   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
					   		   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
					   		   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
					   		   "\n Total de Descontos: 		R$" + totalDescontos + 
					   		   "\n Salário Líquido: 		R$" + salarioLiquido);		
		} else if(salarioBruto <= 1500) {
			percIR = 0.05;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
							   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
							   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
							   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
							   "\n Total de Descontos: 		R$" + totalDescontos + 
							   "\n Salário Líquido: 		R$" + salarioLiquido);	
		} else if(salarioBruto <= 2500) {
			percIR = 0.10;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
					   		   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
					   		   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
					   		   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
					   		   "\n Total de Descontos: 		R$" + totalDescontos + 
					   		   "\n Salário Líquido: 		R$" + salarioLiquido);	
		} else {
			percIR = 0.20;
			valorIR = salarioBruto * percIR;
			valorINSS = salarioBruto * percINSS;
			valorFGTS = salarioBruto * percFGTS;
			totalDescontos = valorIR + valorINSS;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("\n Salário Bruto: (" + qtdHoras + " * " + valorHoras + ") : R$" + salarioBruto + 
					   		   "\n (-) IR (" + (percIR * 100) + "%) : 		R$" + valorIR + 
					   		   "\n (-) INSS (" + (percINSS * 100) + "%) : 		R$" + valorINSS + 
					   		   "\n FGTS (" + (percFGTS * 100) + "%) : 		R$" + valorFGTS +
					   		   "\n Total de Descontos: 		R$" + totalDescontos + 
					   		   "\n Salário Líquido: 		R$" + salarioLiquido);	
		}
		
	}
}