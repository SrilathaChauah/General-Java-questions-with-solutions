package com.javaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class MonthName
{
        public static void main(String args[])
        {

            Scanner myObj = new Scanner(System.in);

            // ask the user to enter the MonthNumber
            System.out.println("Enter the MonthNumber: ");
            int MonthNumber = myObj.nextInt();
            /* This is how to declare HashMap */
            HashMap<Integer, String> hmap = new HashMap<Integer, String>();

            /*Adding elements to HashMap*/
            hmap.put(1, "January");
            hmap.put(2, "February");
            hmap.put(3, "March");
            hmap.put(4, "April");
            hmap.put(5, "May");
            hmap.put(6, "June");
            hmap.put(7, "July");
            hmap.put(8, "August");
            hmap.put(9, "September");
            hmap.put(10, "October");
            hmap.put(11, "November");
            hmap.put(12, "December");

            if (hmap.containsKey(MonthNumber)) {
                System.out.println(hmap.get(MonthNumber));}
            else {
                System.out.println("Invalid month");}
        }
    }
