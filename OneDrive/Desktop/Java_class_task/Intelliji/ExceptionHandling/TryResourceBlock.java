package com.xworkz.interfacea.nandishA.exceptionH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResourceBlock {
    public static void main(String[] args) {
        String filePath = "sample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
