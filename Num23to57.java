package com.javaBasics;

class Num {
    public static void main(String args[]) {
        int n = 57;
        System.out.println("Even Numbers from 23 to 57 are: ");
        for (int i = 23; i <= 57; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
