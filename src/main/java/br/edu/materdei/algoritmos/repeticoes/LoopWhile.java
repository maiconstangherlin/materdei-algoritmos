package br.edu.materdei.algoritmos.repeticoes;

public class LoopWhile {

    public static void main(String[] args) {

        // Mantém o loop enquanto a expressão for verdadeira
        while (true) {

            break; // Para "bruscamente" a execução do laço de repetição
        }

        String comando = "update";
        boolean exit = comando.equals("exit");

        while (!exit) {
            System.out.println("Executar comando " + comando);
        }
    }

}
