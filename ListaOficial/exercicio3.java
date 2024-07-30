package ListaOficial;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Você possui quantos anos de vida?");
		int anos = info.nextInt();
		System.out.println("Além dos " + anos + " anos você possui quantos meses?");
		int meses = info.nextInt();
		System.out.println("E dias?");
		int dias = info.nextInt();
		int totDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("Você viveu " + totDias + " dias até hoje");
		info.close();
	}

}
