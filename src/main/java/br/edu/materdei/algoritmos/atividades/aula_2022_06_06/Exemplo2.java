package br.edu.materdei.algoritmos.atividades.aula_2022_06_06;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe uma data: ");
        String dataUsuario = scan.next();
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataUsuario, format);
        
        DayOfWeek diaDaSemana = data.getDayOfWeek();
        int diasDoMes = data.lengthOfMonth();
        Month mes = data.getMonth();
        boolean ehBissexto = data.isLeapYear();               
        
        System.out.println("Dia da semana: " + diaDaSemana);
        System.out.println("Qts dias tem o mês: " + diasDoMes);
        System.out.println("O mês é: " + mes);
        System.out.println("É ano bissexto: " + ehBissexto);
        
    }
    
}
