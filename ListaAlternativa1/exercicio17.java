package ListaAlternativa1;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual a temperatura?");
		double tempC = info.nextDouble();
		double tempF = (tempC * 9/5) + 32;
		System.out.println("A temperatura em Fahrenheit é " + tempF);
	}

}
