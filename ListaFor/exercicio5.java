package ListaFor;

public class exercicio5 {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 150; i <= 600; i++) {
			if (i % 2 == 1 && i % 3 == 0) {
				soma += i;
			}
		}
		System.out.println(soma);
	}

}
