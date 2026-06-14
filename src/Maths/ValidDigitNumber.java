package Maths;

import java.util.Scanner;

public class ValidDigitNumber {
    public static boolean validDigit(int n, int x) {
        int firstDigit = n;

        while(firstDigit >= 10){
            firstDigit /= 10;
        }
        if(firstDigit == x){
            return false;
        }
        while(n > 0){
            int digit = n % 10;
            if(digit == x){
                return true;
            }
            n = n / 10;
        }

        return false;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(validDigit(n,x));
    }
}
