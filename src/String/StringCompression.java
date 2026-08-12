package String;
import java.lang.String;
import java.util.Scanner;

public class StringCompression {
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

    public static String Compression2(String str){
        StringBuilder s = new StringBuilder(str.charAt(0) + "");
        int count = 1;

        for(int i = 1 ; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s.append(count);
                    count = 1;
                }
                s.append(curr);
            }
        }

        if(count > 1){
            s.append(count);
            count = 1;
        }
        return s.toString();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Compression1(str));
        System.out.println(Compression2(str));
    }
}
