package com.brainacad.oop.teststring4.teststokenizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myStr = "This is string, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer stringTokenizer = new StringTokenizer(myStr, " ,.");
        while (stringTokenizer.hasMoreElements()) {
            System.out.print(stringTokenizer.nextElement() + " - ");
        }
    }
}
