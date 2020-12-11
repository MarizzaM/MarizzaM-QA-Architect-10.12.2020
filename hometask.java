package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// 1
        System.out.println("1. input two int numbers from the user a, b; print a > b, or a < b or a == b");
        System.out.print("Please enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter number b: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println(String.format("%d > %d", a, b));
        } else  if (a < b){
            System.out.println(String.format("%d < %d", a, b));
        } else {
            System.out.println(String.format("%d == %d", a, b));
        }
        System.out.println(String.format("%n"));

// 2
        System.out.println("2. write a loop which prints all the numbers from 5 to 10");
        int num = 5;
        while (num <= 10) {
            System.out.print(String.format("%d ", num));
            num++;
        }
        System.out.println(String.format("%n"));
// 3
        System.out.println("3. write a loop which inputs a number from the user until a number bigger than 100 is given");
        System.out.println("Please enter number");
        num = scanner.nextInt();
        while (num <= 100){
            System.out.println("Try again");
            num = scanner.nextInt();

        }
        System.out.println("Entered number bigger than 100");
        System.out.println(String.format("%n"));
// 4
        System.out.println("4. *etgar: print all the even numbers from 4 to 100.");
        num = 4;
        while (num <= 100){
                System.out.print(String.format("%d ", num));
                num += 2;
        }
        System.out.println(String.format("%n"));
// 5
        System.out.println("5. *etgar: input two numbers from the user until the two numbers are the same");
        System.out.print("Please enter number a: ");
        a = scanner.nextInt();
        System.out.print("Please enter number b: ");
        b = scanner.nextInt();

        while (a!=b){
            System.out.println("Try again");
            System.out.print("Please enter number a: ");
            a = scanner.nextInt();
            System.out.print("Please enter number b: ");
            b = scanner.nextInt();

        }

        System.out.println("Entered same numbers!");
    }
}
