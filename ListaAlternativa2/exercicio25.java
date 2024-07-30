package ListaAlternativa2;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int contCulpado = 0;
        String respostaSuspeito;
        System.out.println("Telefonou para a vítima? \n S- Sim \n N- Não");
        respostaSuspeito = info.next().toUpperCase();
        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }
        System.out.println("Esteve no local do crime? \n S- Sim \n N- Não");
        respostaSuspeito = info.next().toUpperCase();
        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }
        System.out.println("Mora perto da vítima? \n S- Sim \n N- Não");
        respostaSuspeito = info.next().toUpperCase();
        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }
        System.out.println("Devia para a vítima? \n S- Sim \n N- Não");
        respostaSuspeito = info.next().toUpperCase();
        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }
        System.out.println("Já trabalhou com a vítima? \n S- Sim \n N- Não");
        respostaSuspeito = info.next().toUpperCase();
        if(respostaSuspeito.equals("S")){
            contCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }
        if(contCulpado == 5){
            System.out.println("Culpado");
        } else if(contCulpado >= 3){
            System.out.println("Cúmplice");
        } else if(contCulpado == 2){
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
    }
}