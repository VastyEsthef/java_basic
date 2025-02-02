package edu.pe.example;

import java.util.Scanner;

public class math_operation_scanner {
    public static void main(String[] args) {

        String user = welcome();
        System.out.println("Hi " +user +" .Enter two numbers to make matt operations");

        int[] lista = number_generated_by_user();
        int num1 = lista[0];
        int num2 = lista[1];

        // Operations
        int sum = sum_operation(num1, num2);
        int rest = rest_operation(num1, num2);
        int product = num1*num2;
        float division;
        int modulo;
        int exponent = (int)Math.pow(num1,num2);

        // Conditions
        if (num2 == 0) {
            division = 0;
            modulo = 0;
            // Print
            System.out.println("*************************");
            System.out.println("Sum: " + sum);
            System.out.println("minus: " + rest);
            System.out.println("product: " + product);
            System.out.println("exponent: " + exponent);
            System.out.println("No allowed division");
            System.out.println("No exist any module");
        } else {
            division = (float)num1/num2;
            // if num2 > num1 => modulo = num1
            modulo = num1 % num2;
            // Print
            System.out.println("*************************");
            System.out.println("Sum: " + sum);
            System.out.println("minus: " + rest);
            System.out.println("product: " + product);
            System.out.println("exponent: " + exponent);
            System.out.println("Division: " + division);
            System.out.println("Modulo: " + modulo);
        }

    }

    public static String welcome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Give me your name: ");

        return scan.nextLine();
    }

    public static int[] number_generated_by_user() {
        Scanner scan = new Scanner(System.in);

        // 1st number
        System.out.print("First number: ");
        int num1 = scan.nextInt();

        // 2nd number
        System.out.print("Second number: ");
        int num2 = scan.nextInt();

        int[] numbers = {num1,num2};

        // Close Scanner
        scan.close();

        return numbers;
    }

    public static int sum_operation(int a , int b) {
        return a + b;
    }

    public static int rest_operation(int a , int b) {
        return a - b;
    }
}
