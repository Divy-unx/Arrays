package String;

import java.util.Scanner;

public class StringCompression1 {
    public static String Compression1(String str){
        StringBuilder s = new StringBuilder(str.charAt(0) + "");

        for(int i = 1 ; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr != prev){
                s.append(curr);
            }
        }
        return s.toString();
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Compression1(str));
    }
}
