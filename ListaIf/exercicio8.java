package ListaIf;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Digite o usuário");
		String usuario = info.next();
		System.out.println("Digite a senha");
		String pass = info.next();
		if (usuario.equals("admin") && pass.equals("12345")) {
			System.out.println("Acesso concedido");
		} else {
			System.out.println("Acesso negado");
		}
		info.close();
	}

}
