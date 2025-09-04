/*
Assignment - 5 question-3 : String palindrome check
 */

import java.util.Scanner;

public class assignment0503 {
    public static void main(String[] args) {
        System.out.println("Program Starting");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check Palindrome: ");
        String inputstr = sc.nextLine();
        System.out.println("\nEntered string is: " + inputstr);
        // check palindrome - first reverse the string
        StringBuilder revstr = new StringBuilder(inputstr);
        revstr.reverse();
        // after reversing the string
        //
        if (inputstr.equals(revstr.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
