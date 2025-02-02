package edu.pe.example.herencia;

public class Main {
    public static void main(String[] args) {

        Padre p = new Padre();
        Hijo h = new Hijo();
        h.name = "Fernando";
        h.age = 19;
        h.caricaturaFavorita = "Sonic X";
        System.out.println("Soy el hijo y mi nombre es " + h.name + ", tengo " + h.age + " y mi programa favorito es " + h.caricaturaFavorita );


    }

}
