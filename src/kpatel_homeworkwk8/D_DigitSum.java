package kpatel_homeworkwk8;

public class D_DigitSum {
    public static void main(String[] args) {
        sumDigit(125);
        sumDigit(999);
        sumDigit(-5);
        sumDigit(0);
        sumDigit(42);
    }

    public static void sumDigit(int number) {
        long sum;
        if (number < 10) {
            System.out.println(-1);
        } else {
            for (sum = 0; number != 0; number = number / 10) {
                sum = sum + number % 10;
            }
            System.out.println("Sum of digits: " + sum);

        }
    }
}
