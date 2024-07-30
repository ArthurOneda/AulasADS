package ListaAlternativa1;

import java.util.Scanner;

public class exercicio32 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe seu peso em KG: ");
        double peso = info.nextDouble();
        double pesoEmGramas = peso * 1000;
        System.out.println("O seu peso em gramas é: " + pesoEmGramas);
    }
}
