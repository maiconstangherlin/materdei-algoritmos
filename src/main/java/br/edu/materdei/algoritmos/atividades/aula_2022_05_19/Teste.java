package br.edu.materdei.algoritmos.atividades.aula_2022_05_19;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        int[] unidimensional = new int[3];
        int[][] bidimensional = new int[3][3];

        unidimensional[0] = 1000;
        bidimensional[0][0] = 2000;

        var random = new Random();

        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                bidimensional[i][j] = random.nextInt(100);

                System.out.println(i + " - " + j + " : "
                        + bidimensional[i][j]);
            }
        }
    }

}
