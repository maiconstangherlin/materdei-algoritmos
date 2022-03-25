package br.edu.materdei.algoritmos.condicoes;

public class SwitchCase {

    public static void main(String[] args) {

        int numero = 10;

        /* O switch também é um operador de condição, assim com o IF
           porém, possui maior desempenho e uma sintáxe mais simplificada.
         */
        // Modelo padrão do switch
        switch (numero) {
            case 9:
                System.out.println("numero 9");
                // o break diz que nada a mais deve ser executado dentro do switch
                break;
            case 10:
                System.out.println("numero 10");
                break;
            default:
                System.out.println("default");
        }

        String estado = "PR";
        
        // Usando switch para validar Strings
        switch (estado) {
            case "RS":
                System.out.println("Rio Grande do Sul");
                break;
            case "SC":
                System.out.println("Santa Catarina");
                break;
            case "PR":
                System.out.println("Paraná");
                break;
            default:
                System.out.println("Estado inválido");
        }

        
        // Nova sintaxe do switch nas versões mais recentes do java
        // Obs.: a sintaxe antiga continua disponível
        switch (numero) {
            case 9 -> {
                System.out.println("numero 9");
                System.out.println("outra mensagem");
            }
            case 10 ->
                System.out.println("numero 10");
            default ->
                System.out.println("default");
        }

    }

}
