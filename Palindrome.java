package com.javaBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main (String args[]){
        int num = 0, rev = 0, reminder, originalNum;
        originalNum = num;

        // ask user to enter an integer value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        num = scanner.nextInt();

        while(num != 0)
        {
            reminder = num % 10;
            rev = rev * 10 + reminder;
            num = num/10;
        }

        if(originalNum == rev){
            System.out.println("Number is a Palindrome");}
        else{
            System.out.println("Number is not a Palindrome");
        }
    }
}
