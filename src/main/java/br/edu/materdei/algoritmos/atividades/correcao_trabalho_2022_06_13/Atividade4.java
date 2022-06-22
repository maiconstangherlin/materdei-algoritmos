package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_06_13;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os valores de A, B e C: ");
        double a = -10; //scan.nextDouble();
        double b = 5; //scan.nextDouble();
        double c = 15; //scan.nextDouble();

        imprimeResultado(a, b, c, true);
        imprimeResultado(a, b, c, false);
    }

    private static void imprimeResultado(double a, double b, double c,
            boolean ehMais) {
        
        double delta = getDelta(a, b, c);
        double divisor = getDivisor(a);
        double resultado = 0;
        
        if (ehMais) {
            resultado = (-b + Math.sqrt(delta)) / divisor;
        } else {
            resultado = (-b - Math.sqrt(delta)) / divisor;
        }
        
        System.out.println("Resultado: " + resultado);
    }

    private static double getDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    private static double getDivisor(double a) {
        return 2 * a;
    }

}
