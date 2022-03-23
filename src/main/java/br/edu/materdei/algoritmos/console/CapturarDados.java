package br.edu.materdei.algoritmos.console;

import java.util.Scanner;

public class CapturarDados {

    public static void main(String[] args) {
        
        // A classe Scanner é uma das opções para capturarmos
        // os dados inseridos pelo usuário no console
        Scanner scan = new Scanner(System.in);
            
        // Configurando scanner pra considerar a quebra de linha como 
        // limite de captura
        Scanner scan2 = new Scanner(System.in).useDelimiter("\n");
        
        
        // Para capturar os dados digitados pelo usuário basta
        // usar o métodos next() do scan
        
        int numero = scan2.nextInt();
        float moeda = scan2.nextFloat();        
        String texto = scan2.next();
        
        // entre outros
    }
    
}
