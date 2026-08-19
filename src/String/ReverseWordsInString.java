package String;

import java.util.Scanner;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(' ');
        }

        return sb.toString().trim();
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(reverseWords(string));
    }
}



