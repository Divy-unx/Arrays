package String;

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while(left <= right){

            if( s.charAt(left)== s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;


    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(isPalindrome(string));
    }
}
