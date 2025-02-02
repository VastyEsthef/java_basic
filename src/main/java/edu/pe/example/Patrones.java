package edu.pe.example;

public class Patrones {
    public static void main(String[] args) {
        //*
        //**
        //***
        //**
        //*

        int filas = 3;

        for (int i = 1; i <= filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = filas - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        //   *
        //  ***
        // *****

        //String[][] matrice = new;
        /*
        int filas = 3;
        int columnas = 5;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" ");
                if (j == 2) {
                    System.out.print("*");
                }
            }

        }
        */

    }
}
