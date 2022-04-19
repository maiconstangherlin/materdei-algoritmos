package br.edu.materdei.algoritmos.atividades.aula_2022_04_11.correcao_avaliacao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        final int VIABILIDADE_GASOLINA = 70;

        System.out.println("Informe o preço do alcool: ");
        double precoAlcool = scanner.nextDouble();

        System.out.println("Informe o preço da gasolina: ");
        double precoGasolina = scanner.nextDouble();

        // Regra de 3
        //double total = (precoAlcool * 100) / precoGasolina;
        //System.out.println("Total: " + total);
        //Outra opção
        double percentualAlcool = (precoAlcool / precoGasolina) * 100;

        System.out.println("Álcool é " + percentualAlcool + " % do valor da gasolina");

        if (percentualAlcool > VIABILIDADE_GASOLINA) {
            System.out.println("A gasolina é mais viável");
        } else {
            System.out.println("O álcool é mais viável");
        }

    }

}
