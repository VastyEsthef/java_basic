package edu.pe.example;

public class Example_array {
    public static void main(String[] args) {
        //System.out.println("Welcome to our Zombie Game!");

        //String[] backpack = {"shotgun", "rifle", "sniper"};
        //String[] zombies = {"near", "far", "too far"};
        //String name = "vasty";

        //System.out.println(backpack[0]);

        //System.out.println(name);
        //System.out.println(name );

        // What's the result of N1 y N2 after finish execute
        // Example Nº1
        /*
        int[] lista = {10,9,-8,2,3,100,3};

        int N1 = lista[0];
        int N2 = lista[0];

        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > N1) {
                N1 = lista[i];
            }
            if (lista[i] < N2) {
                N2 = lista[i];
            }
        }
        System.out.println(N1 +", " +N2);

        */

        // Example Nº2
        int num[]  = {10,-2,8,  2, 1,30};

        int i;
        int temp;

        for (int j = 0; j < num.length -1; j++) {
            for (i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i+1]) {
                    temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }

            }
        }

        System.out.println(num[0] + "& " + num[num.length-1]);
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);


    }
}
