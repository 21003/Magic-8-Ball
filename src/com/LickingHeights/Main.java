package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String userName;
        int userNumber;


        System.out.print("Hello what is your name ?");
        userName = keyboard.nextLine();
        System.out.println("");
        System.out.println("Hello " + userName + " I am a Magic 8 Ball.");
        System.out.println("");
        System.out.println("If you give me numbers I can tell you an");
        System.out.println("outlook I see.");
        System.out.println("So can you give me a number between 1-100.");
        userNumber = keyboard.nextInt();
        if (userNumber <= 10) {
            System.out.println("You will have a very lucky day "); // Positive 1
        }
        if (userNumber > 10 && userNumber <= 20) {

            System.out.println("Your day will be HORRIBLE good luck ");
        }
        
    }
}






