package lab1ajd;

public class MaximumNumber {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 30;

        int maximum = (firstNumber > secondNumber) ? firstNumber : secondNumber;

        System.out.println("The maximum between " + firstNumber
                + " and " + secondNumber + " is: " + maximum);
    }
}
