package br.com.carro;

import java.util.stream.Stream;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    
    public <T> void print(T objPrint){

        System.out.println("\n"+objPrint);
    }

    public <T> String Brincando(T aceitoTudo){

        return aceitoTudo.toString();
    }

    public String IteraLista(Stream<String> list){

        var firstJuice = list.filter(f->f.startsWith("M")).toList();
        var firstJuiceString = firstJuice.get(0);
        return firstJuiceString.toString().toUpperCase();
        
        // var frutas = 
        // System.out.println("\n"+frutas); 

    }
}
