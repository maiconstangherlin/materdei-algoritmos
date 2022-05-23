package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_05_12;

public class Boletim {

    public static double mediaFinal(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // (presenças / totalAulas) * 100;
    public static double frequencia(boolean[] presencas) {
        int totalAulas = presencas.length;
        int totalPresencas = 0;

        for (int i = 0; i < presencas.length; i++) {
            if (presencas[i]) {
                totalPresencas++;
            }
        }

        return ((double) totalPresencas / (double) totalAulas) * 100;
    }

    public static void imprimeResultadoFinal(String nome, double mediaFinal, double frequencia) {
        String status = "REPROVADO";
        if (mediaFinal >= 7 && frequencia >= 75) {
            status = "APROVADO";
        }
        System.out.printf("O aluno %s com média final %s e frequência %s está %s",
                nome, mediaFinal, frequencia, status);
    }
}
