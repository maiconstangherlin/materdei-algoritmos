package br.edu.materdei.algoritmos.atividades.aula_2022_05_19;

import java.util.Random;

public class Correcao_Atividade {

    public static void main(String[] args) {
        int[][] vetor = criarVetor();

        System.out.println();

        somarLinhasVetor(vetor);
        somarColunasVetor(vetor);
    }

    private static int[][] criarVetor() {
        int[][] numeros = new int[3][3];

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

    private static void somarLinhasVetor(int[][] vetor) {
        int soma;
        for (int row = 0; row < vetor.length; row++) {
            soma = 0;
            for (int col = 0; col < vetor[row].length; col++) {
                soma += vetor[row][col];
            }
            System.out.println("Soma da linha " + row + " = " + soma);
        }
    }

    private static void somarColunasVetor(int[][] vetor) {
        int soma;
        for (int col = 0; col < vetor.length; col++) {
            soma = 0;
            for (int row = 0; row < vetor.length; row++) {
                soma += vetor[row][col];
            }
            System.out.println("Soma da coluna " + col + " = " + soma);
        }

    }
}
