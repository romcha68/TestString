package com.brainacad.oop.teststring3;

import java.util.Arrays;

public class Main {
    static char[] uniqueChar(String s) {
        StringBuffer uniqueChars = new StringBuffer("");
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueChars.append(s.charAt(i));
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println("Unique:" + Arrays.toString(uniqueChar(myStr)));
    }
}
