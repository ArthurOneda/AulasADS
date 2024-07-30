package ListaAlternativa4;

public class exercicio15 {

	public static void main(String[] args) {
		int mediaPessoas = 120, aumentoPessoas1 = 26, publico;
		double precoInicial = 5.00, precoMinimo = 1.00, custoSessao = 200.00, maxLucro = 0, precoMaxLucro = 0, preco, lucro;
		for (preco = precoInicial; preco >= precoMinimo; preco -= 0.50) {
			publico = mediaPessoas + (int) ((precoInicial - preco) * (aumentoPessoas1));
			lucro = (preco * publico) - custoSessao;
			if (lucro > maxLucro) {
				maxLucro = lucro;
				precoMaxLucro = preco;
			}
			System.out.printf("Preço do ingresso: R$ %.2f, Lucro: R$ %.2f%n", preco, lucro);
		}
		System.out.println("\nO preço do ingresso que gera o maior lucro é R$ " + precoMaxLucro + " com um lucro de R$ " + maxLucro);
	}

}
