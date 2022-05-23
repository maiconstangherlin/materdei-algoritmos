package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_05_12;

import java.util.Random;

public class Aplicacao {

    public static void main(String[] args) {
        atividade1();
        atividade2();
        atividade3();
    }

    private static void atividade1() {
        double numero1 = 12;
        double numero2 = 5;

        //Atividade 1
        System.out.println("12 + 5 = " + Calculadora.soma(numero1, numero2));
        System.out.println("12 - 5 = " + Calculadora.subtracao(numero1, numero2));
        System.out.println("12 x 5 = " + Calculadora.multiplicacao(numero1, numero2));
        System.out.println("12 / 5 = " + Calculadora.divisao(numero1, numero2));
    }

    private static void atividade2() {
        //Atividade 2
        short idade = 28;
        double peso = 70;
        double altura = 1.79;

        System.out.println("Eh maior de idade? " + Pessoa.ehMaiorDeIdade(idade));
        Pessoa.dizerInformacao(idade, peso);
        System.out.println("IMC: " + Pessoa.imc(peso, altura));
    }

    private static void atividade3() {
//Atividade 3
        double mediaFinal = Boletim.mediaFinal(7.5, 9.5, 8.0, 6.0);

        System.out.println("A média final: " + mediaFinal);

        boolean[] presencas = criarVetorFrequencia();
        double frequencia = Boletim.frequencia(presencas);
        System.out.println("Frequência: " + frequencia);

        Boletim.imprimeResultadoFinal("Maicon", mediaFinal, frequencia);
    }

    private static boolean[] criarVetorFrequencia() {
        var randon = new Random();
        boolean[] presencas = new boolean[10];

        for (int i = 0; i < presencas.length; i++) {
            presencas[i] = randon.nextBoolean();
        }

        return presencas;
    }

}
