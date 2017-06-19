package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        int userNum = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;


        System.out.println("Enter a number between 0-999: ");
        userNum = scnr.nextInt();

        /* This section is great for only entering up to three digit numbers. I would like to figure out
        a way to use this process for ANY size integer...*/

            i = userNum;
            if (i < 10) {
                System.out.println("The number you entered is: " + userNum);
                d1 = i % 10;            // This iteration is for single digit integers.
            }
            else if (i < 100) {
                d1 = i % 10;
                i /= 10;
                d2 = i % 10;            // This iteration is for two digit integers.
                System.out.println("The tens digit is: " + d2);
                System.out.println("The ones digit is: " + d1);
            }
            else if (i < 1000) {
                d1 = i % 10;
                i /= 10;
                d2 = i % 10;
                i /= 10;
                d3 = i % 10;              //This iteration is for three digit integers.
                System.out.println("The hundreds digit is: " + d3);
                System.out.println("The tens digit is: " + d2);
                System.out.println("The ones digit is: " + d1);
            }
            else {
                System.out.println("Number is to large. Please enter a number between 0-999");
            }


            /* This loop works, however I would like it to have the user re-enter the integer if
            * they enter a number >= 1000*/

            //Cubes individual digits and adds them together
            sum = ((d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3));

            //Prints the total sum and true if it worked, false if it did not
            System.out.println("Summing the cube of each digit we get: " + sum);

            if (sum == userNum) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }



    }

