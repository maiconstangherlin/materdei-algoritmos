package br.edu.materdei.algoritmos.atividades.rascunho_prova_2_bim;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        System.out.println("Informe 5 números");
        int[] nums = new int[5];

        for (int i = 4; i >= 0; i--) {
            nums[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("");
        System.out.println(Arrays.toString(nums));
    }

}
