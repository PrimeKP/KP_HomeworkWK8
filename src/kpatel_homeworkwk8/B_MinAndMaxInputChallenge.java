package kpatel_homeworkwk8;

import java.util.Scanner;

public class B_MinAndMaxInputChallenge {

    public static void main(String[] args) {

        minMax();
    }

    public static void minMax() {

        Scanner scn = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int number;
        double sum = 0;
        int amountOfNumbers = 0;
        do {
            System.out.print("Enter any number, or enter less than '0' to stop: ");
            number = scn.nextInt();
            if (number < 0) {
                break;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            sum += number;
            amountOfNumbers++;
        } while (number >= 0);

        if (amountOfNumbers > 0) {
            System.out.printf("The smallest number is: %d.%n", smallestNumber);
            System.out.printf("The largest number is: %d.%n", largestNumber);
        }

    }

}
