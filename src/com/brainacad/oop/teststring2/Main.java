package com.brainacad.oop.teststring2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.print("Unique chars in myStr1:");
        for (char letter : myStr1.toCharArray()) {
            if (myStr2.indexOf(letter) == -1) {
                System.out.print(letter);
            }
        }

    }
}
