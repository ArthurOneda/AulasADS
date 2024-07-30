package ListaIf;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a quantidade total de um produto");
		int qtdProd = info.nextInt();
		System.out.println("Digite o valor unitário do produto");
		double valProd = info.nextDouble(), desc = 0, valTot = qtdProd * valProd;
		if (qtdProd > 5 && qtdProd <= 10) {
			desc = (valTot / 100) * 3;
			valTot -= desc;
		} else if (qtdProd > 10 && qtdProd <= 15) {
			desc = (valTot / 100) * 9;
			valTot -= desc;
		} else if (qtdProd > 15 && qtdProd <= 20) {
			desc = (valTot / 100) * 13;
			valTot -= desc;
		} else if (qtdProd > 20) {
			desc = (valTot / 100) * 15;
			valTot -= desc;
		} else {
			
		}
		System.out.println("Quantidade Comprada: " + qtdProd + "\nValor Unitário: " + valProd + "\nValor Desconto: " + desc + "\nValor Total: " + valTot);
		info.close();
	}

}
