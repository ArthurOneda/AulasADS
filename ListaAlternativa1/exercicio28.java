package ListaAlternativa1;

import java.util.Scanner;

public class exercicio28 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = info.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = info.nextDouble();
        double mediaPonderada = (nota1 * 2 + nota2 * 3) / 5;
        System.out.println("A média final é: " + mediaPonderada);
    }
}
