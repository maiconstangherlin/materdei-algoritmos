package br.edu.materdei.algoritmos.atividades.rascunho_prova_2_bim;

import java.util.Random;

public class Atividade3 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            int numero = new Random().nextInt(100);
            if (numero % 2 != 0) {
                System.out.print(numero + ", ");
                i++;
            }
        }

    }

}
