package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 3;
        while (x >= 1){
            System.out.print(String.format("%d, ", x));
            x--;
        }
    }
}
