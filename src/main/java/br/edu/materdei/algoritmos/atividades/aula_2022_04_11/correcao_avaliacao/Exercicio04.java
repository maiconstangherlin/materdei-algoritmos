package br.edu.materdei.algoritmos.atividades.aula_2022_04_11.correcao_avaliacao;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        int contador = 0;

        System.out.println("");

        //1º forma (repeat)
//        while (contador < numero) {
//            System.out.println(
//                    String.valueOf(numero + " ").repeat(numero)
//            );
//
//            contador++;
//        }

        // 2º forma
//        String texto = "";
//
//        while(contador < numero) {
//            texto = texto + " " + numero;
//            contador++;
//        }
//        
//        contador = 0;        
//        while(contador < numero) {
//            System.out.println(texto);
//            contador++;
//        }     

        int segundoContador = 0;

        // 3º forma
        while (contador < numero) {
            while (segundoContador < numero) {
                System.out.print(numero);
                segundoContador++;
            }
                       
            System.out.println("");
            
            segundoContador = 0;
            contador++;
        }

    }

}
