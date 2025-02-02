package edu.pe.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class current_time {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy");
        System.out.println(dateFormat.format(currentDate));
    }
}
