package ListaAlternativa1;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Informe o comprimento da sua sombra em cm");
		double compSombraPessoa = info.nextDouble();
		System.out.println("Informe o comprimento da sombra do prédio em cm");
		double compSombraPredio = info.nextDouble();
		System.out.println("Informe a sua altura em cm");
		double alturaPessoa = info.nextDouble();
		double alturaPredio = (compSombraPredio * alturaPessoa) / compSombraPessoa;
		System.out.println("A altura do prédio é " + alturaPredio + " cm");
	}

}
