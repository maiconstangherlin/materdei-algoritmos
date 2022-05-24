package br.edu.materdei.algoritmos.atividades.aula_2022_05_23;

public class Atividade_Conversao_Matriz {

    private static final int MATRIZ_LINHA = 5;
    private static final int MATRIZ_COLUNA = 3;

    public static void main(String[] args) {
        String[][] matrizA = criarMatrizA();
        converterMatriz(matrizA);
    }

    private static String[][] criarMatrizA() {
        String[][] matriz = new String[MATRIZ_LINHA][MATRIZ_COLUNA];        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = "A" + (i + 1);
            matriz[i][1] = "B" + (i + 1);
            matriz[i][2] = "C" + (i + 1);
        }
        return matriz;
    }

    private static void converterMatriz(String[][] matrizA) {
        String[][] matrizB = new String[MATRIZ_COLUNA][MATRIZ_LINHA];
        
        for (int row = 0; row < matrizA.length; row++) {
            for (int col = 0; col < matrizA[row].length; col++) {
                matrizB[col][row] = matrizA[row][col];                               
            }            
        }
        
        for (int row = 0; row < matrizB.length; row++) {
            for (int col = 0; col < matrizB[row].length; col++) {
                System.out.print(matrizB[row][col] + " | ");                
            }
            System.out.println();
        }
    }
}
