package br.edu.materdei.algoritmos.atividades.aula_2022_03_24;

import java.util.Scanner;

public class RegioesEstadosBrasil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Informe a região do Brasil: ");
        String regiao = scan.next();

        switch (regiao.toUpperCase()) {
            case "SUL":
                System.out.println("RS, SC e PR");
                break;
            case "NORTE":
                System.out.println("AM, AC, RR, PA, TO, AM e RO");
                break;
            // Fazer o case das demais regiões
            default:
                System.out.println("Região inválida...");
        }

    }

}
