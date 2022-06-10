package br.edu.materdei.algoritmos.atividades.aula_2022_06_09;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exemplo01 {

    static final double PI = 3.14435;

    public static void main(String[] args) {
        int raio = 10;
        System.out.println(PI * (raio * raio));

        LocalDate hoje = LocalDate.now();
        DayOfWeek diaDaSemana = hoje.getDayOfWeek();

        imprimeDiaDaSemana(diaDaSemana);

    }

    private static void imprimeDiaDaSemana(DayOfWeek diaDaSemana) {

        switch (diaDaSemana) {
            case MONDAY:
                System.out.println("Segunda-feira");
                break;
            case TUESDAY:
                System.out.println("Terça-feira");
                break;
            case WEDNESDAY:
                System.out.println("Quarta-feira");
                break;
            case THURSDAY:
                System.out.println("Quinta-feira");
                break;
        }

    }

}
