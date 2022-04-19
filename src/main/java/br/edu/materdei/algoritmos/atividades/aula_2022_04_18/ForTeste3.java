package br.edu.materdei.algoritmos.atividades.aula_2022_04_18;

import java.util.Scanner;

public class ForTeste3 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        int numero = scan.nextInt();
        // 5

        System.out.println("");

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print("X ");
            }
            System.out.println("");
        }

    }

}
