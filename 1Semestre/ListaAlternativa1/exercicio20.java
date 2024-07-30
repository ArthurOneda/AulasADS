package ListaAlternativa1;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int qtdCamisas;
		int qtdNovelos = 2;
		System.out.println("Informe a quantidade de Camisas");
		qtdCamisas = info.nextInt();
		qtdNovelos *= qtdCamisas;
		System.out.println("A quantidade de Novelos para produzir " + qtdCamisas + " camisas é de: " + qtdNovelos);
	}

}
