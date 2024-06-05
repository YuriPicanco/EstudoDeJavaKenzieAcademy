package br.com.podfi.principal;

import br.com.podfi.modelos.Musica;

public class Principal {

    public static void main(String[] args){
        Musica minhaMusica = new Musica("Matrix");
        minhaMusica.setTitulo("Matrix");
        minhaMusica.setCantor("Bruno Moy");
        minhaMusica.setGenero("Techno");

        for(int i=0; i< 1000; i++){
            if(minhaMusica.getTotalCurtidas() < 100)
                minhaMusica.setTotalCurtidas(1);
            else
                minhaMusica.setTotalReproducoes(1);
        }

        System.out.println(minhaMusica.getClassificacao());
        System.out.println(minhaMusica);
    }
}

