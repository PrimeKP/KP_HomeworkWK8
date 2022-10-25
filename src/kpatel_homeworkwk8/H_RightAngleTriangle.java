package kpatel_homeworkwk8;

import java.util.Scanner;

public class H_RightAngleTriangle {

    public static void main(String[] args) {

        rightAngleTriangle();

    }

    public static void rightAngleTriangle() {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = scn.nextInt();

        scn.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}

