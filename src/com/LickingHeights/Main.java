package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String userName;
        int userNumber;


        System.out.println("Hello what is your name ?");
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
            System.out.println("Your day will be HORRIBLE good luck "); // Negative 1
        }
        if (userNumber > 20 && userNumber <= 30) {
            System.out.println("Today you will meet someone. No one important just someone "); // Positive 2
        }
        if (userNumber > 30 && userNumber <= 40) {
            System.out.println("Some time soon you will step on a lego ");// Negative 2
        }
        if (userNumber > 40 && userNumber <= 50) {
            System.out.println("Today you find some money when you clean your room"); // Positive 3
        }
        if (userNumber > 50 && userNumber <= 60) {
            System.out.println("A fastfood employee will mess up your order"); // Negative 3
        }
        if (userNumber > 60 && userNumber <= 70) {
            System.out.println("You will receive 5 chicken nuggets in 4 count box "); // Positive 4
        }
        if (userNumber > 70 && userNumber <= 80 ) {
            System.out.println("You will ask for fastfood and your parents will say no"); // Negative 4
        }
        if (userNumber > 80 && userNumber <= 90 ) {
            System.out.println("You will get 98% on the test you didn't study for"); // Positive 5
        }
        if (userNumber > 90 && userNumber <= 100) {
            System.out.println("The Feds mixed up some phone #'s and now your facing 30 to life!! whoops !!"); // Negative 5
        }
        if (userNumber > 101) {
            System.out.println("You are the chosen one, a rule breaker and you will have the best luck you can imagine ");
        }


        }
        }









