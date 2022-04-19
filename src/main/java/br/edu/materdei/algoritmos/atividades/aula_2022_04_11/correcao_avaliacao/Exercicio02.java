package br.edu.materdei.algoritmos.atividades.aula_2022_04_11.correcao_avaliacao;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o código do produto: ");
        int codigoProduto = scanner.nextInt();

        System.out.println("Informe a quantidade: ");
        int quantidade = scanner.nextInt();

        double precoProduto = 0;

//        if (codigoProduto == 1001) {
//            precoProduto = 5.32;
//        } else if (codigoProduto == 1002) {
//            precoProduto = 6.45;
//        } else if (codigoProduto == 1003) {
//            precoProduto = 2.37;
//        } else if (codigoProduto == 1004) {
//            precoProduto = 5.32;
//        } else if (codigoProduto == 1005) {
//            precoProduto = 6.45;
//        }
//
//        System.out.println("Valor total: "
//                + (quantidade * precoProduto));

//        switch (codigoProduto) {
//            case 1001:
//                precoProduto = 5.32;
//                break;
//            case 1002:
//                precoProduto = 6.45;
//                break;
//            case 1003:
//                precoProduto = 2.37;
//                break;
//            case 1004:
//                precoProduto = 5.32;
//                break;
//            case 1005:
//                precoProduto = 6.45;
//                break;
//        }   
        
        if (codigoProduto == 1001 || codigoProduto == 1004) {
            precoProduto = 5.32;
        } else if (codigoProduto == 1002 || codigoProduto == 1005) {
            precoProduto = 6.45;
        } else if (codigoProduto == 1003) {
            precoProduto = 2.37;        
        }

        System.out.println("Valor total: "
                + (quantidade * precoProduto));
    }

}
