package john;

public class Main {
    static Input input = new Input();

    public static void main(String[] args) {
        // Get the number from user
        final int number = input.getInput();

        // Check if number is negative
        if (Input.isInputNegative(number)) {
            System.out.println("Du har indtastet et negativt nummer:" + number);
            return;
        }

        Beregn beregn = new Beregn(number);
        final int sum = beregn.Sum();
        System.out.println("Summen er: " + sum);
    }

}

