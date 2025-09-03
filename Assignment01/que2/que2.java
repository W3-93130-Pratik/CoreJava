package com.assignment.que2;

import java.util.Scanner;

 public class que2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter first number:");
         if (!sc.hasNextDouble()) {
             System.out.println("Error:First number us not a double value.");
         }
         double num1 = sc.nextDouble();


             System.out.print("Enter second number:");
             if (!sc.hasNextDouble()) {
                 System.out.print("Error: Second Number is not a double value.");
             }
             double num2 = sc.nextDouble();

             double average = (num1 + num2) / 2;
             System.out.print("Average=" + average);

         }
     }


