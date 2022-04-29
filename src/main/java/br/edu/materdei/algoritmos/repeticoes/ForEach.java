package br.edu.materdei.algoritmos.repeticoes;

public class ForEach {

    public static void main(String[] args) {

        /* 
        O for each oferece uma sintaxe mais breve para os casos em 
        que queremos percorrer todo o vetor/array.
        */

        int[] vetor = {1, 2, 3, 4, 5};

        // Versão com FOR
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        // Versão com FOR EACH (mesmo resultado do código acima)
        for (int n : vetor) {
            System.out.println(n);
        }

    }

}
