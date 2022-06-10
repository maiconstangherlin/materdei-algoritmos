package br.edu.materdei.algoritmos.atividades.aula_2022_06_09;

public class TesteEnum {

    public static void main(String[] args) {
        transfereCarga(Estados.PARANA, Estados.BAHIA);
        importaDoEstado(Estados.RIO_GRANDE_DO_SUL);
    }

    static void transfereCarga(Estados origem, Estados destino) {
        System.out.println("Transferindo de " + origem.getNome()
                + " para " + destino.getNome());
    }

    static void importaDoEstado(Estados estado) {
        System.out.println("Importando para o estado: " + estado.getNome());
    }
}
