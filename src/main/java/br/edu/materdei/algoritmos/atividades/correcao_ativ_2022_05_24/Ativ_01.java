package br.edu.materdei.algoritmos.atividades.correcao_ativ_2022_05_24;

import javax.swing.JOptionPane;

public class Ativ_01 {

    public static void main(String[] args) {
        int numero[] = new int[3];

        numero[0] = pegarNumero();
        numero[1] = pegarNumero();
        numero[2] = pegarNumero();

        int posicaoMenorNumero = 0;
        int menorNumero = Integer.MAX_VALUE;

        // Percorre todo o vetor (considerando o tamanho dele)
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < menorNumero) {
                menorNumero = numero[i];
                posicaoMenorNumero = i;
            }
        }

        int somaMaioresNumeros = 0;

        for (int i = 0; i < numero.length; i++) {
            if (i != posicaoMenorNumero) {
                somaMaioresNumeros += numero[i];
            }
        }

        JOptionPane.showMessageDialog(null, "A soma é " + somaMaioresNumeros);
    }

    private static int pegarNumero() {
        return Integer.valueOf(JOptionPane.showInputDialog("Informe um número"));
    }
}
