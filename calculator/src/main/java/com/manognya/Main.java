package com.manognya;

import java.util.Scanner;

import static com.manognya.Calculator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice, flag = 0;
        double input_num;

        System.out.println("------------Scientific Calculator--------------");
        while (flag == 0) {
            System.out.println("Choose an option from the menu:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm - base e");
            System.out.println("4. Power function");
            System.out.println("5. Exit");
            System.out.println("Enter your choice(number): ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choice is square root");
                    System.out.print("Enter Number: ");
                    double sqrt = scan.nextDouble();
                    System.out.println("Square root of " + sqrt + " : " + SquareRoot(sqrt));
                    break;

                case 2:
                    System.out.println("Choice is Factorial");
                    System.out.print("Enter Number: ");
                    int fact = scan.nextInt();
                    System.out.println("Factorial of " + fact + " : " + Factorial(fact));
                    break;

                case 3:
                    System.out.println("Choice is Natural Logarithm");
                    System.out.print("Enter Number: ");
                    double ln = scan.nextDouble();
                    System.out.println("Natural Log of " + ln + " : " + NaturalLog(ln));
                    break;

                case 4:
                    System.out.println("Choice is Power");
                    System.out.print("Enter Base: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter Exponent: ");
                    double exponent = scan.nextDouble();
                    System.out.println(base + " power " + exponent + " : " + Power(base, exponent));
                    break;

                case 5:
                    flag = 1;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }


}