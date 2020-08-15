package com.javaBasics;

import java.math.BigInteger;
import java.util.Scanner;

public class UpperToLower {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        // ask the user to enter the character
        System.out.println("Enter your character: ");
        String c = scan.next();
        char result;
        // check if the character is upper case or lower case
        if(c.charAt(0) >= 'a' && c.charAt(0) <= 'z') {
            result = (char)(c.charAt(0) - 26);
            System.out.println(c.charAt(0));
        }
        else if(c.charAt(0) >= 'A' && c.charAt(0) <= 'Z') {
            result = (char)(c.charAt(0) + 26);
            System.out.println(c.charAt(0));
        }

}
}
