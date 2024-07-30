package ListaIf;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Cadastre seu usuário");
		String cUser = info.next();
		System.out.println("Cadastre sua senha");
		String cPass = info.next();
		System.out.println("Digite o usuário");
		String usuario = info.next();
		System.out.println("Digite a senha");
		String pass = info.next();
		if (usuario.equals(cUser) && pass.equals(cPass)) {
			System.out.println("Acesso concedido");
		} else {
			System.out.println("Acesso negado");
		}
		info.close();
	}

}
