package edu.pe.example.projects;

import java.util.ArrayList;

public class fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fibo_list = new ArrayList<>();
        int cantidad = 7;
        int first_num = 0;
        int second_num = 1;

        fibo_list.add(0);
        fibo_list.add(1);

        int temp = 0;

        for (int i = 0; i < cantidad - 2; i++) {
            temp = first_num + second_num;
            first_num = second_num;
            second_num = temp;

            fibo_list.add(temp);
        }

        System.out.println(fibo_list);
    }
}
