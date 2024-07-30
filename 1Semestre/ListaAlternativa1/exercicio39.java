package ListaAlternativa1;

public class exercicio39 {
	
    public static void main(String[] args){
        System.out.println("O salário é R$1.200,00");
        double salario = 1200;
        double contaUm = 200 +  ((double) 200 *2 / 100);
        double contaDois =120 + ((double) 120 * 2 / 100);
        double salarioFinal = salario - contaUm - contaDois;
        System.out.println("Após pagar as contas atrasadas e já considerando os juros, restará um total de: R$" + salarioFinal);
    }
}
