package br.edu.materdei.algoritmos.atividades.aula_2022_06_09;

import java.util.Scanner;

public class TabuadaRecursiva2 {

    static int numeroBase = 0;
    static int numeroTabuada = 1;
    
    public static void main(String[] args) {
        System.out.println("Informe um número:");
        numeroBase = new Scanner(System.in).nextInt();

        imprimeTabuada();
    }

    static void imprimeTabuada() {
        System.out.println(numeroBase + " x " + numeroTabuada + " = "
                + (numeroBase * numeroTabuada));
        
        if (numeroTabuada < 10) {
            numeroTabuada++;
            imprimeTabuada();
        }
    }

}
