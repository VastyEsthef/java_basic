package edu.pe.example;

import java.util.Random;
import java.util.Scanner;

public class Magic_8_Ball {
    public static void main(String[] args) {
        System.out.println("Hello! Enter your question!:");
        // Enter a question
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        // choose a random number
        Random rand = new Random();
        int rand_number =rand.nextInt(5);
        System.out.println("Random number: "+rand_number);

        // number chosen - switch case
        switch (rand_number) {
            case 1:
                System.out.println("Be more patient");
                break;
            case 2:
                System.out.println("God is love");
                break;
            case 3:
                System.out.println("Trust yourself");
                break;
            default:
                System.out.println("Accept your destiny");
        }

        System.out.println("Game Over!");
        // Close Scanner
        scan.close();
    }

}
