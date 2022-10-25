package kpatel_homeworkwk8;

public class G_SumOfFirstLastDigit {

    public static void main(String[] args) {

        System.out.println("Sumfirstandlastdigit(252) : " + sumFirstAndLastDigit(252));
        System.out.println("Sumfirstandlastdigit(257) : " + sumFirstAndLastDigit(257));
        System.out.println("Sumfirstandlastdigit(0) : " + sumFirstAndLastDigit(0));
        System.out.println("Sumfirstandlastdigit(5) : " + sumFirstAndLastDigit(5));
        System.out.println("Sumfirstandlastdigit(-10) : " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = number % 10;
        int lastDigit = 0;
        for (int i = number; i != 0; i /= 10) {
            lastDigit = i % 10;
        }
        return firstDigit + lastDigit;
    }

}

