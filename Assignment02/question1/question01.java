package com.assignment02.question1;

import java.util.Scanner;

    public class question01 {

        public static int menu(Scanner sc) {
            System.out.println("---------------------------");
            System.out.println("0. EXIT");
            System.out.println("1. Dosa - 50rs.");
            System.out.println("2. Samosa - 20rs.");
            System.out.println("3. Idli - 50rs.");
            System.out.println("4. Dal/Chawal - 80rs.");


            System.out.print("Enter the choice - ");
            int choice = sc.nextInt();

            return choice;
        }

        public static void main(String[] args) {
            int choice;
            int qty;
            int amt;

            Scanner sc = new Scanner(System.in);
            while ((choice = menu(sc)) != 0) {

                switch (choice) {
                    case 1:
                        System.out.print("Enter quantity: ");
                        qty = sc.nextInt();
                        amt = 50 * qty;
                        System.out.println("Total Bill: "+ amt);

                        break;
                    case 2:
                        System.out.print("Enter quantity: ");
                         qty = sc.nextInt();
                         amt = 20 * qty;
                        System.out.println("Total Bill: "+ amt);

                        break;

                    case 3:
                       System.out.println("Enter quantity: ");
                        qty = sc.nextInt();
                        amt = 50 * qty;
                        System.out.println("Total Bill: "+ amt);

                        break;

                    case 4:
                        System.out.println("Enter quantity: ");
                        qty = sc.nextInt();
                        amt = 80 * qty;
                        System.out.println("Total Bill: "+ amt);

                        break;
                    default:
                        System.out.println("Wrong choice ... :(");
                        break;
                }
            }
        }
    }