package br.edu.materdei.algoritmos.atividades.aula_2022_05_02;

import java.util.Random;

public class exercicio_04_refatoracao {

    public static void main(String[] args) {
        final byte NUMERO_MEGA_SENA = 60;
        final byte NUMERO_JOGO = 6;
        String[] jogo = new String[NUMERO_JOGO];

        jogo[0] = "05";
        jogo[1] = "11";
        jogo[2] = "17";
        jogo[3] = "20";
        jogo[4] = "26";
        jogo[5] = "33";

        for (int i = 0; i < NUMERO_MEGA_SENA; i++) {
            String numeroCartela = String.format("%02d", (i + 1));
            
            if (numeroCartela.equals(jogo[0])
                    || numeroCartela.equals(jogo[1])
                    || numeroCartela.equals(jogo[2])
                    || numeroCartela.equals(jogo[3])
                    || numeroCartela.equals(jogo[4])
                    || numeroCartela.equals(jogo[5])) {
                System.out.print("XX ");
            } else {
                System.out.print(numeroCartela + " ");
            }

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
