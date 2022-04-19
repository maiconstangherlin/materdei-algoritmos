package br.edu.materdei.algoritmos.atividades.aula_2022_04_11.correcao_avaliacao;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um texto: ");
        String texto = scanner.next();

        int contador = texto.length() - 1;
        String textoInvertido = "";

        while (contador >= 0) {
//            System.out.print(texto.charAt(contador));
            textoInvertido = textoInvertido + texto.charAt(contador);
            contador--;
        }

        System.out.println("Texto invertido: " + textoInvertido);
    }

}
