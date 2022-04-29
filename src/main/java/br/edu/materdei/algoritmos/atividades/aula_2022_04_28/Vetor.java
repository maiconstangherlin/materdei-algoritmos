package br.edu.materdei.algoritmos.atividades.aula_2022_04_28;

import java.util.Random;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
//        String nome = "Maicon";
//
//        String[] nomes = new String[2];
//        nomes[0] = "Maicon";
//        nomes[1] = "Stangherlin";
//
//        System.out.println("Tamanho da string: " + nome.length());
//        System.out.println("Tamanho do vetor: " + nomes.length);
//
//        System.out.println(nomes[1].length());

        var scan = new Scanner(System.in);        

        System.out.println("Informe a quantidade de notas: ");
        int qtdNotas = scan.nextInt();

        var random = new Random();
        double[] notas = new double[qtdNotas];
        

        double maiorValor = Double.MIN_VALUE;        
        double menorValor = Double.MAX_VALUE;
        
        for (int i = 0; i < qtdNotas; i++) {
            notas[i] = random.nextInt(1000);            
            System.out.println((i + 1) + "º nota: " + notas[i]);
            
            if (notas[i] > maiorValor) {
                maiorValor = notas[i];
            }
            if (notas[i] < menorValor) { 
                menorValor = notas[i];
            }
        }
        
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);

        System.out.println("");

        double somaNotas = 0.0;

        // Percorrer todas as posições do vetor
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        System.out.println("Média: " + (somaNotas / qtdNotas));

    }

}
