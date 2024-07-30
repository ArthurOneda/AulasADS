package ListaAlternativa1;

import java.util.Scanner;

public class exercicio40 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro cateto: ");
        double catetoUm = info.nextDouble();
        System.out.println("Informe o valor do segundo cateto: ");
        double catetoDois = info.nextDouble();
        double hipotenusaSemRaiz = (catetoUm * catetoUm + catetoDois * catetoDois);
        double hipotenusaFinal= Math.sqrt(hipotenusaSemRaiz);
        System.out.println("O valor da hipotenusa é: " + hipotenusaFinal);
    }
}
