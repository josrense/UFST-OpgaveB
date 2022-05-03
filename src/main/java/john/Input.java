package john;

import java.util.Scanner;

/*
   Class to handle input from user
 */
public class Input {

       // Method to get input from user
        public int getInput() {
            final Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            final int number = input.nextInt();
            input.close();
            return number;
        }

    // Method to check if input from user is negative
    public static boolean isInputNegative(final int input) {
            if (input < 0) {
                return true;
            } else {
                return false;
            }
        }
}
