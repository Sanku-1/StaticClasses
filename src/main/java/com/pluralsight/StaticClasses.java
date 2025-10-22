package com.pluralsight;

public class StaticClasses {
    public static void main(String[] args) {
        String testName = NameFormatter.format("Mr.", "John", "Henry", "Doe", "Jr.");
        System.out.println(testName);
    }
}
