package kpatel_homeworkwk8;

import java.util.Scanner;

public class I_FebonacciSeries {

    public static void main(String[] args) {

        int num, firstNum = 1, secondNum = 1;
        System.out.println("Enter number: ");
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        System.out.println("Fibonacci Series till " + num + " terms:");
        scn.close();

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstNum + "  ");

            // compute the next term
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
