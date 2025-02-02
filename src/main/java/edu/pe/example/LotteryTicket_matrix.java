package edu.pe.example;

public class LotteryTicket_matrix {

    public static void main(String[] args) {
        System.out.println("Welcome to the LotteryTicket");

        int[][] card = {
            {5, 45, 6},
            {99,23, 49},
            {12, 2, 78}
        };


        //System.out.println(card[1][0]);

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                System.out.print(card[i][j] + " ");
            }
            System.out.println();
        }
    }
}
