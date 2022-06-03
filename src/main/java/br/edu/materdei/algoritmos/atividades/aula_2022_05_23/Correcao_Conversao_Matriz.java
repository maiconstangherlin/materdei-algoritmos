package br.edu.materdei.algoritmos.atividades.aula_2022_05_23;

import javax.swing.JOptionPane;

public class Correcao_Conversao_Matriz {

    private static int row = 5;
    private static int col = 3;

    public static void main(String[] args) {
        row = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de linhas:"));
        col = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de colunas:"));

        String[][] matriz = criarMatrizPrincipal();                
        
        converterMatriz(matriz);
    }

    private static String[][] criarMatrizPrincipal() {
//        String[][] matrizA = {
//            {"A1", "B1", "C1"},
//            {"A2", "B2", "C2"},
//            {"A3", "B3", "C3"},
//            {"A4", "B4", "C4"},
//            {"A5", "B5", "C5"},                   
//        };
        String[][] matriz = new String[row][col];
        for (int i = 0; i < row; i++) {
            char caractere = 65;

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = String.valueOf(caractere) + (i + 1);
                caractere++;
            }
        }
        return matriz;
    }

    private static void converterMatriz(String[][] matrizPrincipal) {
        String[][] matrizInvertida = new String[col][row];

        for (int row = 0; row < matrizPrincipal.length; row++) {
            for (int col = 0; col < matrizPrincipal[row].length; col++) {
                matrizInvertida[col][row] = matrizPrincipal[row][col];

                System.out.print(matrizPrincipal[row][col] + " | ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < matrizInvertida.length; i++) {
            for (int j = 0; j < matrizInvertida[i].length; j++) {
                System.out.print(matrizInvertida[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
