package ListaAlternativa1;

import java.util.Scanner;

public class exercicio30 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o salário fixo do funcionário: ");
        double salarioFixo = info.nextDouble();
        System.out.println("Informe o total de vende realizadas pelo funcionário: ");
        double vendas = info.nextDouble();
        double comissao = (vendas * 4) / 100;
        double salarioFinal = salarioFixo + comissao;
        System.out.println("O salário fixo é: R$" + salarioFixo);
        System.out.println("A comissão é: R$" + comissao);
        System.out.println("O salário final é: R$" + salarioFinal);
    }
}
