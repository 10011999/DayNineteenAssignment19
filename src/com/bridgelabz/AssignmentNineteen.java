package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentNineteen {
    public static void main(String[] args) {
            AssignmentNineteen pattern = new AssignmentNineteen();
            pattern.firstName();

        }
    public static void firstName() {
        System.out.println("=== Name ====");
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher1 = pattern1.matcher("Aditya");
        if (matcher1.find())
            System.out.println("valid Name");
        else
            System.out.println("invalid Name");

    }
}
