package br.edu.materdei.algoritmos.atividades.correcao_ativ_2022_05_24;

import br.edu.materdei.algoritmos.atividades.util.NumeroUtil;
import java.util.Random;

public class Ativ_04 {

    public static void main(String[] args) {
        int[][] vetorNumeros = criarVetorNumeros();

        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];
        
        int iPar = 0;
        int iImpar = 0;

        for (int i = 0; i < vetorNumeros.length; i++) {
            for (int j = 0; j < vetorNumeros[i].length; j++) {
                
                if (NumeroUtil.ehPar(vetorNumeros[i][j])) {
                    vetorPar[iPar] = vetorNumeros[i][j];
                    iPar++;
                } else { 
                    vetorImpar[iImpar] = vetorNumeros[i][j];
                    iImpar++;
                }                
            }
        }
        
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.println(vetorPar[i]);            
        }
        
        System.out.println("----");
        for (int i = 0; i < vetorImpar.length; i++) {
            System.out.println(vetorImpar[i]);            
        }
    }

    private static int[][] criarVetorNumeros() {
        int[][] vetorNumeros = new int[5][2];
        Random random = new Random();

        for (int i = 0; i < vetorNumeros.length; i++) {
            for (int j = 0; j < vetorNumeros[i].length; j++) {
                vetorNumeros[i][j] = random.nextInt(100);
            }
        }

        return vetorNumeros;
    }

}
