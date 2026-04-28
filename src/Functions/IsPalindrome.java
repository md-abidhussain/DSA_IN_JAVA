package Functions;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        boolean result = isPalindrome(num);
        System.out.println(result);
    }


    static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;

        while (n > 0 ) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
       /* if (reverse == original) {
            return true;
        }*/

    return (reverse == original);
    }
}
