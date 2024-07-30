package ListaAlternativa1;

import java.util.Scanner;

public class exercicio37 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe um número para que seja feita a tabuada do mesmo: ");
        int num = info.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
