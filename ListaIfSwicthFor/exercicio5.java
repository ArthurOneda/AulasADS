package ListaIfSwicthFor;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor");
			int num1 = info.nextInt();
			System.out.println("Digite outro valor");
			int num2 = info.nextInt();
			System.out.println("Digite o caractere da operação desejada");
			char op = info.next().charAt(0);
			switch (op) {
			case '+':
				System.out.println("Resultado: " + num1 + " " + op + " " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				System.out.println("Resultado: " + num1 + " " + op + " " + num2 + " = " + (num1 - num2));
				break;
			case '*':
				System.out.println("Resultado: " + num1 + " " + op + " " + num2 + " = " + (num1 * num2));
				break;
			case '/':
				System.out.println("Resultado: " + num1 + " " + op + " " + num2 + " = " + (num1 / num2));
				break;
			default:
				break;
			}
		}
		info.close();
	}

}
