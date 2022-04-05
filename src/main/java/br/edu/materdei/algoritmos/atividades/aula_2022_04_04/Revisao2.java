package br.edu.materdei.algoritmos.atividades.aula_2022_04_04;

import java.util.Scanner;

public class Revisao2 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in).useDelimiter("\n");        
        
        int i = 0;               
        
        while (i < 10) {
            i++;
            
            System.out.println("Informe um comando: ");
            String comando = scan.next();
            boolean sair = comando.equalsIgnoreCase("exit");

            if (sair) {
                break;
            } else if (comando.equals("tabuada")) {
                System.out.println("Imprimindo a tabuada; ");
            } else if (comando.equals("dataatual")) {
                System.out.println("2022-04-04");
            } else  {
                System.out.println("Comando inválido");
            }
                      
            
        }

    }

}
