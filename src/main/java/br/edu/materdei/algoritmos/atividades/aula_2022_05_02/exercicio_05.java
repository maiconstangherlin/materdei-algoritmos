package br.edu.materdei.algoritmos.atividades.aula_2022_05_02;

import java.util.Scanner;

public class exercicio_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        int kmsPercorridos = 0;
        int velocidadeMedia = 0;

        while (true) {
            System.out.println("->>: ");
            String comando = scan.next();

            if (comando.equalsIgnoreCase("stop")) {
                break;
            } else if (comando.equalsIgnoreCase("left")
                    || comando.equalsIgnoreCase("right")) {
                
                System.out.println("Quantos Km? ");
                kmsPercorridos += scan.nextInt();                
            } else if (comando.equalsIgnoreCase("speed")) {
                System.out.println("Quantos Km/h? ");
                int kmh = scan.nextInt();
                velocidadeMedia = (velocidadeMedia + kmh) / 2;
            }
        }

        System.out.println("=================");
        System.out.println("Total de Km percorridos: " + kmsPercorridos);
        System.out.println("Média de Km/h: " + velocidadeMedia);
        
    }

}
