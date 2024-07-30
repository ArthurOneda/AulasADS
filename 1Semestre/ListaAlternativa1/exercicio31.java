package ListaAlternativa1;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.println("Informe o seu peso: ");
        double pesoPessoa = info.nextDouble();
        double emagrecer = pesoPessoa - ((pesoPessoa * 20) / 100);
        double engordar = pesoPessoa + ((pesoPessoa * 15) / 100);
        System.out.println("Se você emgagrecer 20% do seu peso ficará com: " + emagrecer + " KG");
        System.out.println("Se você engordar 15% do seu peso ficará com: " + engordar + " KG");
    }
}
