package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubstringsWithKFreqCharacters {
    public static boolean IsValid(HashMap<Character, Integer> map , int k){
        for(int freq : map.values()){
            if(freq >= k){
                return true;
            }
        }
        return false;
    }

    public static int Substrings(String s , int k){
        int left = 0;
         int count = 0;

         HashMap<Character , Integer> map = new HashMap<>();
         for(int right = 0; right < s.length() ; right++){
             char ch = s.charAt(right);
             map.put(ch , map.getOrDefault(ch , 0) + 1);

             while(IsValid(map, k)){
                 count += s.length() - right;

                 char leftch = s.charAt(left);
                 map.put(leftch , map.getOrDefault(leftch, 0) -1);
                 if(map.get(leftch) == 0){
                     map.remove(leftch);
                 }

                 left++;
             }
         }
         return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(Substrings(s,k));
    }
}
