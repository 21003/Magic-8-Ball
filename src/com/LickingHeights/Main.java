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
            System.out.println("Your day will be HORRIBLE good luck "); // Negative 1
        }
        if (userNumber > 20 && userNumber <= 30) {
            System.out.println("Today you will meet someone. No one important just someone "); // Positive 2
        }
        if (userNumber > 30 && userNumber <= 40) {
            System.out.println("Some time soon you will step on a lego ");// Negative 2
        }
        if (userNumber > 40 && userNumber <= 50) {
            System.out.println("Today you find some money when you clean your room");//Postive 3
        }
        if (userNumber > 50 && userNumber<=60) {
            System.out.println("A fastfood employee will mess up your order");//Negative 3
        }

        }
        }









