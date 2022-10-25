package kpatel_homeworkwk8;

import java.util.Scanner;
public class A_ReadingUserInputChallenge {

    public static void main(String[] args) {

    A_ReadingUserInputChallenge obj = new A_ReadingUserInputChallenge();
    obj.sumOfAllNumber();

    }
    public void sumOfAllNumber() {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.print(" Enter number # " + count + " : ");

            boolean verifyNumber = scan.hasNextInt();
            if (verifyNumber) {
                int n = scan.nextInt();
                sum += n;
                count++;

            } else {
                System.out.println("This is Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("Sum of all the numbers = " + sum);
        scan.close();
    }

}
