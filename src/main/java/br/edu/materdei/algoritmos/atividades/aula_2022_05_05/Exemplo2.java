package br.edu.materdei.algoritmos.atividades.aula_2022_05_05;

import br.edu.materdei.algoritmos.atividades.util.StringUtil;
import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {

        System.out.println("10 - " + ehPar(10));
        System.out.println("09 - " + ehPar(9));

        System.out.println(StringUtil.inverter("Maicon"));

    }

    private static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
