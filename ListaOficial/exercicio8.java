package ListaOficial;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit");
		double tempF = info.nextDouble();
		double tempC = (tempF - 32) / 1.8;
		System.out.println(tempF + "F é equivalente a " + tempC + "ºC");
		info.close();
	}

}
