package br.edu.materdei.algoritmos.atividades.correcao_prova_2_bim;

import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe os valores de A, B e C: ");
        double valorA = scan.nextDouble();
        double valorB = scan.nextDouble();
        double valorC = scan.nextDouble();                
        
        System.out.println("X = " + ((valorB * valorC) / valorA));
        
    }

}
