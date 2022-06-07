package br.edu.materdei.algoritmos.atividades.aula_2022_06_06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Exemplo {

    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDateTime horaAtual = LocalDateTime.now();
        
        
        System.out.println(agora);
        System.out.println(horaAtual);
        
        // 10/06/2022
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate diaDezDeJunho = LocalDate.parse("10/06/2022", formatter);
        
        System.out.println(diaDezDeJunho);
        
        LocalDate fimDasParcelas = diaDezDeJunho.plusMonths(360);        
        
        System.out.println(fimDasParcelas);
    }

}
