package ListaAlternativa1;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o valor da conta?");
		double conta = info.nextDouble();
		double val1 = Math.ceil(conta / 3);
		double val2 = Math.ceil(conta / 3);
		double valFelp = conta - val1 - val2;
		System.out.println("André R$:" + val1 + "\nCarlos R$:" + val2 + "\\nFelipe R$:" + valFelp);
	}

}
