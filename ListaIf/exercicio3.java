package ListaIf;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = info.nextInt();
        System.out.println("Digite outro número");
        int num2 = info.nextInt();
        System.out.println("Qual operação você deseja realizar:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int op = info.nextInt();
        double result = 0;
        switch (op) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		default:
			break;
		}
        System.out.println("O resultado é " + result);
		info.close();
	}

}
