package br.edu.materdei.algoritmos.variaveis;

public class TipoString {

    public static void main(String[] args) {
        
        // Índice      0123456.... 
        String nome = "Maicon Stangherlin";
        
        // Retornar a quantidade de caracteres
        System.out.println(nome.length());
        
        // Retorna o caractere de um determinado índice, neste caso o primeiro caractere
        System.out.println(nome.charAt(0));
        
        // Retorna o índice de um determinado caractere
        System.out.println(nome.indexOf(" "));
        
        // Pega o texto contido num intervalo de índice
        System.out.println(nome.substring(0, 6));
        
        
        String numero = "1234";
        int num1 = numero.charAt(0);
        
        System.out.println(num1);
                
    }
    
}
