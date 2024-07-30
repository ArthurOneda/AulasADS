package ListaAlternativa1;

import java.util.Scanner;

public class exercicio36 {
	
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("Informe o valor do salário mínimo: ");
        double salarioMinimo = info.nextDouble();
        System.out.println("Informe quanto você recebe: ");
        double salarioFuncionario = info.nextDouble();
        double comparacaoSalarios = salarioFuncionario / salarioMinimo;
        System.out.println("Você recebe o equivalente a: " + comparacaoSalarios + " salários minimos");
    }
}
