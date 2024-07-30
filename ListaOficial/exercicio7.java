package ListaOficial;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o salário fixo do funcionário");
		double salFixo = info.nextDouble();
		System.out.println("Digite quantos carros o funcionário vendeu");
		int qtdCarros = info.nextInt();
		System.out.println("Digite o valor total de suas vendas");
		int valTotal = info.nextInt();
		System.out.println("Digite o valor recebido por carro vendido");
		double valPerCarro = info.nextInt();
		double percVendas = (valTotal / 100) * 5;
		double comissao = valPerCarro * qtdCarros;
		double salFinal = salFixo + percVendas + comissao;
		System.out.println("O salário final do vendedor é de " + salFinal);
		info.close();
	}

}
