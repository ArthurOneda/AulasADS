package ListaFor;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Qual número você deseja realizar a tabuada");
		int num = info.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + (num * i));
		}
		info.close();
	}

}
