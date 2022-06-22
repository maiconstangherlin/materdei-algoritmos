package br.edu.materdei.algoritmos.atividades.correcao_trabalho_2022_06_13;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import javax.swing.JOptionPane;

public class Atividade2 {

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Informe o sexo do comprador:");

        if (sexo.equalsIgnoreCase("M")) {
            JOptionPane.showMessageDialog(null, "Valor total: R$ 40,00");
        } else {
            LocalDateTime agora = LocalDateTime.now();
            int hora = agora.getHour();

            if (hora == 19 || hora == 20) {
                JOptionPane.showMessageDialog(null, "Entrada livre!");
            } else {
                JOptionPane.showMessageDialog(null, "Valor total: R$ 20,00");
            }
        }       

    }

}
