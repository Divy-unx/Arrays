import java.util.Scanner;

public class Prime {
        public static int countPrimes(int n) {
            if(n == 0 || n == 1){
                return 0;
            }
            int counter = 0;
            for(int i = 2; i <= n; i++){
                int count = 0;
                for(int div = 2; div * div <= i; div++){
                    if(i % div == 0){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    counter++;
                }
            }
            return counter;

        }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countPrimes(n));
    }
}
