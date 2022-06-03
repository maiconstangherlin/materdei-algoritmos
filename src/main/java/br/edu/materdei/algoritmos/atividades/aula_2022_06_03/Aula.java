package br.edu.materdei.algoritmos.atividades.aula_2022_06_03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Aula {

    static String nome = "Maicon";
    
    public static String nome2 = "Maicon";
    
    public static void main(String[] args) {
        
        LocalDate localDate;
        localDate = LocalDate.of(2022, Month.JUNE, 5);

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yy").format(localDate));
        System.out.println(DateTimeFormatter.ofPattern("d/M/y").format(localDate));        
        
        nome = "main";       
        teste();
        
        System.out.println(nome);
    }

    public static void teste() { 
        nome2 = "teste";
    }
}
