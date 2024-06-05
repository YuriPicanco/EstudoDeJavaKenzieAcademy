import java.util.Arrays;

import br.com.carro.Pessoa;
// import java.util.*; //não ideal

public class Main{
    public static void main(String[] args){
        var meuBoneco = new Pessoa(); // Cria um perfil no GTA

        var lista = Arrays.asList("Maçã", "Banana", "Cereja").stream();

        meuBoneco.setNome("Yuri DSouza"); //define o nome do boneco
        meuBoneco.setIdade(32); //define a idade do boneco
        meuBoneco.setAltura(1.77); // define a altura do boneco

        String nome = meuBoneco.getNome(); // pega o nome do boneco
        int idade = meuBoneco.getIdade(); // pega a idade do boneco
        double altura = meuBoneco.getAltura(); //pega a altura do boneco
    
        meuBoneco.print("Hello World");
        meuBoneco.print("My name is "+nome);
        meuBoneco.print("I have "+idade+" age");
        meuBoneco.print("And mido "+altura+" of altitude");
        meuBoneco.print("resultado da brincadeira: "+meuBoneco.Brincando(2+2));
        
        meuBoneco.print(meuBoneco.IteraLista(lista));


    }
}