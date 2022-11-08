package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 1; i <= 6; i++){
                        for (int j = 1; j < i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print the isosceles triangle");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                default:
                    System.out.println("No choice");
            }
        }
    }
}