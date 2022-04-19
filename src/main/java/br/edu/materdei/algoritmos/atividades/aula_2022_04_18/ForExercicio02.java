package br.edu.materdei.algoritmos.atividades.aula_2022_04_18;

import java.util.Scanner;

public class ForExercicio02 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        String palavra = scan.next();
        int ultimoIndicePalavra = palavra.length() - 1;

        int qtdVogais = 0;
        int qtdConsoantes = 0;

        for (int i = 0; i <= ultimoIndicePalavra; i++) {
            char caractere = palavra.charAt(i);
            switch (caractere) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    qtdVogais++;
                    break;
                default:
                    qtdConsoantes++;
            }
        }

        System.out.println("Total vogais: " + qtdVogais);
        System.out.println("Total consoantes: " + qtdConsoantes);
    }

}
