package edu.pe.example.projects;

public class recursive_ejercices {
    public static void main(String[] args) {
        String a = change_word("computer", 5);
        System.out.println(a);

        String name = "vasty";
        System.out.println(name.charAt(4));
    }

    public static String change_word(String word, int longitud) {

        if (longitud == 0) {
            return word.charAt(longitud)+"";
        } else {
            return word.charAt(longitud) + (change_word(word,longitud - 1));
        }
    }
}
