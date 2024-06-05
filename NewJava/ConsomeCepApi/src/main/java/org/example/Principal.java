package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        try{
            TelaInicial();
            ConsultaCEP consulta = new ConsultaCEP(getLeitura());
            System.out.println("Dentro do Main"+consulta);

        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
    public static void TelaInicial(){
        System.out.println("""
                ***********************************
                Consulte seu CEP pra eu te hackear
                ***********************************
                """);
    }


    private static String getLeitura() {
        Scanner leitura = new Scanner(System.in);
        return leitura.nextLine();
    }
}