package ListaAlternativa4;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
        double resultado = 0, valor;
        int op;
        while (true) {
            System.out.println("Selecione a operação:( 1. Soma  2. Subtração  3. Multiplicação  4. Divisão  5. Limpar resultado  6. Sair");
            System.out.println("Opção: ");
            op = info.nextInt();
            if (op == 6) {
                System.out.println("Encerrando a calculadora.");
                break;
            }
            switch (op) {
                case 1:
                    System.out.print("Digite o valor a ser somado: ");
                    valor = info.nextDouble();
                    resultado += valor;
                    break;
                case 2:
                    System.out.print("Digite o valor a ser subtraído: ");
                    valor = info.nextDouble();
                    resultado -= valor;
                    break;
                case 3:
                    System.out.print("Digite o valor a ser multiplicado: ");
                    valor = info.nextDouble();
                    resultado *= valor;
                    break;
                case 4:
                    System.out.print("Digite o valor pelo qual dividir: ");
                    valor = info.nextDouble();
                    if (valor != 0) {
                        resultado /= valor;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                case 5:
                    resultado = 0;
                    System.out.println("Resultado limpo.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println("Resultado atual: " + resultado);
        }
        info.close();
	}

}
