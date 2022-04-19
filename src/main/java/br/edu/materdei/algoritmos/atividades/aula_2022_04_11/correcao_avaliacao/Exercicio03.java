package br.edu.materdei.algoritmos.atividades.aula_2022_04_11.correcao_avaliacao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        final int DIAS_ANO = 365;
        final int DIAS_MES = 30;

        System.out.println("Informe o número de dias: ");
        int totalDias = scanner.nextInt();

        int anos = totalDias / DIAS_ANO;
        int meses = totalDias % DIAS_ANO / DIAS_MES;
        int dias = totalDias % DIAS_ANO % DIAS_MES;
        
        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);               
        
    }

}
