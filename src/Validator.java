import java.util.Scanner;

public class Validator {
    private static Scanner scan = new Scanner(System.in);

    public static boolean userContinue() {
        boolean isValid = false;

        System.out.println("Do you want to enter another number? y/n");

        do {
            String cont = scan.nextLine();

            if (cont.equalsIgnoreCase("y")) {
                isValid = true;
            } else if (cont.equalsIgnoreCase("n")) {
                return isValid;
            } else {
                System.out.println("Please enter 'y' to continue or 'n' to quit!");
            }
        } while (!isValid);

        return isValid;
    }

    public static int getInteger() {
        boolean isValid = false;
        int num = 0;
        do {

            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num > 0) {
                    isValid = true;
                } else {
                    System.out.println("Please enter a positive Integer!");
                }
            } else {
                System.out.println("Please enter a positive Integer!");
                scan.nextLine();
            }
        } while (!isValid);

        return num;
    }
}
