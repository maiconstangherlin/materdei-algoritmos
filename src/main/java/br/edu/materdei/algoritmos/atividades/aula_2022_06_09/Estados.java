package br.edu.materdei.algoritmos.atividades.aula_2022_06_09;

public enum Estados {
    PARANA("Paraná"),
    SANTA_CATARINA("Santa Catarina"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul"),
    BAHIA("Bahia"),
    SAO_PAULO("São Paulo");

    Estados(String nome) {
        this.nome = nome;
    }

    private String nome;
    
    public String getNome() {
        return this.nome;
    }
}
