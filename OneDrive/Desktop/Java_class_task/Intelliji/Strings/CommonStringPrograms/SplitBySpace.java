package com.xworkz.interfacea.nandishA.stringExtra;

public class SplitBySpace {
    public static void main(String[] args) {
        String str = "This is my string to split by space";

        // Splitting the string by space
        String[] parts = splitBySpace(str);

        // Displaying the split parts
        System.out.println("Original string: " + str);
        System.out.println("Splitting the string by space:");
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static String[] splitBySpace(String str) {
        // Split the string by space using the split() method
        String[] parts = str.split("\\s+");
        return parts;
    }
}
