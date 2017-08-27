import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter a number: ");
        int userNum = scan.nextInt();

        int sum = getCubedSum(userNum);

        if (sum == userNum){
            System.out.println(true);
            System.out.println(sum + " is equal to the number you entered!");
        }else{
            System.out.println(false);
            System.out.println(sum + " is not equal to the number you entered!");
        }
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
