package br.edu.materdei.algoritmos.atividades.aula_2022_05_09;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double num1 = scan.nextDouble();

        System.out.println("Informe outro número: ");
        double num2 = scan.nextDouble();

        System.out.println(num1 + " x " + num2 + " = "
                + multiplica(num1, num2));
    }

    private static double multiplica(double num1, double num2) {
        return num1 * num2;
    }

}
