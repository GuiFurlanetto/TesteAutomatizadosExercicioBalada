package service;

public class Pessoa {
    private String nome;
    private int idade;
    private boolean acompanhada;


    public Pessoa(String nome, int idade, boolean acompanhada) {
        this.nome = nome;
        this.idade = idade;
        this.acompanhada = acompanhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAcompanhada() {
        return acompanhada;
    }

    public void setAcompanhada(boolean acompanhada) {
        this.acompanhada = acompanhada;
    }
}
