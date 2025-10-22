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

    //Implementing instructor solution using switch case and nested String splitting
    public static String format(String fullName) {
        String[] fullNameArray = fullName.split(", ");
        String mainPart = fullNameArray[0];
        String suffix = fullNameArray.length > 1 ? fullNameArray[1] : "";

        String[] nameParts = mainPart.split(" ");

        String prefix = "", firstName = "", middleName = "", lastName = "";

        switch (nameParts.length) {
            case 4:
                prefix = nameParts[0];
                firstName = nameParts[1];
                middleName = nameParts[2];
                lastName = nameParts[3];
                break;

            case 3:
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
                break;

            case 2:
                firstName = nameParts[0];
                lastName = nameParts[1];
                break;
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }

}
