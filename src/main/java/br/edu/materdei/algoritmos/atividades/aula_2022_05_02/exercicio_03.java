package br.edu.materdei.algoritmos.atividades.aula_2022_05_02;

import java.util.Random;

public class exercicio_03 {

    public static void main(String[] args) {

        var random = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("VETOR A - VETOR B");
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(100);
            
            vetorB[i] = vetorA[i] * 2;
            
            System.out.println(String.format("%02d", vetorA[i]) + "      - " + vetorB[i]);
        }              

    }

}
