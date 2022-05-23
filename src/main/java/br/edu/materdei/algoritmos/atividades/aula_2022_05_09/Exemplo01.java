package br.edu.materdei.algoritmos.atividades.aula_2022_05_09;

import br.edu.materdei.algoritmos.atividades.util.PessoaUtil;
import java.util.Scanner;

public class Exemplo01 {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Qual sua idade: ");
        int idade = scan.nextInt();

        if (PessoaUtil.ehMaiorDeIdade(idade)) {
            System.out.println("É maior de idade...");
        }

        imprimeNomeEmMaiusculo();
    }

    private static void imprimeNomeEmMaiusculo() {
        String nome = scan.next();
        System.out.println(nome.toUpperCase());
    }

}
