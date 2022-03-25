package br.edu.materdei.algoritmos.condicoes;

public class IfTernario {

    public static void main(String[] args) {

        /* O IF ternário tem a função de fazer uma validação curta, ou seja,
           é um IF reduzido/simplificado. 
        
           A sintaxe dele é: 
               {expressao} ? {seExpressaoVerdadeira} : {seExpressaoFalsa}
         */
        String sexo = "F";
        String sexoDescricao = sexo.equals("F") ? "Feminino" : "Masculino";

        System.out.println("Descrição: " + sexoDescricao);

        // Se fossemos converter o IF ternário acima em um IF padrão, ficaria:
        if (sexo.equals("F")) {
            sexoDescricao = "Feminino";
        } else {
            sexoDescricao = "Masculino";

        }
    }

}
