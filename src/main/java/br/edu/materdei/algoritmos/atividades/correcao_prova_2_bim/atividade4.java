package br.edu.materdei.algoritmos.atividades.correcao_prova_2_bim;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 5 números:");
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = scan.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}
