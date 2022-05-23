package br.edu.materdei.algoritmos.atividades.aula_2022_05_19;

import java.util.Random;

public class Atividade {

    public static void main(String[] args) {
        int[][] numeros = criaVetor();
        
        somaLinhas(numeros);
        somaColunas(numeros);
    }

    private static int[][] criaVetor() {
        int[][] numeros = new int[5][5];
        var random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(9);
                System.out.print(numeros[i][j] + " | ");
            }
            System.out.println("");
        }

        System.out.println("");
        
        return numeros;
    }

    private static void somaLinhas(int[][] numeros) {
        int soma;
        for (int i = 0; i < numeros.length; i++) {
            soma = 0;            
            for (int j = 0; j < numeros[i].length; j++) {
                soma += numeros[i][j];
            }
            System.out.printf("Soma linha %s = %s \n", i, soma);
        }
    }

    private static void somaColunas(int[][] numeros) {
        int soma;        
        for (int i = 0; i < numeros.length; i++) {
            soma = 0;            
            for (int j = 0; j < numeros[i].length; j++) {
                soma += numeros[j][i];
            }
            System.out.printf("Soma coluna %s = %s \n", i, soma);
        }
    }
}
