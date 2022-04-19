package br.edu.materdei.algoritmos.atividades.aula_2022_04_18;

import java.util.Scanner;

public class ForTeste {

    public static void main(String[] args) {
//        int index = 0;
//        while (index < 10) {
//            System.out.println("Imprimindo o nro: " + index);
//            index++;
//        }
//
//        index = 10;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Imprimindo o nro: " + i);
//        }

        var scanner = new Scanner(System.in);

        System.out.println("Informe um texto: ");
        String texto = scanner.next();

        int contador = texto.length() - 1;
        String textoInvertido = "";

        while (contador >= 0) {
            textoInvertido = textoInvertido + texto.charAt(contador);
            contador--;
        }
        System.out.println("Texto invertido: " + textoInvertido);

        textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);

    }

}
