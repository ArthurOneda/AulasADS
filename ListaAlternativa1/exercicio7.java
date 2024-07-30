package ListaAlternativa1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite um dia");
		int dia = info.nextInt();
		System.out.println("Digite um mês");
		int mes = info.nextInt();
		int diasAteAgora = (mes * 30) - (30 - dia);
		System.out.println("Desde o começo do ano se passaram " + diasAteAgora + " dias");
	}

}
