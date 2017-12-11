package com.brainacad.oop.teststring5.testregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] names = {"VOVA", "Ivan", "R2d2", "ZX", "Ar", "Anna", "12345", "ToAd", "TomCat", " "};
        for (String name : names) {
            System.out.println(name + " - " + checkPersonWithRegExp(name));
        }
    }
}
