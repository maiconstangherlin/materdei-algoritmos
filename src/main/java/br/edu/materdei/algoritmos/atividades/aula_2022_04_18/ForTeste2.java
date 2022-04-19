package br.edu.materdei.algoritmos.atividades.aula_2022_04_18;

import java.util.Scanner;

public class ForTeste2 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        int numeroTabuada = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numeroTabuada + " = "
                    + (i * numeroTabuada));
        }

        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " x " + numeroTabuada + " = "
                    + ((i + 1) * numeroTabuada));
        }
    }

}
