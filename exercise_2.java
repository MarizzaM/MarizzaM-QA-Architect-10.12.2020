package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        System.out.println("Please guessed this number");
        int guess = scanner.nextInt();
        while (guess != 77){
            guess = scanner.nextInt();
            count++;
        }
        System.out.println("Correst !!! 77 was the lucky number");
        System.out.println(String.format("%d guesses", count));
        System.out.println("bye");
    }
}
