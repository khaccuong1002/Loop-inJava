package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        for ( int i = 1; i < 1000; i++) {
            if (count < numbers) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                     N++;
                }
                if (N == 2) {
                    System.out.println(i);
                    count++;
                }
                N = 0;
            } else {
                break;
            }
        }
    }
}