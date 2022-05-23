package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_05_12;

public class Pessoa {

    public static boolean ehMaiorDeIdade(short idade) {
//        if (idade > 17) {
//            return true;
//        } else {
//            return false;
//        }        
        return (idade > 17);
    }

    public static void dizerInformacao(short idade, double peso) {
        //System.out.println("Eu tenho " + idade + " anos e peso " + peso + " kgs");        
        System.out.printf("Eu tenho %s anos e peso %s kgs \n", idade, peso);
    }

    // peso / altura²
    public static double imc(double peso, double altura) {
        //return peso / Math.pow(peso, 2);
        return peso / (altura * altura);
    }

}
