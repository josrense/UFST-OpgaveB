package john;

/**
 * Class to find sum
 *
 * 1) Gets the input number
 * 2) Calculates the sum
 */
public class Beregn {

    private int number;

    public  Beregn(int number) {
        this.number = number;
    }

    /**
     * Invoke the sum calculation of the all digits below this.number - 1
     * if divisiable by either 5 or 7. Count only once if divisable by both
     * 5 and 7.
     */
    public int Sum() {
        int sum = 0;

        // Run through all numbers
        for (int i = 0; i < number; i++) {
            // Only add if divisible either by 5 or 7, Not both
            if (this.isInputDivisibleByX(5, i)) {
                sum = sum + i;
            } else if (this.isInputDivisibleByX(7, i)) {
                    sum = sum + i;
                }
            }
        return sum;
    }

    // Check if input is divisible by x
    private boolean isInputDivisibleByX(final int x, final int input) {
        if (input%x == 0) {
            return true;
        } else {
            return false;
        }
    }
}
