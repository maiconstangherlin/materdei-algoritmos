package br.edu.materdei.algoritmos.atividades.aula_2022_05_02;

import java.util.Random;

public class exercicio_04 {

    public static void main(String[] args) {
        final byte NUMERO_MEGA_SENA = 60;
        final byte NUMERO_JOGO = 6;

        String[] cartela = new String[NUMERO_MEGA_SENA];
        String[] jogo = new String[NUMERO_JOGO];

        for (int i = 0; i < cartela.length; i++) {
            cartela[i] = String.format("%02d", (i + 1));
        }

        jogo[0] = "05";
        jogo[1] = "11";
        jogo[2] = "17";
        jogo[3] = "20";
        jogo[4] = "26";
        jogo[5] = "33";

        for (int i = 0; i < cartela.length; i++) {
            if (cartela[i].equals(jogo[0])
                    || cartela[i].equals(jogo[1])
                    || cartela[i].equals(jogo[2])
                    || cartela[i].equals(jogo[3])
                    || cartela[i].equals(jogo[4])
                    || cartela[i].equals(jogo[5])) {
                cartela[i] = "XX";
            }

            System.out.print(cartela[i] + " ");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Random random = new Random();

        System.out.println("=====================");

        String numerosSorteados = "";
        String numerosAcertados = "";

        for (int i = 0; i < NUMERO_JOGO; i++) {
            int numeroSorteado = random.nextInt(60);
            numerosSorteados += numeroSorteado + " - ";

            for (int j = 0; j < NUMERO_JOGO; j++) {
                int numeroJogado = Integer.valueOf(jogo[j]);

                if (numeroJogado == numeroSorteado) {
                    numerosAcertados += numeroSorteado + " - ";
                }
            }
        }

        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Números acertados: " + numerosAcertados);
        

    }

}
