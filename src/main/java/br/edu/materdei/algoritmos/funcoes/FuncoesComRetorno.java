package br.edu.materdei.algoritmos.funcoes;

public class FuncoesComRetorno {

    public static void main(String[] args) {

        // A função 'ehDivisivel()' retorna true se 10 for divisível por 3
        // ou false se não for divisível
        if (ehDivisivel(10, 3)) {
            System.out.println("É divisível");
        } else {
            System.out.println("Não é divisível");
        }

        // A função 'quadradoDe()' retorna o valor do número passado
        // por parâmetro ao quadrado
        System.out.println("Quadrado de 5 é: " + quadradoDe(5));
    }

    private static boolean ehDivisivel(int numero, int divisivel) {
        return (numero % divisivel == 0);
    }

    private static int quadradoDe(int numero) {
        return numero * numero;
    }
}
