package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_06_13;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do financiamento: ");
        double valorFinanciamento = scan.nextDouble();

        System.out.println("Quantidade de parcelas:");
        int qtdParcelas = scan.nextInt();

        System.out.println("Dia do mês para pagamento:");
        int diaDoMes = scan.nextInt();

        System.out.println("Taxa de juros: ");
        double txJuro = scan.nextDouble();

        LocalDate proximo = LocalDate.now().plusMonths(1);

        LocalDate inicioFinanciamento = LocalDate
                .of(proximo.getYear(), proximo.getMonth(), diaDoMes);

        LocalDate fimFinanciamento = inicioFinanciamento
                .plusMonths(qtdParcelas);

        System.out.println("Primeira parcela: " + inicioFinanciamento);
        System.out.println("Última parcela: " + fimFinanciamento);

        double txJuroDecimal = txJuro / 100;
        double totalJuros = valorFinanciamento * txJuroDecimal;

        // não precisa necessariamente calcular o juro com base nas parcelas
//        for (int i = 1; i <= qtdParcelas; i++) {
//            totalJuros += (valorParcela * txJuroDecimal);
//        }                
        System.out.println("Valor total dos juros: R$ " + totalJuros);
        System.out.println("Valor total financiamento: R$ "
                + (valorFinanciamento + totalJuros));

        // primeira parcela
        // diaUsuario / proximoMes / anoProximoMes
        // 20/07/2022
        // 20/01/2023
    }

}
