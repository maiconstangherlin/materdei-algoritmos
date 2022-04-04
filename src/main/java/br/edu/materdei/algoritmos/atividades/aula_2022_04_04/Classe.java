package br.edu.materdei.algoritmos.atividades.aula_2022_04_04;

import java.util.Scanner;

public class Classe {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        
        int numero = scan.nextInt();        
        int i = 2;

        while (i < numero) {
            System.out.println("Validando divisão por " + i);            
            if (numero % i == 0) {
                System.out.println("Não é número primo.");
                break;
            }
            i++;
        }
        
    }

}
