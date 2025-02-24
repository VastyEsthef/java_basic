package edu.pe.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Practice {
    public static void main(String[] args) {

        // FIFO = First In First Out (Se aplica en Array List y LinkedList)
        // LIFO = Last In First Out (Se aplica en Stack)
        /*
        ARRAYLISTS
        - Clase que representa una matriz dinámica que almacena elementos
        - Hereda de la clase AbstractList
        - Permite elementos duplicados
        - Tiene índice
        - Recorre todo el arraylist para hacer un cambio (lenta manipulación)
        */
        /*
        OPERACIONES PRINCIPALES:
        - add(elemento)
        - get(indice)
        - set(indice, valor)
        - remove(indice)
        - size()
        - contains(elemento)  -> Sirve para verificar si el elemento existe
        - clear()
        */

        //---------------------- LISTA DE STRINGS ----------------------
        List<String> mascotas = new ArrayList<> ();
        mascotas.add("Tsuki");
        mascotas.add("Ninjin");
        mascotas.add("Yuki");
        mascotas.add("Bonney");

        System.out.println("-------------- FOR --------------");
        // Recorre por índice
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
        }

        System.out.println("------------ FOREACH ------------");
        // Recorrer con foreach
        for (String mascota: mascotas) {
            System.out.println(mascota);
        }


        //---------------------- LISTA DE OBJETOS ----------------------
        List<Persona> listaPersonas = new ArrayList<> ();

        listaPersonas.add(new Persona("Vasty", "Terrel", 28));
        listaPersonas.add(new Persona("Fernando", "Terrel", 19));
        listaPersonas.add(new Persona("Elena", "Villanueva", 56));

        System.out.println("-------------- FOR --------------");

        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i).getName());
        }

        System.out.println("------------ FOREACH ------------");

        for (Persona perso: listaPersonas) {
            System.out.println(perso.getName());
        }

        //---------------------- ALGUNAS OPERACIONES ----------------------
        System.out.println("------------ OPERACIONES ------------");

        System.out.println(mascotas);

        System.out.println("-------- Eliminar --------");
        // Eliminar por índice
        mascotas.remove(2); // Elimina a Yuki

        // Eliminar por valor
        mascotas.remove(String.valueOf("Tsuki"));

        // Después de eliminar
        System.out.println("Lista después de eliminar: " + mascotas);

        // Contains
        System.out.println("-------- Verificar si existe elemento --------");

        System.out.println("---- Consulta si Bonney está en la lista ----");

        if (mascotas.contains("Bonney")) {
            System.out.println("La glotona de Bonney se encuentra en la lista");
        } else {
            System.out.println("No se encontró a Bonney");
        }
    }
}

class Persona {
    String name;
    String lastName;
    int age;

    // CONSTRUCTOR
    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
