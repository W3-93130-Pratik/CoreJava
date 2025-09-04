/*
Assignment - 5 question-2 : String rev
 */

import java.util.Scanner;

public class assignment0502 {
    public static void main(String[] args) {
        System.out.println("Program Starting");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String inputstr = sc.nextLine();
        System.out.println("\nEntered string is: " + inputstr);

        StringBuilder revstr = new StringBuilder(inputstr);
        revstr.reverse();
        System.out.println("Reversed string is: " + revstr);

        // extra try out brainstormings

        // System.out.println("Enter Number to check Palindrome: ");
        // int num = sc.nextInt();
        // System.out.println("Entered number is: " + num);
        // int reversedNum = 0;
        // if (num < 0) {
        // System.out.println("Negative numbers cannot be palindromes.");
        // } else {
        // while (num != 0) {
        // int digit = num % 10;
        // reversedNum = reversedNum * 10 + digit;
        // num /= 10;
        // }

        // }
        // String revstr = stringReverse(inputstr);

    }
}
