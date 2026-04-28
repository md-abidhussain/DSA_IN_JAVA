package Functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean result = isPrime(number);
        System.out.println(result);
    }



    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n ; i++ ){
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }
}
