package ListaAlternativa1;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual o peso total?");
		double kgTot = info.nextDouble();
		double perc = kgTot * 0.25;
		double hambEQueijo = (perc / 100) * 40;
		double pres = (perc / 100) * 20;
		System.out.println("Será nescessário comprar " + hambEQueijo + "g de Hambúrguer, " + hambEQueijo + "g de Queijo e " + pres + "g de Presunto");
	}

}
