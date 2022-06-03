package br.edu.materdei.algoritmos.atividades.correcao_ativ_2022_05_24;

import java.util.Scanner;

public class Ativ_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o 1º num: ");
        double num1 = scan.nextDouble();

        System.out.println("Informe a operação: ");
        String operacao = scan.next();

        System.out.println("Informe o 2º num: ");
        double num2 = scan.nextDouble();
        
        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = somar(num1, num2);
                break;
            case "-":
                resultado = subtrair(num1, num2);
                break;
            case "x":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!!!");
        }
        
        System.out.println("O resultado é: " + resultado);
    }

    private static double somar(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    private static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
