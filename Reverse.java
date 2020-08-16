package com.javaBasics;

import java.util.Scanner;

public class Reverse {
    public static void main (String args[])
    {
        int num, rev = 0, digit;

        // ask user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        while(num!=0)
        {
            digit = num%10;
            rev = rev * 10 + digit;
            num = num/10;
        }

        System.out.println("The reverse is" + " " + rev);
    }

}
