package br.edu.materdei.algoritmos.variaveis;

public class Vetores {

    public static void main(String[] args) {

        // Opções de declaração
        String[] n1 = new String[2];
        String n2[] = new String[2];
        var n3 = new String[2];

        // Atribuindo valores
        n1[0] = "Valor da primeira posição";
        n1[1] = "Valor da segunda posição";
        n1[2] = "Valor da terceira posição";

        // Percorrendo um vetor com FOR
        for (int i = 0; i < n1.length; i++) {
            // Imprime o valor da posição 'i' do vetor 'n1'
            System.out.println(n1[i]);
        }

        // Percorrendo um vetor com FOR EACH
        for (String n : n1) {
            System.out.println(n);
        }

    }

}
