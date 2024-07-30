package ListaAlternativa2;

import java.util.Scanner;

public class exercicio18 {
	public static void main(String args[]){
		Scanner info = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Informe o dia que você nasceu");
		dia = info.nextInt();
		System.out.println("Informe o mês que você nasceu");
		mes = info.nextInt();
		System.out.println("Informe o ano que você nasceu");
		ano = info.nextInt();
		if(dia <= 0 || dia > 31) {
			System.out.println("Data Inválida");
		} else if(mes <= 0 || mes > 12) {
			System.out.println("Data Inválida");
		} else if(ano < 0 || ano > 9999) {
			System.out.println("Data Inválida");
		} else {
			System.out.println("Data Válida: " + dia + "/" + mes + "/" + ano);
		}
	}
}