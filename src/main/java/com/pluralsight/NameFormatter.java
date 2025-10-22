package com.pluralsight;

public class NameFormatter {
    String Prefix;
    String FirstName;
    String MiddleName;
    String LastName;
    String Suffix;

    private NameFormatter(){}

    public static String format(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

//    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
//        return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
//    }

    //Implementing string builder version shown by instructor
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder formatBuilder = new StringBuilder();
        formatBuilder.append(lastName).append(", ");

        if (!prefix.isEmpty()) {
            formatBuilder.append(prefix).append(" ");
        }

        formatBuilder.append(firstName);

        if (!middleName.isEmpty()) {
            formatBuilder.append(" ").append(middleName);
        }

        if (!suffix.isEmpty()) {
            formatBuilder.append(", ").append(suffix);
        }

        return formatBuilder.toString();
    }

    public static String format(String fullName) {
        StringBuilder stringFormatted = new StringBuilder();
        String[] fullNameArray = fullName.split(" ");

        for (String fullNameComponent : fullNameArray) {
            stringFormatted.append(fullNameComponent);
        }
        return stringFormatted.toString();
    }

}
