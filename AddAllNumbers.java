package com.javaBasics;

import java.util.Scanner;

public class AddAllNumbers {
    public static void main (String args[]) {
        int num, n, sum=0 ;
        // ask user to enter an integer value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        num = scanner.nextInt();

        while(num>0) {
            n = num%10;
            sum = sum + n;
            num = num/10;
        }
        System.out.println("The sum of the digits is" + " " + sum);

    }
}
