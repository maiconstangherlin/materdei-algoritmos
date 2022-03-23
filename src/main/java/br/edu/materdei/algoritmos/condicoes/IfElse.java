package br.edu.materdei.algoritmos.condicoes;

public class IfElse {

    public static void main(String[] args) {

        int numero = 10;

        // Validação simples
        if (numero == 10) {
            // Entra aqui somente se a condição acima for verdadeira
        }

                
        // Validação considerando condição não atendida
        if (numero == 9) {
            // Entra aqui somente se a condição acima for verdadeira
        } else {
            // Entra aqui se a condição não for verdadeira
        }

        
        // Validação considerando outras condições
        if (numero > 12) {
            // Entra aqui somente se a condição acima for verdadeira
        } else if (numero  > 6) {
            // Entra aqui somente se a condição acima for verdadeira
        } else {
            // Entra aqui se nenhuma condição acima for verdadeira
        }

    }

}
