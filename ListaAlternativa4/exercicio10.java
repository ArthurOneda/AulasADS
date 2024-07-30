package ListaAlternativa4;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
        System.out.println("Quantos números da sequência de Fibonacci você deseja imprimir?");
        int qtdE = info.nextInt();
        int num1 = 0, num2 = 1, soma = 1;
        for (int i = 0; i < qtdE; i++) {
            System.out.println(soma);
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }
        info.close();
	}

}
