package br.edu.materdei.algoritmos.atividades.aula_2022_06_09;

import java.util.Scanner;

public class TabuadaRecursiva {

    public static void main(String[] args) {

        System.out.println("Informe um número:");
        int numeroBase = new Scanner(System.in).nextInt();

        imprimeTabuada(numeroBase, 1);
    }

    static void imprimeTabuada(int numeroBase, int numero) {
        System.out.println(numeroBase + " x " + numero + " = "
                + (numeroBase * numero));
        
        if (numero < 10) {
            imprimeTabuada(numeroBase, numero + 1);
        }
    }

}
