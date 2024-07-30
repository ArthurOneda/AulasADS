package ListaAlternativa4;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Quantas idade você deseja digitar");
		int qtdE = info.nextInt(), num, somaT = 0, qtdM = 0;
		for (int i = 0; i < qtdE; i++) {
			System.out.println("Digite uma idade");
			num = info.nextInt();
			if (num >= 18) {
				somaT += num;
				qtdM++;
			}
		}
		double media = somaT / qtdM;
		System.out.println("Soma das idades dos maiores de idade: " + somaT);
		System.out.println("Média das idades dos maiores de idade: " + media);
		info.close();
	}

}
