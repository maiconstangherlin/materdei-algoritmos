package br.edu.materdei.algoritmos.atividades.aula_2022_04_04;

import java.util.Scanner;

public class Revisao {

    public static void main(String[] args) {

        // tipo nome = ;
        Scanner scan = new Scanner(System.in);

        int inteiro = 18;
        long inteiroLongo = 123+123+123+123+123+123;
        double decimal;
        boolean verdadeiroFalso;
        String texto;
        char caractere;

        String comando = scan.next();
                

        boolean exit = comando.equals("EXIT");

        if (comando.equals("EXIT")) {
            
        }
        
        while (true) {
            if (exit) {
                System.out.println("saindo...");
                break;
            }
            if (comando.equals("INSERT")) {
                System.out.println("insere alguma coisa");
            } else if (comando.equals("DELETE")) {
                System.out.println("Remove alguma coisa");
            }
        }

    }

}
