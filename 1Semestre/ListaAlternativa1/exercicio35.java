package ListaAlternativa1;

import java.util.Scanner;

public class exercicio35 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o tamanho da diagonal maior: ");
        double diagonalMaior = info.nextDouble();
        System.out.println("Informe o tamanho da diagonal menor: ");
        double diagonalMenor = info.nextDouble();
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A área do losango é: " + areaLosango);
    }
}
