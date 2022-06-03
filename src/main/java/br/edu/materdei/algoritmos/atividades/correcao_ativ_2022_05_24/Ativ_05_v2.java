package br.edu.materdei.algoritmos.atividades.correcao_ativ_2022_05_24;

import java.util.Arrays;
import java.util.Random;

public class Ativ_05_v2 {

    public static void main(String[] args) {
        String fraseOriginal = "Bem vindo ao TDC Florianópolis";
        String[] fraseVetor = fraseOriginal.split(" ");

        String[] fraseAleatoriaVetor = new String[fraseVetor.length];
        int qtdPalavras = fraseVetor.length;

        for (int i = 0; i < fraseVetor.length; i++) {
            int indexInverso = getIndexInverso(fraseAleatoriaVetor, qtdPalavras);            
            fraseAleatoriaVetor[indexInverso] = fraseVetor[i] + " ";
        }
        
        for (int i = 0; i < fraseAleatoriaVetor.length; i++) {
            System.out.print(fraseAleatoriaVetor[i]);
        }
    }

    private static int getIndexInverso(String[] vetorAleatorio, int qtdPalavras) {
        Random randon = new Random();
        while (true) {
            int index = randon.nextInt(qtdPalavras);
            if (vetorAleatorio[index] == null) {
                return index;
            }
        }
    }

}
