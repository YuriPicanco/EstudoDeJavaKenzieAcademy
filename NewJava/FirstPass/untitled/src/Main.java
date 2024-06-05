import java.sql.SQLOutput;

public class Main {
    public String name;
    private int salary;

    public static void main(String[] args) {
        Pessoa meuSerAnimal = new Pessoa();
        meuSerAnimal.setIdade(15);
        meuSerAnimal.setNome("Yuri");
        System.out.println("Idade: "+meuSerAnimal.getIdade());
    }
}