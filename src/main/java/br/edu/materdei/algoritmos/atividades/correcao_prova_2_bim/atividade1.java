package br.edu.materdei.algoritmos.atividades.correcao_prova_2_bim;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        System.out.println("Informe o ano:");
        int ano = new Scanner(System.in).nextInt();

        LocalDate primeiroDoAno = LocalDate.of(ano, Month.JANUARY, 1);
        LocalDate seteDeSetembro = LocalDate.of(ano, Month.SEPTEMBER, 7);
        LocalDate natal = LocalDate.of(ano, Month.DECEMBER, 25);

        System.out.println("1º do ano: " + primeiroDoAno.getDayOfWeek());
        System.out.println("7 de setembro: " + seteDeSetembro.getDayOfWeek());
        System.out.println("Natal: " + getNomeEmPortuges(natal.getDayOfWeek()));

    }

    private static String getNomeEmPortuges(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                return "Domingo";
            case MONDAY:
                return "Segunda-feira";
            default:
                return "";
        }
    }

}
