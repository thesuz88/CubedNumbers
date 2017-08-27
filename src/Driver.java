import java.util.Scanner;

/*
Created by Steve 8/26/17 After my boot camp was finished.
Attempted this lab again after I finished my class. I wanted to create a solution that could handle any
size integer entered and add validation classes to it.
 */


public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Please enter a number: ");
            int userNum = Validator.getInteger();

            int sum = getCubedSum(userNum);

            if (sum == userNum) {
                System.out.println(true);
                System.out.println(sum + " is equal to the number you entered!");
            } else {
                System.out.println(false);
                System.out.println(sum + " is not equal to the number you entered!");
            }
        } while (Validator.userContinue());
    }

    private static int getCubedSum(int n) {
        double sum = 0;

        while (n > 0) {

            int number = n % 10;
            n = n / 10;

            double cubedDigit = Math.pow(number, 3);
            sum = cubedDigit + sum;

        }

        return (int) sum;
    }
}
