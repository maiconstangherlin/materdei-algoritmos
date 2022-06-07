package br.edu.materdei.algoritmos.atividades.aula_2022_06_06;

public enum OperacaoCalculadoraEnum {

    SOMAR,
    SUBTRAIR,
    MULTIPLICAR,
    DIVIDIR;

    public static OperacaoCalculadoraEnum get(String operacao) {
        if (operacao.equals("+") || 
                operacao.equalsIgnoreCase("mais") || 
                operacao.equalsIgnoreCase("somar")) {
            return SOMAR;
        }
        return null;
    }
}
