package br.edu.materdei.algoritmos.atividades.aula_2022_05_02;

import java.util.Random;

public class exercicio_02 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        var random = new Random();

        String posicoesPares = "";
        int soma = 0;
        int somaPosicoes = 0;
        int somaPosicoes2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);

            System.out.print(numeros[i] + " - ");

            if (numeros[i] % 2 == 0) {
                posicoesPares += " - " + i;
            }

            soma += numeros[i];

//            if (i == 5 || i == 10 || i == 15 || i == 20) {
//                somaPosicoes += numeros[i];
//            }

            if ((i + 1) % 5 == 0) {
                somaPosicoes2 += numeros[i];
            }
        }

        System.out.println("\n");
        System.out.println("A) " + posicoesPares);
        System.out.println("B) " + soma);
//        System.out.println("C) " + somaPosicoes);
        System.out.println("C2) " + somaPosicoes2);

    }

}
