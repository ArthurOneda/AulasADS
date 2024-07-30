package ListaAlternativa1;

import java.util.Scanner;

public class exercicio34 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double quadrado = info.nextDouble();
        double areaQuadrado = quadrado * quadrado;
        System.out.println("A área do quadrado é: " + areaQuadrado);
    }
}
