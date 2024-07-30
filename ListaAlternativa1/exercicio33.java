package ListaAlternativa1;

import java.util.Scanner;

public class exercicio33 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o tamanho da base maior: ");
        double baseMaior = info.nextDouble();
        System.out.println("Informe o tamanho da base menor: ");
        double baseMenor = info.nextDouble();
        System.out.println("Informe a altura do trapézio: ");
        double alturaTrapezio = info.nextDouble();
        double areaTrapezio = ((baseMenor * baseMaior) * alturaTrapezio) / 2;
        System.out.println("A área do trapézio é: " + areaTrapezio);
    }
}
