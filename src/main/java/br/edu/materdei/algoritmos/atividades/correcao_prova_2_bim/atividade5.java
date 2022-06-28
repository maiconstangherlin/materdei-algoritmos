package br.edu.materdei.algoritmos.atividades.correcao_prova_2_bim;

import java.util.Arrays;
import java.util.Scanner;

public class atividade5 {

    static final int TOTAL_ASSENTOS = 90;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] assentos = criarVetorAssentos();

        System.out.println("Bem-vindo ao vôo não sei o que...");

        String relatorio = "";
        int indexAssento = 0;

        while (indexAssento < TOTAL_ASSENTOS) {
            System.out.println("Informe o nome do próximo passageiro: ");
            String passageiro = scan.next();

            if (passageiro.equals("X")) {
                break;
            }

            String codAssento = assentos[indexAssento];
            System.out.println("Assento '" + codAssento + "' reservado: "
                    + getValor(codAssento));

            relatorio += "Assento: " + codAssento + " - " + passageiro + " \n";

            indexAssento++;
        }

        System.out.println();
        System.out.println(relatorio);               
    }

    private static double getValor(String codAssento) {
        String codAssentoSemLetra;

        if (codAssento.length() == 2) {
            codAssentoSemLetra = codAssento.substring(0, 1);
        } else {
            codAssentoSemLetra = codAssento.substring(0, 2);
        }

        int numero = Integer.valueOf(codAssentoSemLetra);

        if (numero >= 1 && numero <= 5) {
            return 2000;
        } else if (numero <= 14) {
            return 1500;
        } else {
            return 1250;
        }
    }

    private static String[] criarVetorAssentos() {
        String[] assentos = new String[TOTAL_ASSENTOS];

        int numVetor = 0;
        int numAssento = 1;

        while (numVetor < TOTAL_ASSENTOS) {
            assentos[numVetor] = numAssento + "A";
            numVetor++;

            assentos[numVetor] = numAssento + "B";
            numVetor++;

            assentos[numVetor] = numAssento + "C";
            numVetor++;

            assentos[numVetor] = numAssento + "D";
            numVetor++;

            assentos[numVetor] = numAssento + "E";
            numVetor++;

            assentos[numVetor] = numAssento + "F";
            numVetor++;
            numAssento++;
        }

        return assentos;
    }

}
