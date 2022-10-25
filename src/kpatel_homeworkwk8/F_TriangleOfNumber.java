package kpatel_homeworkwk8;

import java.util.Scanner;

public class F_TriangleOfNumber {

    public static void main(String[] args) {

        numberTriangle();
    }

    public static void numberTriangle() {

        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = scn.nextInt();

        scn.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

