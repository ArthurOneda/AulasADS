package QuestoesIf;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = info.next();
		System.out.println("Digite o valor da compra");
		int valC = info.nextInt();
		System.out.println("QUal sua categoria de cliente: \n1 - Regular\n2 - Premium\n3 - VIP");
		int op = info.nextInt();
		double valDesc = 0, valP = 0;
		System.out.println(nome);
		if (op == 1) {
			System.out.println("Categoria: Regular");
			System.out.println("Valor da Compra: " + valC);
			if (valC <= 1000) {
				valDesc = (valC/100) * 1.5;
				valP = valC - valDesc;
			} else if (valC <= 5000) {
				valDesc = (valC/100) * 3;
				valP = valC - valDesc;
			} else {
				valDesc = (valC/100) * 8;
				valP = valC - valDesc;
			}
		} else if (op == 2) {
			System.out.println("Categoria: Premium");
			System.out.println("Valor da Compra: " + valC);
			if (valC <= 1000) {
				valDesc = (valC/100) * 3;
				valP = valC - valDesc;
			} else if (valC <= 5000) {
				valDesc = (valC/100) * 7;
				valP = valC - valDesc;
			} else {
				valDesc = (valC/100) * 13;
				valP = valC - valDesc;
			}
		} else if (op == 3) {
			System.out.println("Categoria: VIP");
			System.out.println("Valor da Compra: " + valC);
			if (valC <= 1000) {
				valDesc = (valC/100) * 5;
				valP = valC - valDesc;
			} else if (valC <= 5000) {
				valDesc = (valC/100) * 10;
				valP = valC - valDesc;
			} else {
				valDesc = (valC/100) * 20;
				valP = valC - valDesc;
			}
		} else {
			System.out.println("Opção Inválida");
		}
		System.out.println("Valor do Desconto: " + valDesc);
		System.out.println("Valor a Pagar: " + valP);
	}

}
