package ListaAlternativa2;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double qtdLitrosVendidos, precoLitroGasolina = 2.50, precoLitroAlcool = 1.90, precoFinal = 0;
        String tipoCombustivel;
        System.out.println("Informe a Quantidade de Litros Vendida");
        qtdLitrosVendidos = info.nextDouble();
        System.out.println("Informe o tipo de Combústivel \n A-Álcool  G-Gasolina");
        tipoCombustivel = info.next().toUpperCase();
        if(tipoCombustivel.equals("A")){
            if(qtdLitrosVendidos <= 20){
                double qtdDesconto = 0.03;
                double valorAplicado = qtdLitrosVendidos * precoLitroAlcool;
                System.out.println(qtdDesconto + " " + valorAplicado);
                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
            } else {
                double qtdDesconto = 0.05;
                double valorAplicado = qtdLitrosVendidos * precoLitroAlcool;
                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
            }
        } else if(tipoCombustivel.equals("G")){
            if(qtdLitrosVendidos <= 20){
                double qtdDesconto = 0.04;
                double valorAplicado = qtdLitrosVendidos * precoLitroGasolina;
                precoFinal = qtdLitrosVendidos - (valorAplicado * qtdDesconto);
            } else {
                double qtdDesconto = 0.06;
                double valorAplicado = qtdLitrosVendidos * precoLitroGasolina;
                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
            }
        }
        System.out.println("Preço total: R$" + precoFinal);
    }
}