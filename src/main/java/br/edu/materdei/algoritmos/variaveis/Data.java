package br.edu.materdei.algoritmos.variaveis;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void main(String[] args) {

        //Retorna a data atual (sem horas)
        LocalDate dataAtual = LocalDate.now();

        //Adiciona 15 dias a data atual
        LocalDate dataMais15Dias = dataAtual.plusDays(15);
        
        //Diminui 1 mês da data atual
        LocalDate dataMenos1Mes = dataAtual.minusMonths(1);
        
        //Retorna o mês da data atual (enum Month)
        Month mes = dataAtual.getMonth();
        
        String dataBrasil = "25/12/2022";
        
        //Transformar String em LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataBrasilLocalDate = LocalDate.parse(dataBrasil, formatter);
        
        //Transformar LocalDate em String 
        String dataBrasilFormatada = dataBrasilLocalDate.format(formatter);
        
    }

}
