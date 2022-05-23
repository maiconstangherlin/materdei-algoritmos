package br.edu.materdei.algoritmos.atividades.aula_2022_05_19;

import java.util.Random;

public class Correcao_Atividade {

    public static void main(String[] args) {

        int[][] vetor = criarVetor();
        
        System.out.println("");
        
        int soma;     
        for (int i = 0; i < vetor.length; i++) {
            soma = 0;            
            for (int j = 0; j < vetor[i].length; j++) {
                soma += vetor[i][j];                
            }
            System.out.println("Soma da linha " + i + " = " + soma);
        }        
        
        
    }

    private static int[][] criarVetor() {
        int[][] numeros = new int[5][5];

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(9);
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.println();
        }

        return numeros;
    }

}
