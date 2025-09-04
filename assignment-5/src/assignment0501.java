/*
Assignment -5 qusetion-1: Exception creation
 */

import java.util.Scanner;

public class assignment0501 {
    public static void main(String[] args) {
        System.err.println("Program starts...");
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Enter a string: ");
        string = sc.nextLine();
        System.out.println(" \nYou entered: " + string);
        int strlen = string.length();
        System.out.println("\n\nLength of string: " + strlen);

        //custom defining of exception
        class StringTooLongException extends Exception {
            public StringTooLongException(String message) {
                super(message);
            }
        }

        //actual exception implementation
        try {
            if (strlen > 80)
                throw new StringTooLongException("String length exceeds 80 characters");
            System.out.println("String length is within the limit.");
        } catch (StringTooLongException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
