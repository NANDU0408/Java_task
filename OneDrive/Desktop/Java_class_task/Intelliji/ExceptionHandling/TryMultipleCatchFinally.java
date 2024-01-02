package com.xworkz.interfacea.nandishA.exceptionH;

public class TryMultipleCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Trying to perform an operation that might throw exceptions...");
            int result = divideByZero(numbers); // Method that might throw exceptions
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    public static int divideByZero(int[] numbers) {
        return numbers[5] / 0;
    }
}
