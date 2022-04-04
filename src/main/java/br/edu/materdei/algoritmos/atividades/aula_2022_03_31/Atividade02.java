package br.edu.materdei.algoritmos.atividades.aula_2022_03_31;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = scan.nextInt();

        int index = 2;        
        
        boolean naoEhPrimo = false;
        
        while (index < numero) { // 2-3-4-5-6-7-8-9
            if (numero % index == 0) {
                naoEhPrimo = true;                
            }
            index++;            
        }
        
        System.out.println("É primo: " + !naoEhPrimo);
    }

}
