package br.edu.materdei.algoritmos.funcoes;

public class FuncoesVoid {

    public static void main(String[] args) {
        
        // Funções void executam um algoritmo sem retornar valor 
        // a quem chamou
        imprimaTabuada(10);
        
        System.out.println("");
        
        imprimaTabuada(20);
    }

    private static void imprimaTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

}
