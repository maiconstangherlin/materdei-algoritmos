package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_06_13;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a forma geométrica?");
        String forma = scan.next();

        switch (forma.toLowerCase()) {
            case "circulo":
                System.out.println("Informe o valor do raio:");
                int raio = scan.nextInt();
                System.out.println("A área é: " + ((raio * raio) * Math.PI));
                break;
            case "quadrado":
            case "retangulo":
                System.out.println("Informe o lado e altura:");
                int lado = scan.nextInt();
                int altura = scan.nextInt();
                System.out.println("A área é: " + (lado * altura));
                break;
        }

    }
}
