package br.edu.materdei.algoritmos.atividades.aula_2022_05_09;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("5 ao quadrado é: " + aoQuadrado(5));

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        System.out.println(numero + " ao quadrado é: " + aoQuadrado(numero));
    }

    private static int aoQuadrado(int numero) {
        return (numero * numero);
    }

}
