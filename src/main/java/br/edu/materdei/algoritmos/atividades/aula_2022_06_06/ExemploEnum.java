/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.materdei.algoritmos.atividades.aula_2022_06_06;

/**
 *
 * @author maico
 */
public class ExemploEnum {

    public static void main(String[] args) {

        String operacao = "+";
        OperacaoCalculadoraEnum operacaoEnum = OperacaoCalculadoraEnum.get(operacao);
        
        
        if (operacaoEnum == OperacaoCalculadoraEnum.SOMAR) {
            
        }

    }

}
