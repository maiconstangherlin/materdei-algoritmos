package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_06_13;

import java.util.Arrays;
import java.util.Random;

public class Atividade1 {   
    
    public static void main(String[] args) {
        final int TAMANHO = 15;
        
        Random random = new Random();
        int[] v1 = new int[TAMANHO];
        int[] v2 = new int[TAMANHO];
        int contagem = 0;
        
        // do 0 ao 14
        for (int i = 0; i < TAMANHO; i++) {
            v1[i] = random.nextInt(10);
            v2[i] = random.nextInt(10); 
            
            if (v1[i] == v2[i]) {
                contagem++;
            }
        }
        
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        
        System.out.println();
        System.out.println("Existem " + contagem + " números iguais");
        
    }
    
}
