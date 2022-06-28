package br.edu.materdei.algoritmos.atividades.correcao_prova_2_bim;

import java.util.Random;

public class atividade3 {

    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            int numero = random.nextInt(50);
            if (numero % 2 != 0) {
                System.out.println(numero);
                i++;
            }
        }
    }

}
