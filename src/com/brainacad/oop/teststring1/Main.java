package com.brainacad.oop.teststring1;

import java.util.Arrays;

public class Main {
    static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String myStr = "abracadabra";
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println("First 'ra':" + myStr.indexOf("ra"));
        System.out.println("First 'ra':" + myStr.lastIndexOf("ra"));
        System.out.println("First 'ra':" + myStr.substring(3, 7));
        System.out.println("Reversed:" + reverseString("abcdef"));
    }
}