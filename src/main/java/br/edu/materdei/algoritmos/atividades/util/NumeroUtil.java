package br.edu.materdei.algoritmos.atividades.util;

public class NumeroUtil {

    public static boolean ehPar(int numero) {
//        return (numero % 2 == 0);
        return ehDivisivel(numero, 2);
    }

    public static boolean ehDivisivelPorTres(int numero) {
//        return (numero % 3 == 0);
        return ehDivisivel(numero, 3);
    }

    private static boolean ehDivisivel(int numero, int divisor) {
        return (numero % divisor == 0);
    }

}
