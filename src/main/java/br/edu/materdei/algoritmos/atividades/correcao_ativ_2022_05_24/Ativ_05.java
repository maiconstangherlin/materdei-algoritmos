package br.edu.materdei.algoritmos.atividades.correcao_ativ_2022_05_24;

import java.util.Random;

public class Ativ_05 {

    public static void main(String[] args) {               
        String fraseOriginal = "Bem vindo ao TDC Florianópolis";        
        String[] fraseVetor = fraseOriginal.split(" ");        
        
        Random randon = new Random();
        int qtdPalavras = fraseVetor.length;
        int palavrasInvertidas = 0;
        String fraseInvertida = "";                
        int[] numerosGerados = new int[qtdPalavras];
        
        while(palavrasInvertidas < qtdPalavras) { 
            int index = randon.nextInt(qtdPalavras - 1);
            numerosGerados[palavrasInvertidas] = index;
            
            String palavra = fraseVetor[index];            
            fraseInvertida += palavra + " ";
            
            palavrasInvertidas++;
        }        
        
        System.out.println(fraseInvertida);
    }
    
    
}
