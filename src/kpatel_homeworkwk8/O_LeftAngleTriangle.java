package kpatel_homeworkwk8;

import java.util.Scanner;

public class O_LeftAngleTriangle {

    public static void main(String[] args) {

        starTriangle();
    }

    public static void starTriangle() {
        int a, b, k;
        System.out.print("Please enter any number: ");
        Scanner scn = new Scanner(System.in);
        k = scn.nextInt();

        scn.close();

        for (a = 0; a < k; a++) {
            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }

            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
