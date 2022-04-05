package br.edu.materdei.algoritmos.atividades.aula_2022_04_04;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        var scan = new Scanner(System.in).useDelimiter("\n");
        int i = 1;

        int maior = -1000000000;
        int menor = 1000000000;
        double soma = 0;        
        String numeroPares = "";
        String numeroImpares = "";
        
        while (i <= 5) {
            System.out.println("Informe o " + i + "º número: ");
            int numero = scan.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) { 
                menor = numero;
            }                        
 
            soma = soma + numero;
            
            if (numero % 2 == 0) {
                numeroPares = numeroPares + " - " + numero;
            } else {
                numeroImpares = numeroImpares + " - " + numero;
            }
            
            i++;
        }

        System.out.println("O maior número é o: " + maior);
        System.out.println("O menor número é o: " + menor);
        System.out.println("A média dos números é: " + (soma / 5));
        System.out.println("Números pares: " + numeroPares);
        System.out.println("Números ímpares: " + numeroImpares);
    }

}
