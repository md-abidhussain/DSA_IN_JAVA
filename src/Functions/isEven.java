package Functions;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = (IsEven(num));
        System.out.println(result);
    }


    static boolean IsEven(int n){
        return (n % 2 == 0);

    }
}
