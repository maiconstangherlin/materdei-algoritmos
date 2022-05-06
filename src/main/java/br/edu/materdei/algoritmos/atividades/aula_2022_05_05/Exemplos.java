package br.edu.materdei.algoritmos.atividades.aula_2022_05_05;

import java.util.Random;

public class Exemplos {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        var random = new Random();

        String posicoesPares = "";
        int soma = 0;
        int somaPosicoes2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);

            System.out.print(numeros[i] + " - ");
            
            if (ehPar(numeros[i])){
                posicoesPares += " - " + i;
            }

            soma += numeros[i];

            if ((i + 1) % 5 == 0) {
                somaPosicoes2 += numeros[i];
            }
        }

        System.out.println("\n");
        System.out.println("A) " + posicoesPares);
        System.out.println("B) " + soma);
        System.out.println("C2) " + somaPosicoes2);
    }

    private static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
