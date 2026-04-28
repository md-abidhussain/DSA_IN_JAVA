package Functions;

import java.util.Scanner;

public class Sum_using_Methods {
    public static void main(String[] args) {
        //sum1();
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20,30);
        System.out.println(ans);
    }
    static void sum1(){
        Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int sum1 = num1 + num2;
            System.out.println(sum1);
        }

    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum2 = num1 + num2;
        return sum2;
    }

    // pass the value of numbers when you are calling the method in main()

    static int sum3(int a, int b){
        int sum3 = a + b;
        return sum3;
    }


}

