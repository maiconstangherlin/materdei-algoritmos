package br.edu.materdei.algoritmos.atividades.correcao_ativ_2022_05_24;

import javax.swing.JOptionPane;

public class Ativ_02 {

    public static void main(String[] args) {
        double celsius = Double.valueOf(
                JOptionPane.showInputDialog("Informe a temperatura em º Celsius"));

        double fahrenheit = convertToFahrenheit(celsius);

        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é " + fahrenheit);
    }

    private static double convertToFahrenheit(double celsius) {
        // C x 1,8 + 32
        return celsius * 1.8 + 32;
    }

}
