package ListaAlternativa1;

import java.util.Scanner;

public class exercicio27 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = info.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = info.nextInt();
        double divisao = n1 / n2;
        System.out.println("A divisão de " + n1 + " por " + n2 + " é: " + divisao);
    }
}
