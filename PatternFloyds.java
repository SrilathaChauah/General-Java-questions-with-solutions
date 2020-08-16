package com.javaBasics;

import java.util.Scanner;

public class PatternFloyds
{
    public static void main (String args[])
    {
        int usersWish, num = 1, c, d;

        // ask user to enter a value of how many rows of pattern he/she wants
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row value for the pattern: ");
        usersWish = scanner.nextInt();
        for(c=1; c<=usersWish; c++)
        {
            for (d = 1; d <= c; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
