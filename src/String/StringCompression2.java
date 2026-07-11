package String;

import java.util.Scanner;

public class StringCompression2 {
    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        s.append(chars[0]);
        int count = 1;

        for(int i = 1 ; i < chars.length; i++){
            char curr = chars[i];
            char prev = chars[i-1];

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s.append(count);
                }
                s.append(curr);
                count = 1;
            }
        }

        if(count > 1){
            s.append(count);
        }

        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }

        return s.length();
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] chars = new char[n];
        for(int i = 0; i < chars.length; i++) {
            chars[i] = sc.next().charAt(0);
        }
        System.out.println(compress(chars));
    }
}
