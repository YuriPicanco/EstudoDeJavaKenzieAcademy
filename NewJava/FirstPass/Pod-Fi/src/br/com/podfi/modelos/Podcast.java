package br.com.podfi.modelos;

public class Podcast  extends Audio{
    private String apresentador;
    private String descricao;

    public Podcast(String titulo){
        this.setTitulo(titulo);
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
