package com.javaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class colorCode {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // ask the user to enter the color code
        System.out.println("Enter the Color Code: ");
        char Code = scanner.next().charAt(0);
        HashMap<Character, String> hmap = new HashMap<Character, String>();

            /*Adding elements to HashMap*/
            hmap.put('R', "Red");
            hmap.put('B', "Blue");
            hmap.put('G', "Green");
            hmap.put('O', "Orange");
            hmap.put('Y', "Yellow");
            hmap.put('W', "White");

            if (hmap.containsKey(Code)){
                System.out.println(hmap.get(Code));
            } else {
                System.out.println("Invalid code");
            }
    }
}

