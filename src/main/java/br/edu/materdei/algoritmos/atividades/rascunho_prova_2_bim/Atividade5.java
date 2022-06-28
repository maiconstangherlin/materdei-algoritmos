package br.edu.materdei.algoritmos.atividades.rascunho_prova_2_bim;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao vôo 728 da White duck airlines...");
        System.out.println("");

        String[][] assentos = new String[50][2];

        int i = 0;
        int assento = 1;

        while (assento < 3) {
            assentos[i][0] = assento + "A";
            assentos[++i][0] = assento + "B";
            assentos[++i][0] = assento + "C";
            assentos[++i][0] = assento + "D";
            assentos[++i][0] = assento + "E";
            assentos[++i][0] = assento + "F";
            
            assento++;
            i++;
        }

        int ordemAssento = 0;

        while (ordemAssento < 10) {
            System.out.println("Informe o nome do próximo passageiro: ");
            String passageiro = new Scanner(System.in).next();

            String codigo = assentos[ordemAssento][0];
            assentos[ordemAssento][1] = passageiro;

            System.out.println("Assento " + codigo + " reservado: R$ 2000,00");

            ordemAssento++;
        }

        for (int j = 0; j < assentos.length; j++) {
            System.out.println("Assento: " + assentos[j][0] + " - " + assentos[j][1]);
        }                        
                
    }

}
