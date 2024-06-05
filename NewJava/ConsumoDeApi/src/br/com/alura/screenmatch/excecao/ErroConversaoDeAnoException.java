package br.com.alura.screenmatch.excecao;

public class ErroConversaoDeAnoException extends RuntimeException {
    private String msg;

    public ErroConversaoDeAnoException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage(){
        return this.msg;
    }
}
