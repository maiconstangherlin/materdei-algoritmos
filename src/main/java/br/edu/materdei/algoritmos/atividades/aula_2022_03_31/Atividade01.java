package br.edu.materdei.algoritmos.atividades.aula_2022_03_31;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int index = 1;
        
        System.out.println("Tabuada de qual número? ");
        int numeroUsuario = scan.nextInt();
        
        System.out.println("E o tamanho da tabuada? ");
        int limiteTabuada = scan.nextInt();

        while (index <= limiteTabuada) {
            System.out.println(numeroUsuario + 
                    " x " + 
                    index + 
                    " = " + 
                    (numeroUsuario * index));
                       
            index ++;            
        }

    }

}
