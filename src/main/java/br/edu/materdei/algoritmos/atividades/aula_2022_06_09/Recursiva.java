/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.materdei.algoritmos.atividades.aula_2022_06_09;

/**
 *
 * @author maico
 */
public class Recursiva {

    public static void main(String[] args) {
        imprime(100);
        
        int resultado = fatorial(10); //120
        System.out.println("Resultado: " + resultado);
    }

    static void imprime(int numero) {
        System.out.println(numero);
        
        if (numero == 0) {
            return;
        }
        
        imprime(numero - 1);        
    }

    static int fatorial(int numero) {
        // 5 * 4 * 3 * 2 * 1
        // 5 * fatorial(4)
        
        if (numero <= 1) {
            return 1;
        }
        
        int resultado = numero * fatorial(numero - 1);
        return resultado;
    }
    
}
