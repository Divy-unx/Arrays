package Greedy;
import java.util.Arrays;
import java.util.Scanner;

public class BoatToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        int i = 0;
        int j = people.length - 1;

        Arrays.sort(people);

        while(i <= j){
            if(people[j] + people[i] <= limit){
                i++;
                j--;
            }else{
                j--;
            }

            boatCount++;
        }

        return boatCount;
    }
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int limit = scanner.nextInt();
        System.out.println(numRescueBoats(nums, limit));
    }
}
