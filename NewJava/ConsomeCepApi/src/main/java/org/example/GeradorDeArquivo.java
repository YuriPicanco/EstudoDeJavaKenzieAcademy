package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public static void geraArquivo(Endereco endereco){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            FileWriter escrita = new FileWriter(endereco.cep()+".json");
            escrita.write(gson.toJson(endereco));

            escrita.close();
        } catch (IOException e) {

            throw new RuntimeException("Não consegui gerar o arquivo");
        }

    }
}
