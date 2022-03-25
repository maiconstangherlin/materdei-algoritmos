package br.edu.materdei.algoritmos.atividades.aula_2022_03_24;

import java.util.Scanner;

public class ReajusteDeSalario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Informe seu salário atual:");
        double salario = scan.nextDouble();

        System.out.println("Informe sua função: ");
        String funcao = scan.next();

        double salarioReajustado = 0;

        switch (funcao.toUpperCase()) {
            case "PEDREIRO":
                salarioReajustado = salario * 1.15;
                break;
            case "ARQUITETO":
                salarioReajustado = salario * 1.17;
                break;
            // demais CASEs             
        }

        System.out.println("Salário reajustado: " + salarioReajustado);
    }

}
