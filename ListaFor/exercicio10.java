package ListaFor;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantos habitantes tem a cidade");
		int qtdH = info.nextInt(), somaF = 0, perc = 0, filhos;
		double somaS = 0, maiorS = Integer.MIN_VALUE, salario;
		for (int i = 0; i < qtdH; i++) {
			System.out.println("Qual seu salário");
			salario = info.nextDouble();
			somaS += salario;
			if (salario > maiorS) {
				maiorS = salario;
			}
			System.out.println("Quantos filhos você possui");
			filhos = info.nextInt();
			somaF += filhos;
			if (salario <= 1500) {
				perc++;
			}
		}
		double mediaS, mediaF;
		mediaS = somaS / qtdH;
		mediaF = somaF / qtdH;
		perc = (perc * 100) / qtdH;
		System.out.println("Média do salário dos entrevistados: " + mediaS + "\nMédia do número de filhos: " + mediaF + "\nMaior salário: " + maiorS + "\nPercentual de pessoas com salário até R$1.500,00: " + perc);
		info.close();
	}

}
