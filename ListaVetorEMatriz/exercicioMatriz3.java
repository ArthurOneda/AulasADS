package ListaVetorEMatriz;

import java.util.Scanner;

public class exercicioMatriz3 {

	public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        String[] nomes = new String[2];
        int[][] notas = new int[2][3];
        int[] mediasP = new int[2];
        int somaTurma = 0, somaP = 0;
        double mediaTurma;
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno");
            nomes[i] = info.next();
        }
        for (int i = 0; i < notas.length; i++) {
            somaP = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Digite a " + (j + 1) + "ª nota do(a) " + nomes[i]);
                notas[i][j] = info.nextInt();
                somaP += notas[i][j];
                somaTurma += notas[i][j];
            }
            mediasP[i] = somaP / 3;
        }
        mediaTurma = somaTurma / 6;
        for (int i = 0; i < mediasP.length; i++) {
            if (mediasP[i] >= mediaTurma) {
                System.out.println(nomes[i] + " teve uma média maior que a da turma");
            }
        }
        info.close();
    }
}
