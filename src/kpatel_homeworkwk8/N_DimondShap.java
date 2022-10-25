package kpatel_homeworkwk8;

import java.util.Scanner;

public class N_DimondShap {

    public static void main(String[] args) {

        palindrome();
    }

    public static void palindrome() {

        int a;
        int b;
        int c;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner scn = new Scanner(System.in);
        c = scn.nextInt();
        scn.close();
        for (a = 0; a <= c; a++) {
            for (b = 1; b <= c - a; b++)
                System.out.print(" ");
            for (b = 1; b <= 2 * a - 1; b++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (a = c - 1; a >= 1; a--) {
            for (b = 1; b <= c - a; b++)
                System.out.print(" ");
            for (b = 1; b <= 2 * a - 1; b++)
                System.out.print("*");
            System.out.print("\n");

        }

    }
}
