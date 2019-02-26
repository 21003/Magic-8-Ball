package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String userName;


        System.out.print("Hello what is your name ?");
        userName=keyboard.nextLine();
        System.out.println("Hello "+userName+" I am a Magic 8 Ball.");
        System.out.println("So");
    }
}
