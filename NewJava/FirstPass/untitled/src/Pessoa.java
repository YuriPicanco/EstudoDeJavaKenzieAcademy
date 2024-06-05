class Pessoa extends Ser{
    void criaMain(String name2){
        Main meuMain = new Main();
        System.out.println(meuMain.name=name2);
        System.out.println(meuMain);
    }
    @Override
    public void setNome(String nome){
        this.nome = nome;
        this.criaMain(nome);
    }
}

class Ser{
    String nome;
    int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}