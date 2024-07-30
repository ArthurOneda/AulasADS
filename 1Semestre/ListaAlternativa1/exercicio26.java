package ListaAlternativa1;

import java.util.Scanner;

public class exercicio26 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = info.nextInt();
        System.out.println("Informe o segundo número: ");
        int n2 = info.nextInt();
        System.out.println("Informe o terceiro número: ");
        int n3 = info.nextInt();
        int multiplicacao = n1 * n2 * n3;
        System.out.println("A multiplicação dos 3 números resulta em: " + multiplicacao);
    }
}
