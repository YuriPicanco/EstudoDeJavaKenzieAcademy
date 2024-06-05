package org.example;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.example.GeradorDeArquivo.geraArquivo;


public class ConsultaCEP {
    private String cep;
    private String logradouro;
    private String localidade;
    private String uf;


    public ConsultaCEP(String cep) throws IOException, InterruptedException {

        Endereco endereco = buscaEndereco(cep);

        TrataCEP(endereco);

        geraArquivo(endereco);

    }

    protected void TrataCEP(Endereco endereco) {
        this.setCep(endereco.cep());
        this.setLogradouro(endereco.logradouro());
        this.setLocalidade(endereco.localidade());
        this.setUf(endereco.uf());
    }

    public Endereco buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException ("Não consegui obter o endereço a partir desse CEP.");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "CEP: "+this.getCep()+
                " Logradouro: "+this.getLogradouro()+
                " Localidade: "+this.getLocalidade()+
                " UF: "+this.getUf();
    }
}
