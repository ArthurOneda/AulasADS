package ListaAlternativa4;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int totalNum = 0;
		double soma = 0, somaQuad = 0, num, media = 0, desvio = 0;
		System.out.println("Digite até 10 números reais positivos (digite um número negativo para parar):");
        while (totalNum < 10) {
            System.out.print("Número " + (totalNum + 1) + ": ");
            num = info.nextDouble();
            if (num < 0) {
            }
            soma += num;
            somaQuad += Math.pow(num, 2);
            totalNum++;
        }
        if (totalNum == 0) {
            System.out.println("Nenhum número válido foi inserido.");
        } else {
        	media = soma / totalNum;
            desvio = Math.sqrt((somaQuad / totalNum) - Math.pow(media, 2));
            System.out.println("Média dos números: " + media);
            System.out.println("Desvio padrão amostral dos números: " + desvio);
        }
        info.close();
	}

}
