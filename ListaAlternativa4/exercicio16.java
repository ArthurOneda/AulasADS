package ListaAlternativa4;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
	        Scanner info = new Scanner(System.in);
	        int qtdOcorrenciasChefe = 0, qtdOcorrenciasEddie = 0, qtdOcorrenciasLou = 0;
	        int tipoOcorrencia, qtdDirecaoPerigosa = 0, qtdTotalOcorrencias = 0, qtdOcorrenciasHomer = 0, percDirecaoPerigosa;
	        int continuarPrograma = 0;
	        System.out.println("chefe");
	        qtdOcorrenciasChefe = info.nextInt();
	        System.out.println("eddie");
	        qtdOcorrenciasEddie = info.nextInt();
	        System.out.println("lou");
	        qtdOcorrenciasLou = info.nextInt();
	        while(continuarPrograma != 1){
	            System.out.println("Informe o tipo de Ocorrência  \n1- Direção Perigosa   3- Bebedeira  \n2- Barulo  4- Homer");
	            tipoOcorrencia = info.nextInt();
	            if(tipoOcorrencia == 1){
	                qtdDirecaoPerigosa++;
	            }
	            System.out.println("Informe o nível de Gravidade da Ocorrência \n1- Baixo  2- Médio  3- Alto");
	            int nivelGravidadeOcorrencia = info.nextInt();
	            qtdTotalOcorrencias++;
	            if(tipoOcorrencia == 4){
	                qtdOcorrenciasHomer++;
	            }
	            if(qtdOcorrenciasChefe < qtdOcorrenciasLou && qtdOcorrenciasChefe < qtdOcorrenciasEddie){
	                qtdOcorrenciasChefe++;
	            } else if(qtdOcorrenciasLou < qtdOcorrenciasChefe && qtdOcorrenciasLou < qtdOcorrenciasEddie){
	                qtdOcorrenciasLou++;
	            } else if(qtdOcorrenciasEddie < qtdOcorrenciasChefe && qtdOcorrenciasEddie < qtdOcorrenciasLou){
	                qtdOcorrenciasEddie++;
	            }
	            System.out.println("Deseja Cadastrar Mais uma Ocorrência?  0- Sim  1- Não");
	            continuarPrograma = info.nextInt();
	        }
	        percDirecaoPerigosa = (100 * qtdDirecaoPerigosa) / qtdTotalOcorrencias;
	        System.out.println("Ocorrências de cada policial \nChefe: " + qtdOcorrenciasChefe + " --- Lou: " + qtdOcorrenciasLou + " --- Eddie: " + qtdOcorrenciasEddie);
	        System.out.println("Número de ocorrências do tipo Homer: " + qtdOcorrenciasHomer);
	        System.out.println("Percentual de ocorrências do tipo Direção Perigosa: " + percDirecaoPerigosa + "%");
	        info.close();
	}

}
